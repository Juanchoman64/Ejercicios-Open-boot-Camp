import java.io.*;
import java.sql.SQLOutput;

public class Ficheros {

    public static void main(String[] args) {
        try {
            InputStream fileIn= new FileInputStream("C://miFichero.txt");
            byte[]datos = fileIn.readAllBytes();

            PrintStream fileOut = new PrintStream("C://destino.txt");
            fileOut.write(datos);

        } catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }

}
}