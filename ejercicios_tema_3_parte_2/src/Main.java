public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.IncrementaPuertas();
        System.out.println(miCoche.puertas);

    }

    static class Coche{

        public int puertas=4;

        public void IncrementaPuertas(){
            this.puertas++;
        }

    }
}