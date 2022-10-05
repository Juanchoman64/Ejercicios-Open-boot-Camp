import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LlamarPrecio(130000);

    }

    public static void LlamarPrecio(int precio){
        System.out.println("El precio del producto con IVA es de "+precio * 1.19);
    }
}