package v2ch02.objectStream;

import common.Employee;
import common.Manager;

import java.io.*;

/**
 * 序列化测试
 *
 * @author lol-i-pop
 * @version 1.0
 **/
public class ObjectStreamTest {

    private static final String path = "./src/v2ch02/objectStream/";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var harry = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        var carl = new Manager("Harry Hacker", 50000, 1989, 10, 1);
        carl.setSecretary(harry);
        var tony = new Manager("Tony Tester", 40000, 1990, 3, 15);
        tony.setSecretary(harry);

        var staff = new Employee[3];

        staff[0] = harry;
        staff[1] = carl;
        staff[2] = tony;

        //save all employee records to the file employee.dat
        try(var out = new ObjectOutputStream(new FileOutputStream(path+"employee.dat"))){
            out.writeObject(staff);
        }

        try(var in = new ObjectInputStream(new FileInputStream(path+"employee.dat"))){
            var newStaff = (Employee[]) in.readObject();
            newStaff[1].raiseSalary(10);

            for(var e : newStaff){
                System.out.println(e);
            }
        }
    }
}
