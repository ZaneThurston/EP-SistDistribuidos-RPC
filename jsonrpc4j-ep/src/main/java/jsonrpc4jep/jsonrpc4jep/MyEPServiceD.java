package jsonrpc4jep.jsonrpc4jep;

public interface MyEPServiceD {

    String helloRequest(String text);
    String helloReceive(String text);
    long sendLong(long num);
    void sendVoid();
    long[] sendEightLong(long[] arrayLong);
    Person sendPerson(Person pessoa);
    Person receivePerson(Person pessoa);

    /*Person createUser(String userName, String firstName, String password);
    Person createUser(String userName, String password);
    Person findUserByUserName(String userName);
    int getUserCount();
    */


}
