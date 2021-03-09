import entity.Employee;
import storage.DateStorge;
import storage.impl.DateStorgeImpl;

import java.util.List;


public class Test {
    public static void main(String[] args) throws Exception {

        DateStorge storge = new DateStorgeImpl();

        List<Employee> employeeList = storge.getAll();

        for(Employee employee:employeeList){
            System.out.println(employee.getName());
        }

    }
}
