package abstracpractice;

/**
 *
 * @author Habib_Adnan
 */
public abstract class Human {
    private String humantype;
    private String humancountry;
    
    public String showhumandata(String humantype, String humancountry){
        this.humantype=humantype;
        this.humancountry=humancountry;
        return "Human Type: "+humantype+"Human Country"+humancountry;
    }
    public abstract String humanage();
}
