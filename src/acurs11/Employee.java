package acurs11;

public class Employee extends Person{
    Company company;
    Integer salary;

    public Company getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee(String name, int age, HairColor hairColour, Company company, Integer salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

}
