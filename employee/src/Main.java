import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FakeEmployeeRepository repository = new FakeEmployeeRepository(50);
        RegisterEmployeeService registerService = new RegisterEmployeeService(repository);
        FindEmployeeService findService = new FindEmployeeService(repository);

        Employee employee01 = new Employee("001", "Antonio Campos", "Front-end Dev", 9090.90, LocalDate.of(2005, 4, 21));
        registerService.register(employee01);

        Employee employee07 = new Employee("007", "AAugusto", "Secret Agent", 1.50, LocalDate.of(2021, 4, 15));
        registerService.register(employee07);

        Employee found = findService.findById("007");
        System.out.println("The secret agent is: " + found.getName());
    }
}
