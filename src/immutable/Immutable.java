package immutable;

import java.util.ArrayList;
import java.util.List;

public class Immutable {
    public static void main(String[] args) {
        List<String > skills = new ArrayList<>();
        skills.add("JAVA");
        Employee employee = new Employee(33, "Ram", skills);
        skills.add("rtryt");
        System.out.println(employee);
        System.out.println(employee);
    }
}
