/*
* Autorzy: Klaudia Klebba
*           Martyna Klebba
*
* palindromy zadanie 7
*
* */
public class Main {

    public static void main(String[] args) {
        palindromy zdanie1 = new palindromy ("Atak kata");
        palindromy zdanie2 = new palindromy ("muzorazdajjadzarozum");
        palindromy zdanie3 = new palindromy ("wodyzaldlazydow");

        System.out.println(zdanie1.getPalindrom()+ " "+zdanie1.check());
        System.out.println(zdanie2.getPalindrom()+ " "+zdanie2.check());
        System.out.println(zdanie3.getPalindrom()+ " "+zdanie3.check());
    }
}
