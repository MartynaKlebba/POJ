/*
* Autorzy Martyna Klebba
*           Aleksander Ostasz
*
* zadanie5 customer
* */
public class invoice {

    private int ID;
    private double amount;
    private customer customer;

    public invoice (int ID, customer customer,double amount)
    {
        this.amount=amount;
        this.ID=ID;
        this.customer=customer;
    }
    public int getid()
    {
        return ID;
    }
    public customer getcustomer()
    {
        return customer;
    }
    public void setcustomer(customer customer)
    {
        this.customer=customer;
    }
    public String getamount ()
    {
        return Double.toString(amount);
    }
    public String getcustomername()
    {
        return customer.getname();
    }
    public double getamountafterdiscount()
    {
        return amount*(1.0d-(customer.getdiscount()/100.0d));
    }
}
