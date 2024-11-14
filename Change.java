import java.util.Scanner;
class Change{
 public static void main(String[] args) {

   
   int n;
   Scanner scan = new Scanner (System.in);

   System.out.println("Input a number: ");
   n = scan.nextInt();
   int Quarters=0; int Dimes=0; int Nickels=0; int Pennies=0;
        
   if(n>0 && n<=100){
          if(n>=25){
          Quarters= n/25;
          n=n%25;
          }
          if(n>=10){
          Dimes=n/10;
          n=n%10;
          }
          if(n>=5){
           Nickels=n/5;
           n=n%5;
           Pennies=n;
           }
           if(n<5){
           Pennies=n;
           }
        
            System.out.println( "Quarter="+Quarters);
            System.out.println( "Dime="+Dimes);
            System.out.println( "Nickel="+Nickels);
            System.out.println( "Penny="+Pennies);
 
   }

 else{
       System.out.println("Please enter a valid number");
      }
   
 } 
}