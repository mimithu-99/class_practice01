package ClassPractice;

public class Test {
    public static void main(String[] args) {
       // Teacher t1; // object declare
       // t1 = new Teacher();

        Teacher t = new Teacher();
        t.name = "Anisul";
        t.gender = "Male";
        t.phone = 017000334;

        System.out.println("Name is: " +t.name);
        System.out.println("Gender is: " +t.gender);
        System.out.println("Phone Number: " +t.phone);
    }
}
