package storage.impl;

import entity.Employee;
import index.IdIndex;
import storage.DateStorge;
import storage.Storge;

import java.util.List;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 11:09 AM
 */
public class DateStorgeImpl implements DateStorge {

    private static Storge storge;

    static {
        storge = new StorgeImpl();
    }

//    windows url
//    private String fileUrl = "D:/employee.txt";
    private String fileUrl = "employee.txt";

    public void save(Employee employee) {
        storge.write(fileUrl,employee);
    }

    public boolean checkMsg(String name) {

        return false;
    }

    public Employee get(String name) {
        long pos = IdIndex.nameMap.get(name);
        return storge.read(fileUrl,pos);
    }

    public void delete(Long pos) {

    }

    public List<Employee> getAll() {
        return storge.readAll(fileUrl);
    }
}
