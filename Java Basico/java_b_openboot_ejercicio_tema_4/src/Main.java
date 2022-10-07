import Clases.SmartDevice;
import Clases.SmartPhone;
import Clases.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartDevice dispositivo;
        SmartDevice dispositivo2;

        dispositivo = new SmartWatch("Apple", "AppleWatch 5.0", "iOS", "21:00", "6 de Octubre 2022");
        System.out.println(dispositivo);

        dispositivo2 = new SmartPhone("Motorola", "G30","Android",128,4);
        System.out.println(dispositivo2);

    }
}