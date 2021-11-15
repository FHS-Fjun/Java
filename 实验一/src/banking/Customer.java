package banking;

public class Customer {
    private Account account;
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String fn, String ln, int aAge) {
        firstName = fn;
        lastName = ln;
        age = aAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        account = acct;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
