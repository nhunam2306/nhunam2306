import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class docmatran {
    public static void main(String args[]) throws FileNotFoundException {
        String url1 = "C:\\Users\\Nam\\Documents\\java\\src\\matran1.txt";
        FileInputStream fileInputStream1 = new FileInputStream(url1);
        Scanner scanner1 = new Scanner(fileInputStream1);
        try {
            while (scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
            }
        } finally {
            try {
                scanner1.close();
                fileInputStream1.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFileWithBufferedReader.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("\n");
        String url2 = "C:\\Users\\Nam\\Documents\\java\\src\\matran2.txt";
        FileInputStream fileInputStream2 = new FileInputStream(url2);
        Scanner scanner2 = new Scanner(fileInputStream2);
        try {
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
            }
        } finally {
            try {
                scanner2.close();
                fileInputStream1.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFileWithBufferedReader.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }

    }
}
