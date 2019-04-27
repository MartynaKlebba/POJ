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
<<<<<<< HEAD
        palindromy zdanie2 = new palindromy ("Muzo raz daj jad za rozum");
        palindromy zdanie3 = new palindromy ("Wody zal dla zydow");
=======
        palindromy zdanie2 = new palindromy ("muzorazdajjadzarozum");
        palindromy zdanie3 = new palindromy ("wodyzaldlazydow");
>>>>>>> e66d262e1cc6a25c51389b9c479d1d046b1acb07

        System.out.println(zdanie1.getPalindrom()+ " "+zdanie1.check());
        System.out.println(zdanie2.getPalindrom()+ " "+zdanie2.check());
        System.out.println(zdanie3.getPalindrom()+ " "+zdanie3.check());
    }
}
