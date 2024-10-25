public class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Email=" + email + ", Salary=" + salary + "]";
    }
}
