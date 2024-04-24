package P1;

public class Dog extends Animal{
    void eat(){

        System.out.println("eating bread.....");
    }
    void bark() {

        System.out.println("dog barking....");

    }
    void work(){
        super.eat();
        bark();
        eat();
    }
    Dog(){
        System.out.println("dog is created.....");
    }

    public static void main(String args[]) {
        Dog d=new Dog();
        d.bark();
        d.eat();
        d.work();
    }
}
