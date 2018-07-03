package jsonrpc4jep.jsonrpc4jep;

public class MyEPService implements MyEPServiceD {

    public String helloRequest(String text) {
        return text;
    }

    public String helloReceive(String text) {
        return text;
    }

    public void sendVoid() {}

    @Override
    public long sendLong(long num) {
        return num;
    }

    @Override
    public long[] sendEightLong(long[] arrayLong) {
        return arrayLong;
    }

    public Person sendPerson(Person pessoa) {
        pessoa.email = "midoriya@allmaito.com";
        return pessoa;
    }

    public Person receivePerson(Person pessoa) {
        pessoa.nome = "troxa";
        return pessoa;
    }

    /*
    public User createUser(String userName, String firstName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setPassword(password);
        database.saveUser(user);
        return user;
    }

    public User createUser(String userName, String password) {
        return this.createUser(userName, null, password);
    }

    public User findUserByUserName(String userName) {
        return database.findUserByUserName(userName);
    }

    public int getUserCount() {
        return database.getUserCount();
    }*/

}
