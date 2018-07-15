package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Habib_Adnan
 */
public class Inhferitance{
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Keybord keybord= new Keybord();
        Scanner input= new Scanner(System.in);
        int pitch=input.nextInt();
        /*keybord.showmousedata("Habib Adnan", "AK Software Solution", pitch);
        keybord.showkeybourdata("Akij", "AK Software Solution", pitch);
        //Mouse mouse=new Mouse();
        //mouse.setName("bangadesh");
        //mouse.showmousedata("Habib Adnan", "AK Software Solution", pitch);*/
        
        Computer_accessories accessroies= new Computer_accessories();
        accessroies.setName("Habib Adnan");
        accessroies.setCompany("AK Software Solution");
        accessroies.setPitch(pitch);
        System.out.println("Name: "+accessroies.getName()+"Company: "+accessroies.getCompany()+"Pitch: "+accessroies.getPitch());
        accessroies.showkeybourdata(accessroies.getName(), accessroies.getCompany(), accessroies.getPitch());
        accessroies.showmousedata(accessroies.getName(), accessroies.getCompany(), accessroies.getPitch());
    }
}
class Computer_accessories extends Keybord{
    //Scanner input= new Scanner(System.in);
    //int pitch=input.nextInt();
    int pitch;
    public void showall(){
        //showkeybourdata("Habib Adnan", "AK Software Solution", pitch);
        //showmousedata("Akij", "AK Software Solution", pitch);
        //return showall;
    }
}
class Keybord extends Mouse{
    //discount for 100 pictch 10%, fot 200 pitch 15%, above of 250 30%, per pitch 550
    private String name;
    private String company;
    private int pitch;
    
    public void showkeybourdata(String name, String company, int pitch){
        this.name=name;
        this.company=company;
        this.pitch=pitch;
        int total;
        int discount;
        int prize=550;
        if(pitch<=99){
            total=pitch*prize;
            System.out.println("Total keybord cast: "+total);
        }else if(pitch >99 && pitch<199){
            total=pitch*prize;
            discount=((total/100)*10);
            total=total-discount;
            System.out.println("Total keybord cast: "+total);
        }else if(pitch>199 && pitch< 249){
            total=pitch*prize;
            discount=((total/100)*15);
            total=total-discount;
            System.out.println("Total keybord cast: "+total);
        }else{
            total=pitch*prize;
            discount=((total/100)*30);
            total=total-discount;
            System.out.println("Total keybord cast: "+total);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPitch() {
        return pitch;
    }
    
}
class Mouse{
    //discount for 100 pictch 15%, fot 200 pitch 30%, above of 250 45%, per pitch 350
    private String name;
    private String company;
    private int pitch;
    
    public void showmousedata(String name, String company, int pitch){
        this.name=name;
        this.company=company;
        this.pitch=pitch;
        int total;
        int discount;
        int prize=350;
        if(pitch<=99){
            total=pitch*prize;
            System.out.println("Total mouse cast: "+total);
        }else if(pitch >99 && pitch<199){
            total=pitch*prize;
            discount=((total/100)*15);
            total=total-discount;
            System.out.println("Total mouse cast: "+total);
        }else if(pitch>199 && pitch< 249){
            total=pitch*prize;
            discount=((total/100)*30);
            total=total-discount;
            System.out.println("Total mouse cast: "+total);
        }else{
            total=pitch*prize;
            discount=((total/100)*45);
            total=total-discount;
            System.out.println("Total mouse cast: "+total);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPitch() {
        return pitch;
    }
    
}