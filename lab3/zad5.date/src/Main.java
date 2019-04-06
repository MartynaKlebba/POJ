/*
* Autorzy      Martyna Klebba
*              Klaudia Klebba
*
* zadanie 5
* czas
* */
public class Main{
    public static void main(String[] args) {
        Time s1 = new Time(6,90,33);
        System.out.println("Czas ustawiony: "+s1.toString());
        System.out.println("Sekunda dalej: "+s1.nextSecond());
    }
}