package JavaHomeWork;

/**
 * Created by Rajib on 12/8/2016.
 */
public class EncapsulationFeature {

    private String name;
    private double salary;

    final int n;

    EncapsulationFeature(){
        n=2;
        System.out.println("Initiation of final int is "+n);
    }

    protected void finalize()throws Throwable
    {
        System.out.println("The object is Garbage Collected");
        super.finalize();
    }

    final int cube(final int n){
        return n*n*n;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

}
