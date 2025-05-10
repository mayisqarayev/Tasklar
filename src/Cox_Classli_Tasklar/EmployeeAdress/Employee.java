package Cox_Classli_Tasklar.EmployeeAdress;

public class Employee {

    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        System.out.println(new Employee("Mayis", new Address("Sirvan", "Ordubadi")));
    }
}
