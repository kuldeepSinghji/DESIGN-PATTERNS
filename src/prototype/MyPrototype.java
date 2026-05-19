package prototype;

public class MyPrototype {
    public static void main(String[] args) {
        Employee employee = new Employee(234, "Kuldeep Singh", new Address("BLR"));

        System.out.println(employee);

        Employee employee1 = new Employee(employee);
        System.out.println(employee1);

    }
}
