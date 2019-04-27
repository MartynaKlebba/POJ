/*
Autorzy: Aleksander Tyński
        Martyna Klebba
   Zadnie nr 1 - person
*/

public class person {

    private String name;
    private String address;

    public person (String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress (String address)
    {
        this.address=address;
    }
    public String toString()
    {
        return "Person [imie: " + name + ", Address: " + address + "]";
    }
}
