public class DistanceConverter{
  public static void main(String args[]){
   

   int miles = 26;
   int yards = 385;
   double kilometers;

   miles = 26;
   yards = 385;

  kilometers = ((miles+(1/1760)*yards))*1.609;

  System.out.println("The amount of kilometers = "+kilometers);
  
  }
  
  
}
