package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person myFriendShawn = new Person("Shawn", "ATU Galway", "6969 420 123");
        //System.out.println(myFriendShawn);
        //Customer peter = new Customer("Peter", "ATU", "123", "123123123123", false);
        //System.out.println(peter.toString());

        /*
        Customer olamide = new Customer();
        olamide.setName("Olamide");
        olamide.setAddress("GMIT");
        olamide.setNumber("696969");
        olamide.setCustomerNumber("123235468943");
        olamide.setMailingList(false);

         */

        /*System.out.println("Name: " + olamide.getName() + " Address: " + olamide.getAddress() + " Number: "
                + olamide.getNumber() + " Customer Number: " + olamide.getCustomerNumber()
                + " Mailing List: " + olamide.isMailingList());
        System.out.println(olamide.toString());

         */

        PreferredCustomer dewan = new PreferredCustomer("Peter", "ATU", "123",
                "123123123123", false, 400);
        System.out.println(dewan.toString());

        PreferredCustomer lucas1 = new PreferredCustomer();
        lucas1.setCustomerPurchases(2000);
        System.out.println(lucas1.toString());

    }
}
