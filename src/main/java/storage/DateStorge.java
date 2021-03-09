package storage;

import entity.Employee;

import java.util.List;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 11:07 AM
 */
public interface DateStorge {

    /**
     * 存储
     * @param o
     */
    void save(Employee o);

    /**
     * 检查索引
     * @param name
     * @return
     */
    boolean checkMsg(String name);


    /**
     * 获取
     * @param name
     */
    Employee get(String name);

    /**
     * 删除某个节点
     * @param pos
     */
    void delete(Long pos);

    /**
     * 展示全部数据
     * @return
     */
    List<Employee> getAll();

}
