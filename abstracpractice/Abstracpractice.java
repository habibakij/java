package abstracpractice;

import java.util.Scanner;

/**
 *
 * @author Habib_Adnan
 */
public class Abstracpractice {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        String name, marritalstatus, age, nation;
        name=input.next();marritalstatus= input.next();nation= input.next();
        age= input.next();
        Male male= new Male(name, marritalstatus, nation);
        male.setAge(age);
        System.out.println("Age is: "+male.humanage());
        male.getinfo();
    }
}
