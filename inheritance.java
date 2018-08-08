import java.util.*;
import java.io.*;

  class vehicles{
    int no_of_tyres;

    vehicles(int n){
      no_of_tyres = n;
    }

    public void isEngine(){
     System.out.println("Engine Present");
    }

    public void fuelType(){
      System.out.println("fuel type = Petrol");
    }
  }

  class car extends vehicles{
    car(int n){
      super(n);
    }

    public void getSpeedLimit(){
      System.out.println("Speed limit = 50mph");
    }
  }

  class alto extends car{

    alto(){
      super(4);
      System.out.println("ALTO");
    }
    public void getMaxSpeed(){
      System.out.println("max apeed = 70mph");
    }
  }

  public class inheritance{

    public static void main(String args[]){
      alto A = new alto();
      System.out.println("No of tyres = " + A.no_of_tyres);
      A.getMaxSpeed();
      A.getSpeedLimit();
      A.fuelType();
      A.isEngine();
    }
  }
