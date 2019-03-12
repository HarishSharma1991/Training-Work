package inheritance;

public class Animal {
    void walk(){
        System.out.println("i am walking");
    }
}
class Bird extends Animal
{
    void fly (){
        System.out.println("i am flying");
    }
    void sing(){
        System.out.println("i am  singing");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal tiger=new Animal();
        tiger.walk();
        Bird sparrow=new Bird();
        sparrow.walk();
        sparrow.sing();
        sparrow.fly();
    }
}
