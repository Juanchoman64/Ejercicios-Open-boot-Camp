public class Reverse {

public static void main (String[] args){

    System.out.println(reverse("cadena"));

}


    public static String reverse (String texto){

        String cadenaAlReves = "";

        for(int i = texto.length()-1; i>=0; i--)
            cadenaAlReves += texto.charAt(i);

        return cadenaAlReves;
    }


}
