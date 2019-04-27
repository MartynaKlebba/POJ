/*
Autorzy: Aleksander Tyński
        Martyna Klebba
   Zadnie nr 1 - person
*/

public class Main {


    public static void main (String [] args)
    {
        person Olek = new person ("Aleksandra", "Gdynia");
        student Marta = new student ("Martyna", "Reda", "informatyka", 1,650);
        staff OlMart = new staff ("Aleksandra", "Reda", "PJATK",6000);
        System.out.println(Olek);
        System.out.println(Marta);
        System.out.println(OlMart);
    }
}

