import java.sql.SQLOutput;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{



    @Override
    public void save() {
        System.out.println("método save");
    }


    @Override
    public void findAll() {
        System.out.println("método findAll");;

    }

    @Override
    public void delete() {
        System.out.println("método delete");
    }
}
