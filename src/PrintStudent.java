import MODEL.Student;

public class PrintStudent {

    public static void main(String[] arg){
        Student student = new Student("h",12,true,"2222");
        System.out.println(student.toString());
    }
}
