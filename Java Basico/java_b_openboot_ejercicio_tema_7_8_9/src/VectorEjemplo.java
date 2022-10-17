import java.util.Vector;

public class VectorEjemplo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();

        vector.add(11);
        vector.add(22);
        vector.add(33);
        vector.add(44);
        vector.add(55);

        //Remuevo la posición 1 en memoria que en este caso sería 22
        vector.remove(1);
        //Remuevo la posición 1 en memoria que en este caso sería 33
        vector.remove(1);

        System.out.println(vector);

    }

    /*
    Resolviendo al punto 4, el problema de utilizar un Vector con capacidad por defecto es que al momento de agregar
    los 1000 registros, el Vector almacenaría un espacio en memoria mucho mayor a la cantidad que necesitamos.

    El vector arranca con 10 registros (por defecto) y va aumentando al doble la capacidad del vector es decir:
    10-> 20 -> 40 -> 80 -> 160 -> 320 -> 640 -> 1280. Tendríamos 280 espacios en memoria sin utilizar.
     */
}
