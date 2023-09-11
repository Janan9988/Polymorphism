 class Bank {
    float get_Rate_of_Intrest(){
        return 0;
    }
    
}
class Axis extends Bank {
    float get_Rate_of_Intrest(){
        return 5.6f;
    }
} 
class Icici extends Bank {
    float get_Rate_of_Intrest(){
        return 7.6f;
    }
}
class Paytm extends Bank {
    float get_Rate_of_Intrest(){
        return 8.7f;
    }
}
class Sbi extends Bank {
    float get_Rate_of_Intrest(){
        return 4.5f;
    }

}
class Kotak extends Bank{
    float get_Rate_of_Intrest(){
        return 6.6f;
    }
}
public class Polyexp2 {
    public static void main (String[]args){
        Bank b;
        b=new Axis();
        System.out.println("The rate of intrest in axis is :"+b.get_Rate_of_Intrest());
        b= new Icici();
        System.out.println("THe rate of intrest in icici is :"+ b.get_Rate_of_Intrest());
        b= new Paytm();
        System.out.println("THe rate of intrest in the Paytm is "+ b.get_Rate_of_Intrest());
        b= new Kotak();
        System.out.println("The rate of intrest in the Kotak is:"+b.get_Rate_of_Intrest());
        b= new Sbi();
        System.out.println("The rate of intrest in the Sbi is:"+b.get_Rate_of_Intrest());

    }
}