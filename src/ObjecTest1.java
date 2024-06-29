public class ObjecTest1 {
    public static void main(String[] args) {
        Student ob1 = new Student();

        ob1.name = " Muntaha, ";
        ob1.gender = " Female, ";
        ob1.address = " Dhaka.";

        ob1.age = 8;
        ob1.roll = 1;

//        System.out.println("Student name is: " + ob1.name);
//        System.out.println("Student Gender is: " + ob1.gender);
//        System.out.println("Student address is: " + ob1.address);
//        System.out.println("Student age is: " + ob1.age);
//        System.out.println("Student roll is: " + ob1.roll);
        System.out.println("Student name is: "
                + ob1.name + "Gender" + ob1.gender + "Address" + ob1.address);

        Student ob2 = new  Student();

        ob2.name = " Toya, ";
        ob2.gender = " Female, ";
        ob2.address = " Dhaka.";

        ob2.age = 7;
        ob2.roll = 2;
        System.out.println("Student Name Is: " + ob2.name + "Gender"
                + ob2.gender + "Address" + ob1.address);


    }
}
