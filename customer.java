/*
* Autorzy Martyna Klebba
*           Aleksander Ostasz
*
* zadanie5 customer
* */
public class customer {

    private int ID;
    private String name;
    private int discount;

    public customer (int ID, String name, int discount)
    {
        this.ID=ID;
        this.name=name;
        this.discount=discount;
    }
    public int getID()
    {
        return ID;
    }
    public String getname()
    {
        return name;
    }
    public int getdiscount()
    {
        return discount;
    }
    public void setdiscount(int discount)
    {
        this.discount=discount;
    }
    public String toString()
    {
        return ("name: "+name+ "(ID):"+ID);
    }
}
