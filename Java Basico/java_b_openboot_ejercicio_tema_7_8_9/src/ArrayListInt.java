import java.util.ArrayList;

public class ArrayListInt {

    public static void main(String[] args) {

        int num = 10;
        ArrayList<Integer> arrayListInteger = new ArrayList<>();


        for (int i = 1; i <= num;i++){
            arrayListInteger.add(i);
        }

        for (int i = 0; i < arrayListInteger.size() ; i++){

            if (i % 2 == 0);
            arrayListInteger.remove(i+1);
        }

        System.out.println(arrayListInteger);

    }
}
