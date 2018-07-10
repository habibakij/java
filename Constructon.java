
package constructon;

import java.util.ArrayList;
import java.util.Scanner;

public class Constructon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*System.out.println("enter your data\n");
        Scanner input=new Scanner(System.in);
        Student student= new Student();
        student.name=input.next();
        student.rull=input.next();
        student.dept=input.next();
        student.varsity=input.next();
        ArrayList<Student>arraylist= new ArrayList<Student>();
        arraylist.add(student);
        for(Student std:arraylist){
            System.out.println(std.name+" "+std.rull+" "+std.dept+" "+std.varsity);
        }*/
        String emname,emsalary, emdept, varsity;
        System.out.println("enter your data");
        emname=input.next();
        emsalary=input.next();
        emdept=input.next();
        varsity=input.next();
        //Office office= new Office(emname, emsalary);
        Office office1= new Office(emname);
        /*office.employee= input.next();
        office.salary= input.next();
        office.latecome= input.next();
        office.attent= input.next();
        office.showofficeall();*/
        /*office.setemployee("habib");
        office.setesalary("10000");
        office.setelatecome("21");
        office.seteattent("7");*/
        office1.showofficeall();
        
    }
    
}
class Student{
    String name="";
    String rull="";
    String dept="";
    String varsity="";
}
class Office{
    private String employee;
    private String salary;
    private String latecome;
    private String attent;
    
    Office(String employee, String salary){
    this.employee=employee;
    this.salary=salary;
}
    Office(String employee){
        this.employee=employee;
    }
    public String setemployee(String employee){
        return this.employee=employee;
    }
    //public void getemployee(){
        //return;
    //}
    public String setesalary(String salary){
        return this.salary=salary;
    }
    public String setelatecome(String latecome){
        return this.latecome=latecome;
    }
    public String seteattent(String attent){
        return this.attent=attent;
    }
    public void showofficeall(){
        if(salary==null){
            System.out.println(employee+" "+latecome+" "+attent);
            return;
        }
        System.out.println(employee+" "+salary+" "+latecome+" "+attent);
        return;
    }
    
}