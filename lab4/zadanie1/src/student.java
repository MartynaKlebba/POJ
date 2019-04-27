/*
Autorzy: Aleksander Tyński
        Martyna Klebba
   Zadnie nr 1 - person
*/

public class student extends person {

    private String program;
    private int year;
    private double fee; //opłata

    public student (String name, String address, String program, int year, double fee)
    {
        super (name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getprogram()
    {
        return program;
    }
    public void setprogram(String program)
    {
        this.program=program;
    }
    public int getyear()
    {
        return year;
    }
    public void setyear(int year)
    {
        this.year=year;
    }
    public double getfee()
    {
        return fee;
    }
    public void setfee(double fee)
    {
        this.fee=fee;
    }
    public String toString ()
    {

        return "Student[Person"+ getName() + " address[" + getAddress() +"], program: " + getprogram() + "years: " + getyear() + "fee: " + getfee() + "]";
    }
}
