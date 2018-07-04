import java.util.ArrayList;
import java.util.List;

public class ClazzRepository implements Repository{
    public List<Student> findByIds(List<String> studentIdList){
        List<Student> studentList = new ArrayList();
        if(studentIdList.contains("s10")){
            Student student = new Student();
            student.name = "张三";
            studentList.add(student);
        }
        return studentList;
    }
}
