package JavaHomeWork;

/**
 * Created by Rajib on 12/7/2016.
 */
public abstract class Oopconcepts implements Homework {

    public String str=" Hi There! I am in Child Class";

    static String rollNumber="2041VA";

    static String display(){
        return rollNumber;
    }

    public String nameGame(String name){
        String firstName=name;
        return firstName;
    }
    public String nameGame(String name,String name1){
        String firstName=name;
        String lastname=name1;
        String fullName=name+", "+name1;
        return fullName;
    }

    public void implementOOPConcepts(){
        System.out.println("We will implement OOP concepts");
    }

    public void implementJAVAKeywords(){
        System.out.println("We will implement Java keywords");
    }

    public void implementLoops(){
        System.out.println("We will implement different loops");
    }

    public void implementArray(){
        System.out.println("We will implement Array");
    }

    public void implementJAVAAPI(){
        System.out.println("We will implement 10 different Java APIs");
    }

}
