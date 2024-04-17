import java.time.LocalDate;

public class Employee {
    private String id;
    private String name;
    private String jobTitle;
    private double salary;
    private LocalDate dateOfEmployment;

    // Constructor
    public Employee(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public final double getYearsOfService(){
        return LocalDate.now().getYear() - dateOfEmployment.getYear();
    }
    public final double calculateBonus(){
        return salary * (1 + getYearsOfService() * 0.1);
    }
}
