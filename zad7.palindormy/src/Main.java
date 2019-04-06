/*
* Martyna Klebba
* Klaudia Klebba
* Zadanie 7 palindrom
* */

public class Main {

    public static void main(String[] args) {
       String pal = "kajak";
       int startPos=0;
       int endPos = pal.length() -1;

       boolean isPal = true;
       while (startPos < endPos)
       {
           String startLetter = pal.substring(startPos, startPos+1);
           String endLetter = pal.substring(endPos, endPos+1);

           if(startLetter.equals(endLetter)==false)
           {
               isPal=false;
               break;
           }
           startPos++;
           endPos--;
       }
       if (isPal==true)
       {
           System.out.println(pal + " jest palnidromem");
       }
       else
       {
           System.out.println(pal + " nie jest palindronem");
       }
    }
}
