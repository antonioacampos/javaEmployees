public class FindEmployeeService {
    private Repository<String, Employee> repository;
    public FindEmployeeService(Repository<String, Employee> repository) {
        this.repository = repository;
    }
    public Employee findById(String id){
        return repository.findById(id); //se o empregado for nulo, retorna nulo
        //o modo como esse nulo será tratado deve ser implementado depois
    }
}
