class Animals {
    void dog (){
    }  
}
class Labour extends Animals {
    void dog (){
        System.out.println("THe labour Starting price is 15 K:");

    }
}
class Pitbull extends Animals {
    void dog (){
        System.out.println("The pitBull starting price is 40 K :");

    }
}
class Golden_Ret extends Animals{
    void dog (){
        System.out.println("The golden retriver strating  price is 30K ");
    }
}
public class Polyexp5{
    public static void main (String[]args ){
    Animals a,b,c;
    a = new Labour();
    b = new Pitbull();
    c = new Golden_Ret();
    a.dog();
    b.dog();
    c.dog();
    }
}


