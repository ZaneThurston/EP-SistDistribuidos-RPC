package jsonrpc4jep.jsonrpc4jep;

public interface MyEPServiceD {

    void HelloRequest(String text);
    void sendLong(long num);
    void sendVoid();
    void sendEightLong(Long[] arrayLong);
    Person sendPerson(Person pessoa);


}
