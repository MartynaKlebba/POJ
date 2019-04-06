/*
Klaudia Klebba
Martyna Klebba
zadanie2 Item
*/

public class Main {

    public static void main(String[] args) {


        itemy Buty = new itemy("buty", "Czarne buty", 5, 150);
        System.out.println("Test wyswietli " + Buty.toString());

        itemy sukienka = new itemy("sukienka", "Czarna sukienka", 5, 150);
        System.out.println("Test wyswietli " + sukienka.getTotal());
    }
}
