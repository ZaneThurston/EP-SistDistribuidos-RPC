package jsonrpc4jep.jsonrpc4jep;

public class Person {

    String nome;
    int id;
    String email;

    enum TipoTel {MOBILE, HOME, WORK};

    private class PhoneNum {
        public String number;
        public TipoTel tipo;
    }

    public Person() {

    }


}
