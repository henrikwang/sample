import java.util.ArrayList;
import java.util.List;

public class Clazz {
    String name;
    List<Student> studentList = new ArrayList();

    public static Clazz create(String name, List<String> studentIdList, LoadByIds<Student> loadByIds){
        Clazz clazz = new Clazz();
        clazz.name = name;
        List<Student> studentList = loadByIds.apply(studentIdList);
        clazz.studentList = studentList;
        return clazz;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
