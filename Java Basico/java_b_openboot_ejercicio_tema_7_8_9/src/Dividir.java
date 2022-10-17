public class Dividir {

    public static void main(String[] args) {

        try {
            dividePorCero(4,0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }


    }

    public static int dividePorCero (int A, int B) throws  ArithmeticException {

        int resultado = 0;

        try {
            resultado = A/B;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }

}
