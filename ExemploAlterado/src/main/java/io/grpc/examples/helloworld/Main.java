package io.grpc.examples.helloworld;

import org.apache.commons.lang3.StringUtils;

public class Main {

    static HelloWorldClient client = new HelloWorldClient("localhost", 50051);
    
    public static void main(String[]args){

        try {
            /* Access a service running on the local machine on port 50051 */
            long number = Long.MAX_VALUE;
            Long[] arrayLong = {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, 
                                Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE};

            int it = 50;
            String str = "a";
            Person pessoa =  Person.newBuilder()
                                .setId(1234)
                                .setName("John Doe")
                                .setEmail("jdoe@example.com")
                                .addPhones(
                                  Person.PhoneNumber.newBuilder()
                                    .setNumber("555-4321")
                                    .setType(Person.PhoneType.HOME))
                                .build();

            System.out.println(computeVoid(it));
            System.out.println(computeLong(number, it));
            System.out.println(computeFamilyLong(arrayLong, it));
            System.out.println(computePerson(pessoa, it));
            
            for(int i = 0; i < 15; i++){
                System.out.println(computeString(StringUtils.repeat(str, (int)Math.pow(2, i)), it));
            }

        } finally {
            try{
                client.shutdown();
            } catch (InterruptedException e){
                System.out.println("Deu ruim");
            }
        }
    }

    public static long computeVoid(int it) {
        long time = 0, time1, time2;
    
        for (int i = 0; i<it; i++) {
          time1 = System.currentTimeMillis();
          client.sendVoid();
          time2 = System.currentTimeMillis();
          time += (time2 - time1);
        }
    
        time = time / it;
        return time;
    }

    public static long computeString(String text, int it) {
        long time = 0, time1, time2;
    
        for (int i = 0; i<it; i++) {
          time1 = System.currentTimeMillis();
          client.greet(text);
          time2 = System.currentTimeMillis();
          time += (time2 - time1);
        }
    
        time = time / it;
        return time;
    }
    
    public static long computeLong(long num, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
          time1 = System.currentTimeMillis();
          client.sendLong(num);
          time2 = System.currentTimeMillis();
          time += (time2 - time1);
        }
        time = time / it;
        return time;
    }

    public static long computeFamilyLong(Long[] arrayLongs, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
          time1 = System.currentTimeMillis();
          client.sendEightLong(arrayLongs);
          time2 = System.currentTimeMillis();
          time += (time2 - time1);
        }
        time = time / it;
        return time;
    }

    public static long computePerson(Person pessoa, int it) {
        long time = 0, time1, time2;
        for (int i = 0; i<it; i++) {
          time1 = System.currentTimeMillis();
          client.sendPerson(pessoa);
          time2 = System.currentTimeMillis();
          time += (time2 - time1);
        }
        time = time / it;
        return time;
    }

}
