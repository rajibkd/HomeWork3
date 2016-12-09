package JavaHomeWork;

/**
 * Created by Rajib on 12/7/2016.
 */
public class Oopfeatures extends Oopconcepts{

        public String str1="Hi There! I am in Parent Class";
    @Override
    public String nameGame(String name1,String name){
        String firstName=name;
        String lastName=name1;
        String fullName1=name1+", "+name;
        return fullName1;
    }

        protected void showOutput(){
        System.out.println("We will see how to call Interface and Abstract Class after Implementing");
    }
}
