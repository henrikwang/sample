import com.google.common.collect.Lists;

import java.util.List;

public class ClazzController {
    ClazzRepository clazzRepository = new ClazzRepository();

    public static void main(String[] args){
        new ClazzController().createClazz();
    }

    public Clazz createClazz(){
        Clazz clazz = Clazz.create("", Lists.newArrayList("s10", "s11"), (studentIds) -> {
            List<Student> studentList = clazzRepository.findByIds(studentIds);
            return studentList;
        });
        System.out.println(clazz);
        return clazz;
    }

}
