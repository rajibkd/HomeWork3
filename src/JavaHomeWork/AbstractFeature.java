package JavaHomeWork;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
import java.net.*;

/**
 * Created by Rajib on 12/8/2016.
 */
public class AbstractFeature {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("<--------------------CHOICES-------------------->");
        System.out.println("1.  Abstraction Features");
        System.out.println("2.  Encapsulation Feature");
        System.out.println("3.  Inheritance Feature");
        System.out.println("4.  Polymorphism Feature");
        System.out.println("5.  Use of Java Keywords");
        System.out.println("6.  Use of Different Loops");
        System.out.println("7.  Use of Array in Java");
        System.out.println("8.  Use of 10 Java APIs");
        System.out.println("Please enter your choice: from (1 -8)");
        int choice=input.nextInt();

        switch (choice) {

            case 1: {

                Homework HW = new Oopfeatures();
                HW.implementOOPConcepts();
                HW.implementJAVAKeywords();
                HW.implementArray();
                HW.implementLoops();
                HW.implementJAVAAPI();
                System.out.println();

                Oopconcepts OC = new Oopfeatures();
                OC.implementOOPConcepts();
                OC.implementJAVAKeywords();
                OC.implementArray();
                OC.implementLoops();
                OC.implementJAVAAPI();
                System.out.println();

                Oopfeatures OF = new Oopfeatures();
                OF.showOutput();
                OF.implementOOPConcepts();
                OF.implementJAVAKeywords();
                OF.implementArray();
                OF.implementLoops();
                OF.implementJAVAAPI();
                break;
            }

            case 2: {

                System.out.println("We gonna see Encapsulation Feature here");
                EncapsulationFeature EF = new EncapsulationFeature();
                EF.setName("Rajib Das");
                EF.setSalary(100000.40);
                System.out.println("Employees's Name: " + EF.getName() + " \t  Salary: " + EF.getSalary());
                break;
            }

            case 3: {
                System.out.println("We gonna see Inheritance Feature here!!");
                Oopconcepts IF = new Oopfeatures();
                System.out.println(IF.str);
                Oopfeatures IF1 = new Oopfeatures();
                System.out.println(IF1.str);
                System.out.println(IF1.str1);
                break;
            }

            case 4: {
                System.out.println("We gonna see Polymorphism Feature here!!");
                Oopconcepts PF = new Oopfeatures();
                String firstName = PF.nameGame("Rajib");
                System.out.println("My First Name is: " + firstName);
                String fullName = PF.nameGame("Rajib", "Das");
                System.out.println("My Full Name is: " + fullName);
                Oopfeatures PF1 = new Oopfeatures();
                String fullName1 = PF1.nameGame("Das", "Rajib");
                System.out.println("My Full Name is: " + fullName1);
                break;
            }

            case 5: {
                System.out.println("We will see use of Java keywords here: ");
                System.out.println("Example of Static Variable and Static Method");
                Oopconcepts SV = new Oopfeatures();
                System.out.println("My ID is: " + SV.rollNumber);
                System.out.println("Please Display my Roll Number: " + SV.display());

                System.out.println("Use of final keyword!");
                EncapsulationFeature FK = new EncapsulationFeature();
                int val = FK.cube(2);
                System.out.println("Cube of 2 is: " + val);

                try {
                    int j = 15 / 0;
                    System.out.println("Please print i= " + j);
                } catch (ArithmeticException ae) {
                    System.out.println(ae);
                } finally {
                    System.out.println("We did not use System.exit(0) here");
                    System.out.println("Finally block is always executed unless you call System.exit() ");
                }
                try {
                    int i = 20 / 0;
                    System.out.println("Please print i= " + i);
                } catch (ArithmeticException ae) {
                    System.out.println(ae);
                    //System.exit(0);
                } finally {
                    System.out.println("Finally block is always executed unless you call System.exit() ");
                }

                AbstractFeature GC1=new AbstractFeature();
                AbstractFeature GC2=new AbstractFeature();

                GC1=null;
                GC2=null;
                System.out.println("done");
                System.gc();

                AbstractFeature GC3=new AbstractFeature();
                AbstractFeature GC4=new AbstractFeature();
                GC3=GC4;
                Runtime.getRuntime().runFinalization();
                System.out.println("done");

                break;
        }

            case 6:{
                System.out.println("We will see different loops implementation here");
                System.out.println("Example of if-else loop :");
                int i=5,j=6;
                if(i==j)
                   System.out.println("i= "+i+" is equal to j= "+j);
                else
                    System.out.println("i= "+i+" is not equal to j= "+j);

                int day=5;

                if(day==1)
                    System.out.println("Today is Monday");
                else if(day==2)
                    System.out.println("Today is Tuesday");
                else if(day==3)
                    System.out.println("Today is Wednesday");
                else if(day==4)
                    System.out.println("Today is Thursday");
                else if(day==5)
                    System.out.println("Today is Friday");
                else if(day==6)
                    System.out.println("Today is Saturday");
                else if(day==7)
                    System.out.println("Today is Sunday");
                else
                    System.out.println("Invalid Input");

                System.out.println("Introduction to for loop");
                int loopInt;
                for(loopInt=1;loopInt<=10;loopInt++)
                    System.out.print(loopInt+"\t");

                int loop1=5,loop2=15;

                while(loop1<loop2) {
                    System.out.println("While loop is running");
                    loop2 = loop2 - 5;
                }

                do
                    System.out.println("Do is running");
                while(loop1<loop2);
                {
                    System.out.println("I am in while ");
                    loop2=loop2-5;
                }
                break;
            }

            case 7:{
                System.out.println("We will see Array implementation here");
                int[] arr=new int[10];
                Scanner inputArray=new Scanner(System.in);
                int index;
                System.out.println("Please input 10 numbers to store in the defined Array");
                for(index=0;index<=arr.length;index++) {
                    arr[index] = inputArray.nextInt();
                    System.out.print(arr[index] + "\t");
                }
                break;
            }

            case 8:{
                System.out.println("We will see Java API implementation here");
                //Use of FileReader and BufferedReader API
                try{
                    String path="C:\\Users\\Rajib\\IdeaProjects\\HomeWork3\\src\\data.txt";
                    BufferedReader br=new BufferedReader(new FileReader(path));
                    String line="";
                    line=br.readLine();
                    System.out.println(line);
                    br.close();
                }catch (FileNotFoundException e){
                    System.out.println("File data.txt was not found");
                }catch(IOException e){
                    System.out.println("Error reading from file data.txt");
                }
                //Use of Random API
                Random RD=new Random();
                int random=100;
                System.out.println(RD.nextInt(random));

                //Use of Date API
                Date now=new Date();
                SimpleDateFormat DF=new SimpleDateFormat("EEEE,MMMM d,YYYY");
                System.out.println(now);
                System.out.println("Formatted Date: "+DF.format(now));

                //Use of Calendar API
                Calendar cal=Calendar.getInstance();
                System.out.println("Year: "+cal.get(Calendar.YEAR));
                System.out.println(cal.getTimeZone());

                //Use of ArrayList API
                ArrayList<String> AL=new ArrayList<String>();
                AL.add("Rajib");
                AL.add("Aman");
                AL.add("Sachin");
                Collections.sort(AL);
                for(String obj:AL)
                    System.out.println(obj);

                //Use of Integer API
                Integer intObject=new Integer(10);
                System.out.println(intObject);

                //Use of StringTokenizer
                StringTokenizer ST=new StringTokenizer("My name,is,Rajib Das");
               System.out.println("Next Token is:" +ST.nextToken(","));

               //Use of System API
                Properties P=System.getProperties();
                P.list(System.out);

                //Use of URL API
                try{
                    URL url=new URL("http://www.piit.us");

                    System.out.println("Protocol: "+url.getProtocol());
                    System.out.println("Host Name: "+url.getHost());
                    System.out.println("Port Number: "+url.getPort());
                    System.out.println("File Name: "+url.getFile());

                }catch(Exception e){System.out.println(e);}
            }
                break;
            default:
                System.out.println("Invalid Input");

        }


    }
}
