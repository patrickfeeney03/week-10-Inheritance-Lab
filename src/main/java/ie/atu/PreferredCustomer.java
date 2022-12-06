package ie.atu;

public class PreferredCustomer extends Customer {
    private int customerPurchases;
    private int customerDiscout;

    public PreferredCustomer() {
    }

    public PreferredCustomer(String name, String address, String number, String customerNumber,
                             boolean mailingList, int customerPurchases) {
        super(name, address, number, customerNumber, mailingList);
        this.customerPurchases = customerPurchases;

        if (customerPurchases >= 2000) {
            customerDiscout = 10;
        } else if (customerPurchases >= 1500) {
            customerDiscout = 7;
        } else if (customerPurchases >= 1000) {
            customerDiscout = 6;
        } else if (customerPurchases >= 500) {
            customerDiscout = 5;
        } else {
            customerDiscout = 0;
        }
    }

    public int getCustomerPurchases() {
        return customerPurchases;
    }

    public void setCustomerPurchases(int customerPurchases) {
        this.customerPurchases = customerPurchases;
        if (customerPurchases >= 2000) {
            setCustomerDiscout(10);
        } else if (customerPurchases >= 1500) {
            setCustomerDiscout(7);
        } else if (customerPurchases >= 1000) {
            setCustomerDiscout(6);
        } else if (customerPurchases >= 500) {
            setCustomerDiscout(5);
        } else {
            setCustomerDiscout(0);
        }
    }

    public int getCustomerDiscout() {
        return customerDiscout;
    }

    public void setCustomerDiscout(int customerDiscout) {
        this.customerDiscout = customerDiscout;
    }

    @Override
    public String toString() {
        return super.toString() + ", customerPurchases='" + customerPurchases + '\'' +
                ", customerDiscout='" + customerDiscout + '\'';
    }
}
