import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {

    public static void main(String[] args) {

        ArrayList<String> arrayListString = new ArrayList<>();

        arrayListString.add("Juan");
        arrayListString.add("Julian");
        arrayListString.add("Hector");
        arrayListString.add("Trinidad");

        for (String lista : arrayListString){
            System.out.println(lista);
        }


        LinkedList<String> linkedListString = new LinkedList<>();

        linkedListString.add("Juan");
        linkedListString.add("Julian");
        linkedListString.add("Hector");
        linkedListString.add("Trinidad");

        for (String listaEnlazada : linkedListString){
            System.out.println(listaEnlazada);
        }

    }
}
