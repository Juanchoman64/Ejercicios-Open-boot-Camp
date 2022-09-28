public class Main {
    public static void main(String[] args) {

        //Ejercicio if
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es igual a 0");
        }

        //Ejercicio While
        int numeroWhile= 0;
        while (numeroWhile < 3){
        numeroWhile++;
        System.out.println(numeroWhile);
    }

        //Ejercicio DoWhile
        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile++;
        } while (numeroDoWhile>3);

        //Ejercicio For
        for (int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Ejercicio Switch
        var estacion = "VERAN";

        switch (estacion){

            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("No has ingresado una estación correcta");
        }

    }
}