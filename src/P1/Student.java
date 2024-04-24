package P1;

public class Student {
    int rollno;
    String name;
    String course;
    float fee;

    Student(int rollno, String name,String course, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.course=course ;
        this.fee = fee;
    }



    void display() {
        System.out.println(rollno + " " + name + " " +course+" "+ fee);
    }

    public static void main(String args[]) {

       Student s2 = new Student(2, "sumit", "java",6000f);
        //s1.display();
        System.out.println("hello world");
        System.out.println("hello world2");
        System.out.println("hello world3");
       s2.display();
    }
}
