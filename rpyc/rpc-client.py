import rpyc
import time
import Person
from math import pow


ip = "localhost"
porta = 50051

#time measuring
file = open('result - ' + str(time.time()) + '.html', 'w')

# Define quantas iterações serão rodadas para cálculo da média
num_itera = 25

# Define quantas vezes a média será calculada
num_runs = 10

#html headers
file.write("<html><head><title>Timing</title></head><body><table><tr><th>function</th><th>1st(ms)</th><th>2nd(ms)</th><th>3rd(ms)</th><th>4th(ms)</th><th>5th(ms)</th><th>6th(ms)</th><th>7th(ms)</th><th>8th(ms)</th><th>9th(ms)</th><th>10th(ms)</th></tr>")

def timing(f):
    def wrap(*args):
        file.write("<tr>")
        if len(args) > 0:
            file.write("<td>"+f.__name__+ " " + str(args[1])+"</td>")
        else:
            file.write("<td>"+f.__name__+"</td>")
        for j in range(num_runs):
            total = 0
            ret = None
            # Aqui roda as 50 vezes
            for i in range(num_itera):
                time1 = int(round(time.time() * 1000))
                ret = f(*args)
                time2 = int(round(time.time() * 1000))
                total = total + (time2 - time1)
            file.write("<td>" + str(total/num_itera) +"</td>")
        file.write("</tr>")
        return ret
    return wrap

c = rpyc.connect(ip, porta, config = {"allow_public_attrs" : True})

person_send = Person.MyPerson()
phone = Person.PhoneNumber()
person_send.name = "Example"
person_send.email = "example@example.com"

phone.type_phone = Person.PhoneType.MOBILE
phone.number = '555-0123'
person_send.phones.append(phone)   
 
LONG = 9223372036854775807
array_long = []

# Envia nada
@timing
def send_void():
    return c.root.send_void() 

# Envia long
@timing
def send_long():
    return c.root.send_long(LONG)

# Envia Person
@timing
def send_person():
    return c.root.send_person(person_send)

# Envia arrays de long de tamanhos variados
@timing
def send_var_longs(array_long_par, i):
    return c.root.send_var_longs(array_long_par)

# Envia strings de tamanhos variados
@timing
def send_string(string_mensagem_par, i):
    return c.root.send_string(string_mensagem)

# Envia arrays de Person de tamanhos variados
@timing
def send_var_person(array_person_par, i):
    return c.root.send_var_person(array_person_par)

print("INICIO DA RODADA: " + time.asctime())

print("Enviando void")
send_void()
print("Enviando long")
send_long()
print("Enviando person")
send_person()

for i in range(0, 20):
    print("Enviando array de long de tamanho " + str(2**i))
    array_long = [LONG] * (2**i)
    send_var_longs(array_long, (2**i))
for i in range(0, 20):
    print("Enviando string de tamanho " + str(2**i))
    string_mensagem = "x" * (2**i)
    send_string(string_mensagem, (2**i))
for i in range(0, 20):
    print("Enviando array de Person de tamanho " + str(2**i))
    array_person = [person_send] * (2 ** i)
    send_var_person(array_person, (2**i))

print("TÉRMINO DA RODADA: " + time.asctime())

# #Closing html tags
file.write("</table></body></html>")
file.close()