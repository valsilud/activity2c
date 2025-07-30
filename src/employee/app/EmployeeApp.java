package employee.app;

import java.util.Scanner;

public class EmployeeApp {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float hour, hw;
      String name;
      
      System.out.print("Enter employee name: ");
      name = sc.nextLine();
      System.out.print("Enter hourly rate: ");
      hour = sc.nextFloat();
      System.out.print("Enter total hours worked this week: ");
      hw = sc.nextFloat();
      
      System.out.println("-----Wage Summary-----");
      System.out.println("employee: "+name);
      System.out.printf("hourly rate: %.2f\n", hour);
      System.out.println("hours worked: "+hw);
      
      float gross;
      gross = hour * hw;
      
      System.out.printf("gross weekly: %.2f\n", gross);
      
      float dis = gross / 10.0f;
      System.out.printf("SSS Contribution: %.2f\n", dis);
      
      
      float net;
      net = gross - dis;
      System.out.printf("Net weekly wage: %.2f\n", net);
      
    }
    
}
