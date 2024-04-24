public class Test {
    public static void main(String[] args) {
        int x=1;
        int y=1;

        Employee  e1 = new Employee("rupesh");
        Employee  e2 = new Employee("rupesh");

        String s1 = new String("rupesh");
        String s2 = new String("rupesh");


        if(s1.equals(s2)){
            System.out.println("true");
        }
        else System.out.println("false");

        if(e1.equals(e2)){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
