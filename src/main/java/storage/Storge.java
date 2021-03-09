package storage;

import entity.Employee;

import java.util.List;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 7:02 PM
 */
public interface Storge {

    void write(String fileName, Employee o);

    Employee read(String fileName,Long pos);

    List<Employee> readAll(String fileName);

}
