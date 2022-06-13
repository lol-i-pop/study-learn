package common;

/**
 * TODO
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class Manager extends Employee{
    private Employee secretary;


    public Manager(String name, double salary, int year, int month, int day,Employee secretary) {
        super(name, salary, year, month, day);
        this.secretary = secretary;
    }

    public Employee getSecretary(){
        return secretary;
    }
}
