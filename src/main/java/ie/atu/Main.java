package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person myFriendShawn = new Person("Shawn", "ATU Galway", "6969 420 123");
        //System.out.println(myFriendShawn);
        Customer peter = new Customer("Peter", "ATU", "123", "123123123123", false);
        System.out.println(peter.toString());


    }
}
