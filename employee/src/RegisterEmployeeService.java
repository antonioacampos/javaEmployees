public class RegisterEmployeeService {

    private Repository<String, Employee> repository;
    public RegisterEmployeeService(Repository<String, Employee> repository) {
        this.repository = repository;
    }
    public void register(Employee e){
        if (repository.findById(e.getId())==null){repository.save(e);}
        else System.out.println("Employee already registered");
    }
}
