package entity;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 10:56 AM
 */
public class Employee {

    private String name;
    private int age;
    private static final int len = 8;// String 型的定长，相当于数据库中的类型长度

    public Employee(String name,int age){
        if(name.getBytes().length >= len){
            this.name = name.substring(0,len);
        }else{
            while (name.getBytes().length < len){
                name +="\u0000";//空白，占8b
            }
            this.name = name;
        }
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
