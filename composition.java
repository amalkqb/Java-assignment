import java.util.*;
import java.io.*;
import java.util.Scanner;

class car{
  String name;
  Scanner in = new Scanner(System.in);
  public void getName(){
    System.out.println("enter car name:");
    name = in.nextLine();
  }

  public void printDetails(engine E){
    System.out.println("car name:" + name);
    System.out.println("engine type:" + E.type);

  }

  car(){
    engine E = new engine();
    getName();
    printDetails(E);
  }
}

class engine{
  String type;
  engine(){
    type = "Four-stroke";
  }
}

public class composition{
  public static void main(String args[]){
    car c = new car();
  }
}
