/*
Autorzy: Aleksander Tyński
        Martyna Klebba
   Zadnie nr 1 - person
*/
public class staff extends person {

    private String school;
    private double pay;

    public staff (String name, String address, String school, double pay)
    {
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    public String getschool()
    {
        return school;
    }
    public void setschool(String school)
    {
        this.school=school;
    }
    public double getpay()
    {
        return pay;
    }
    public void setpay(double pay)
    {
        this.pay=pay;
    }
    public String toString()
    {
        return "Staff [ Person name: " + getName() + "address: " + getAddress() + "school: " + school + "pay: " + pay + "]";
    }
}
