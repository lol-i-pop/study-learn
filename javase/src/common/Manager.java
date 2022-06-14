package common;

import java.io.Serializable;

/**
 * TODO
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class Manager extends Employee implements Serializable {

    //秘书
    private Employee secretary;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public Manager(String name, double salary, int year, int month, int day,Employee secretary) {
        super(name, salary, year, month, day);
        this.secretary = secretary;
    }

    public Employee getSecretary(){
        return secretary;
    }

    public void setSecretary(Employee secretary){
        this.secretary = secretary;
    }
}
