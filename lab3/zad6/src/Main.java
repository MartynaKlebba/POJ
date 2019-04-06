/*
Klaudia Klebba
Martyna Klebba
zadanie.6 ArrayList
 */

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Krysia");
        name.add("Basia");
        name.add("Mirek");
        name.add("Klaudia");
        name.add("Martyna");
        name.add("Justyna");
        name.add("Piotr");
        name.add("Zbyszek");

        List<String> salary = new ArrayList<String>();
        salary.add("2500");
        salary.add("3000");
        salary.add("3500");
        salary.add("4000");
        salary.add("4500");
        salary.add("5000");
        salary.add("5500");
        salary.add("6000");

        List<String> date = new ArrayList<String>();
        date.add("13/09/1998");
        date.add("14/05/1996");
        date.add("17/02/1980");
        date.add("22/01/1970");
        date.add("26/09/1999");
        date.add("12/07/1995");
        date.add("16/04/1994");
        date.add("03/03/1993");

        for(int i=0;i<name.size();i++){
            System.out.print(name.get(i)+ " " +salary.get(i)+" ");
            System.out.println(date.get(i));
        }

    }
}