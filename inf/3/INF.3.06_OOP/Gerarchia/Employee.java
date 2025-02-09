public class Employee extends Person {
    private double salary;

    public Employee(String first, String second, String birth, double salary) {
        super(first, second, birth);
        this.salary = salary;
    } 

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - €" + this.salary ; 
    }
}
