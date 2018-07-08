import rpyc
import json
import Person
from random import randint
port = 50051

class MyService(rpyc.Service):
    def on_connect(self, conn):
        pass

    def on_disconnect(self, conn):
        pass

    # operação sem argumentos e sem valor de retorno
    def exposed_send_void(self): 
        pass

    # operação com um argumento long e valor de retorno long 
    def exposed_send_long(self, number): 
        number -= number/randint(1, 5)
        return number

    # operação com oito argumentos long e valor de retorno long 
    def exposed_send_var_longs(self, n1): 
        for number in n1:  
            number -= number/randint(1, 5)
        return n1

    # operação com um argumento String e valor de retorno String
    def exposed_send_string(self, string):
        return "Hello " + string 

    # operação com um argumento Person e valor de retorno PersonReply
    def exposed_send_person(self, person_received):
        person_reply = Person.PersonReply()
        person_reply.id = randint(1,10000)
        person_reply.name = person_received.name
        person_reply.stat = Person.Status.CADASTRADO
        return person_reply 

    # operação com um argumento Person e valor de retorno PersonReply
    def exposed_send_var_person(self, array_person):
        array_reply = []
        for person in array_person:
            person_reply = Person.PersonReply()
            person_reply.id = randint(1,10000)
            person_reply.name = person.name
            person_reply.stat = person.Status.CADASTRADO
            array_reply.append(person_reply)
        return array_reply 

if __name__ == "__main__":
    from rpyc.utils.server import ThreadedServer
    print("Iniciando servidor...")
    t = ThreadedServer(MyService, port=port, protocol_config = {"allow_public_attrs" : True})
    print("Servidor aberto")
    t.start()