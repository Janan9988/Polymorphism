 class Polyexp8{
     
        void sum(int a,long b){System.out.println(a+b);}  
        void sum(int a,int b,int c){System.out.println(a+b+c);}  
        
        public static void main(String args[]){  
       Polyexp8 obj=new Polyexp8();  
        obj.sum(20,20);//now second int literal will be promoted to long  
        obj.sum(20,20,20);  
        
        }  
      }  
 