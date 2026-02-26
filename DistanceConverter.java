public class DistanceConverter{
  public static void main(String args[]){
   
   //We use "final" keyword to create constants.

   //constants
   final milesPerYard = 1760;
   final kilometersPerMile = 1.609;
    

   int miles = 26;
   int yards = 385;
   double kilometers;

   miles = 26;
   yards = 385;

  kilometers = ((miles+(1/milesPerYard)*yards))*kilometersPerMile;

  System.out.println("The amount of kilometers = "+kilometers);
  
  }
  
  
}
