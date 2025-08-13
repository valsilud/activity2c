package AirFare;

import java.util.Scanner;
public class AirFare {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        
       
     System.out.print("Distance ((km)): ");
     int Distance = sc.nextInt();
     System.out.print("Class(1=Economy, 2=Business): ");
     int cls = sc.nextInt();
     
     double ratePerkm;
     if (cls == 1) {
         ratePerkm = 250.0;
     
     }else if (cls == 2){
         ratePerkm = 500.0;
     }else{
     
     System.out.println("Invalid class selected.");
     sc.close();
     return;
     }
     
     double total = Distance * ratePerkm;
     if(Distance > 1000) {
         total *= 0.90;
     }
         
     System.out.printf("total fare: %.2f%n", total);
     sc.close();
     
     
    }
    
}
