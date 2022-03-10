import java.util.ArrayList;

public class opgave3 {
   static ArrayList<Customer> customers = new ArrayList();

    public static void main(String[]args){
        Customer customer = new Customer("Ole","Henriksen","Cream-kongen");
        Customer customer1 = new Customer("Ole","Nørregaard","Boljse-kongen");
        Customer customer2 = new Customer("Ole","Kirk","Mister");
        Customer customer3 = new Customer("Ole","Thestrup","Gøgler-kongen");
        Customer customer4 = new Customer("Ole","Lemmekø","Lemmekøllen");
        Customer customer5 = new Customer("Ole","Svane","FodreSvaner");
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        printCustomers();
    }
        //Methods
        public static void printCustomers(){
            for (Customer c:customers) {
                System.out.println(c);
            }
        }
}


