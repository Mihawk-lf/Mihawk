package storage.impl;

import entity.Employee;
import index.IdIndex;
import storage.Storge;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 7:04 PM
 */
public class StorgeImpl implements Storge {

    public void write(String fileName, Employee employee) {
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(new File(fileName),"rw");
            rf.seek(rf.length());
            IdIndex.nameMap.put(employee.getName(),rf.length());
            rf.write(employee.getName().getBytes());
            rf.writeInt(employee.getAge());
            rf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Employee read(String fileName,Long pos) {
        try {
            RandomAccessFile raf = new RandomAccessFile(new File(fileName),"r");
            raf.seek(pos);
            byte[] buf = new byte[8];
            raf.read(buf);
            Employee employee = new Employee(new String(buf).trim(),raf.readInt());
            raf.close();
            return employee;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Employee> readAll(String fileName) {
        List<Employee> list = new ArrayList<Employee>();
        try {
            RandomAccessFile raf = new RandomAccessFile(new File(fileName),"r");
            byte[] buf = new byte[8];
            long pos = raf.length();

            while (pos > 0){
                pos = pos - 12;
                raf.seek(pos);
                raf.read(buf);
                list.add(new Employee(new String(buf).trim(),raf.readInt()));
            }
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
