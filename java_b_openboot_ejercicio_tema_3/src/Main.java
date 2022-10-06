public class Main {
    public static void main(String[] args) {

        String cadena = "";

        String[] nombres = {"Juan", "Julian", "Hector", "Trinidad"};



        for (String nombre : nombres){

            int i =0;

            while (i < nombres.length){
                cadena += nombre;
                break;
            }
            cadena += " ";
        }

        System.out.println(cadena);

    }
}