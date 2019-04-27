import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("tekst.txt");
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);

    }
}