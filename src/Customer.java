public class Customer {
    //Fields
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    //Constructor
    public Customer(String firstName, String lastName, String userName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
    }
    //methods

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getUserName(){
        return userName;
    }
    public int getId() {
        return id;
    }
}
