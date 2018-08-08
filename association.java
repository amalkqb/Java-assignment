import java.util.*;
import java.io.*;
import java.util.Scanner;

class vehicles{
  int no_of_tyres;
  int license_no;
  String owner_name;

  public void printDetails(alto A){
    no_of_tyres = A.tyres;
    license_no = A.license;
    owner_name = A.owner;

    System.out.println("CAR DETAILS \n-----------------");
    System.out.println("tyres = " + no_of_tyres);
    System.out.println("license:" + license_no);
    System.out.println("owner:" + owner_name );
  }

  public void isEngine(){
   System.out.println("Engine Present");
  }

  public void fuelType(){
    System.out.println("Petrol");
  }
}

class alto extends vehicles{

String owner;
int license;
int tyres;
Scanner in = new Scanner(System.in);

  public void getOwner(){
    System.out.println("Enter Owner name:");
    owner = in.nextLine();
  }

  public void getLicense(){
    System.out.println("Enter License no:");
    license = in.nextInt();
  }
  alto(){
    tyres = 4;
    getOwner();
    getLicense();
  }

}

public class association{

  public static void main(String args[]){
    vehicles v = new vehicles();
    alto A = new alto();
    v.printDetails(A);
  }
}
