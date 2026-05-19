package prototype;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(Employee employee){
        this.id = employee.id;
        this.name = employee.name;
        this.address = new Address(employee.address);
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
