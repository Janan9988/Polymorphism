//Method overriding cannot allow the dataMumber
 class Bike {
   int speedlimit=90;
 }
 class Honda3 extends Bike{
  int speedlimit=150;
 }
 public class Polyexp4{

 
  public static void main(String args[]){
   Bike obj=new Honda3();
   System.out.println(obj.speedlimit);//90
 }
 }
