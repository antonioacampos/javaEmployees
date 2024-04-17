public class FakeEmployeeRepository implements Repository{
    // private Repository<String, Employee> repository;
    private Employee[] employees;
    private String[] keys;
    private int size;
    private int capacity;

    public FakeEmployeeRepository(int capacity) {
        this.capacity = capacity;
        employees = new Employee[capacity];
        size = 0;
    }
    @Override
    public void save(Object entity) {
        if (size >= capacity ||!(entity instanceof Employee)) return;
        Employee newEmployee  = (Employee) entity;
        for (int i = 0; i < size; i++) {
            if ((employees[i].getId()).equals(newEmployee.getId())) {
                employees[i] = newEmployee;
                return;
            }
        }
        employees[size] = newEmployee;
        size++;
    }

    @Override
    public Object findById(Object id) {
        for (int i = 0; i < size; i++) {
            if ((employees[i].getId()).equals(id)) {
                return employees[i];
            }
        }
        return null;
    }
}
