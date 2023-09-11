 class Addition {
    int multiply(int a,int b){
    return a*b;
    }
     int multiply(int a, int b, int c){
        return a*b*c;
    }
    
}
public class PolyExp9{
    public static void main (String []args){
    Addition obj =new Addition(); 
    System.out.println("The outpet of the sum is :"+  obj.multiply(6,7));
   System.out.println("THe 2nd output of the program is :"+ obj.multiply(2, 03, 05)); 
    }
}
