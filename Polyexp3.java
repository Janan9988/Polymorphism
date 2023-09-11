 class Shape {
    void draw(){
    }
    }
class Circle extends Shape {
    void draw(){
        System.out.println("The Circle Shape clook like a round");
    }
}
class Rectangle extends Shape{
    void draw (){
        System.out.println("The Rectangle Shape look like a Box Shape");
    }
}
class Tringle extends Shape {
    void draw (){
        System.out.println("The Triangle Shape look like a Diamond ");
    }
}
class Sqare extends Shape {
    void draw(){
        System.out.println("The Sqare all side look equal :");
    }
}
class Octagan extends Shape {
    void draw (){
        System.out.println("The Octagan have Eight side Same cm meter :");
    }
}
public class Polyexp3{
    public static void main(String []args ){
        Shape s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Tringle();
        s.draw();
        s =new Sqare();
        s.draw();
        s =new Octagan();
        s.draw();
    }
    
}