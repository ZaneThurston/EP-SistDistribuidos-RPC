package io.grpc.examples.helloworld;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class Main {

    // static HelloWorldClient client = new HelloWorldClient(ip, 50051);
    static String ip = "localhost";

    public static void main(String[]args){
       
        //define o número de iterações que serão rodadas a cada vez para cálculo da média
        int it = 25;
        //define quantas vezes a média será calculada
        int numRuns = 10;
        //define a potência 2^pot, tamanho base usado para construção de algumas mensagens
        int pot = 15;
        
        //Variáveis auxiliares para envio de informações
        long number = Long.MAX_VALUE;
        Long[] arrayLong;

        String str = "a";
        String[] nomes;

        Person pessoa = Person.newBuilder()
                              .setName("Exemplo")
                              .setEmail("exemplo@example.com")
                              .addPhones(
                                Person.PhoneNumber.newBuilder()
                                  .setNumber("555-4321")
                                  .setType(Person.PhoneType.HOME))
                              .build();

        // //Calcula média para envio de "void" e recebimento de "void"
        System.out.print("Void: ");
        for(int i = 0; i <= numRuns; i++){
            System.out.print(computeVoid(it) + ",");
        }

        //Calcula média para envio de Long e recebimento de Long
        System.out.print("\nLong: ");
        for(int j = 0; j <= numRuns; j++){
            System.out.print(computeLong(number, it) + ",");
        }

        // //Calcula média para envio de Person e recebimento de PersonReply
        System.out.print("\nPerson: ");
        for(int i = 0; i <= numRuns; i++){
            System.out.print(computePerson(pessoa, it) + ",");
        }
        
        //Calcula média para envio de um array de Person e recebimento de um array de PersonReply
        for(int i = 1; i < 17; i++){
            System.out.print("\nVarPerson " + (int)Math.pow(2, i) + ": ");
            nomes = createStringArray((int)Math.pow(2, i));
            for(int j = 0; j <= numRuns; j++){
                System.out.print(computeVarPerson(nomes, it) + ",");
            }
        }

        //Envia requisições com um array de Long (de tamanho variável em potências de 2) e recebimento de um array do mesmo tamanho
        //i MAXIMO É 18
        for(int i = 1; i <= 18; i++){
            System.out.print("\nLong " + (int)Math.pow(2, i) + ": ");
            arrayLong = createLongArray((int)Math.pow(2, i));
            for(int j = 0; j <= numRuns; j++){
                System.out.print(computeFamilyLong(arrayLong, it) + ",");
            }
        }
        
        // Envia requisições com um string (de tamanho variável em potências de 2) e recebimento de um array do mesmo tamanho
        for(int i = 1; i <= 21; i++){
            System.out.print("\nstr " +(int)Math.pow(2, i) + ": ");
            for(int j = 0; j <= numRuns; j++){
                System.out.print(computeString(StringUtils.repeat(str, (int)Math.pow(2, i)), it) + ",");
            }
        }
    }

    /**
     * Metodo para cálculo de tempo médio de um número dado de iterações.
     * @param it Numero de iterações a serem rodadas
     */

    public static long computeVoid(int it) {
        long time = 0, time1, time2;
    
        for (int i = 0; i<it; i++) {
            HelloWorldClient client = new HelloWorldClient(ip, 50051);
            time1 = System.currentTimeMillis();
            client.sendVoid();
            time2 = System.currentTimeMillis();
            time += (time2 - time1);
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }
        }
        time = time / it;
        return time;
    }

    /**
     * Metodo para cálculo de tempo médio de um número dado de iterações.
     *  @param text String a ser enviado para o servidor
     *  @param it Numero de iterações a serem rodadas
     */

    public static long computeString(String text, int it) {
        long time = 0, time1, time2;
    
        for (int i = 0; i<it; i++) {
            HelloWorldClient client = new HelloWorldClient(ip, 50051);            
            time1 = System.currentTimeMillis();
            client.greet(text);
            time2 = System.currentTimeMillis();
            time += (time2 - time1);
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }        
        }
    
        time = time / it;
        return time;
    }
    /**
     * Metodo para cálculo de tempo médio de um número dado de iterações.
     * @param num Variável long a ser enviada para o servidor
     * @param it Numero de iterações a serem rodadas
     */

    public static long computeLong(long num, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
            HelloWorldClient client = new HelloWorldClient(ip, 50051);            
            time1 = System.currentTimeMillis();
            client.sendLong(num);
            time2 = System.currentTimeMillis();
            time += (time2 - time1);
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }        
        }
        time = time / it;
        return time;
    }

    /**
     * Metodo para cálculo de tempo médio de um número dado de iterações.
     * @param arrayLongs Array composto por variáveis long
     * @param it Numero de iterações a serem rodadas
     */
    public static long computeFamilyLong(Long[] arrayLongs, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
            HelloWorldClient client = new HelloWorldClient(ip, 50051);            
            time1 = System.currentTimeMillis();
            client.sendVarLong(arrayLongs);
            time2 = System.currentTimeMillis();
            time += (time2 - time1);
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }        
        }
        time = time / it;
        return time;
    }

    /**
     * Metodo para cálculo de tempo médio de um número dado de iterações.
     * @param pessoa Variável do tipo Person
     * @param it Numero de iterações a serem rodadas
     */

    public static long computePerson(Person pessoa, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
            HelloWorldClient client = new HelloWorldClient(ip, 50051);            
            time1 = System.currentTimeMillis();
            client.sendPerson(pessoa);
            time2 = System.currentTimeMillis();
            time += (time2 - time1);
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }        
        }
        time = time / it;
        return time;
    }

    /**
     * Metodo para cálculo de tempo médio de um número dado de iterações.
     * @param nomes Array contendo nomes a serem usados para criação de objetos do tipo Person
     * @param it Numero de iterações a serem rodadas
     */
    public static long computeVarPerson(String[] nomes, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
            HelloWorldClient client = new HelloWorldClient(ip, 50051);            
            time1 = System.currentTimeMillis();
            client.sendVarPerson(nomes);
            time2 = System.currentTimeMillis();
            time += (time2 - time1);
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }        
        }
        time = time / it;
        return time;
    }


    /**
     * Cria um array do tipo long com tamanho numLongs.
     * @param numLongs Tamanho do array de saída
     */
    public static Long[] createLongArray(int numLongs){

        Long[] novoArrayLong = new Long[numLongs];

        Arrays.fill(novoArrayLong, Long.MAX_VALUE);

        return novoArrayLong;
    }
    /**
     * Cria um array do tipo String com tamanho numStrings.
     * @param numStrings Tamanho do array de saída
     */
    public static String[] createStringArray(int numStrings){

        String[] novoArrayString = new String[numStrings];

        Arrays.fill(novoArrayString, 0, numStrings/2, "Peterson");
        Arrays.fill(novoArrayString, numStrings/2, numStrings, "Marcos");

        return novoArrayString;
    }
}
