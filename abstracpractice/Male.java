
package abstracpractice;

/**
 *
 * @author Habib_Adnan
 */
public class Male extends Human implements Information{
    private String name;
    private String marritalstatus;
    private String age;
    private String nation;
    Male(String name, String marritalstatus, String nation){
        System.out.println("Name: "+name+". Marritalstatus: "+marritalstatus+". Nation: "+nation);
    }
    @Override
    public String humanage() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    @Override
    public void getinfo() {
        
    }
    
}
