package functionalinterface;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student() {
            @Override
            public void say(String name) {
                System.out.println("Student name is " + name);
            }
        };

        Student st = name -> System.out.println("Student name is " + name);

        student.say("Kuldeep");
        st.say("Singh");
    }
}
