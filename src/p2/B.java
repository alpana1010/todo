package p2;

public class B extends A{
    public int test1() {
       return 100;
    }
    public static void main(String args[]){
        B ba=new B();
        int val=ba.test1();
        System.out.println(val);

        A a=new A();
        int val1=a.test1();
        System.out.println(val1);
    }
}
