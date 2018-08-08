import java.util.*;
import java.io.*;
import java.util.Scanner;

class owner{
  Scanner in = new Scanner(System.in);
  ArrayList license = new ArrayList();
  String name;

  owner(){
    System.out.println("Enter name of owner:");
    name = in.nextLine();
  }

  public void owned(car A){
    license.add(A.car_license);
  }

  public void printDetails(){
    System.out.println("--------------\nname = " + name);
    System.out.println("License of owed cars:");
    for (int i = 0; i < license.size(); i++){
       System.out.println(license.get(i));
     }
  }
}

class car{
  Scanner in = new Scanner(System.in);
  String car_license;

   public void getLicense(){
      System.out.println("Enter License of car:");
      car_license = in.nextLine();
   }

   car(){
     getLicense();
   }
}

public class aggregation{

  public static void main(String args[]){
    owner a = new owner();
    car c1 = new car();
    car c2 = new car();
    car c3 = new car();
    a.owned(c1);
    a.owned(c2);
    a.printDetails();
  }
}
