package ClassPractice;

public class Test02 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Cow";
        a.age = 3;
        a.color = "Red";
        a.weight = 250;

        System.out.println("Animal Name: " +a.name);
        System.out.println("Animal age :" + a.age);
        System.out.println("Animal color :" + a.color);
        System.out.println("Animal weight :" + a.weight);

        Animal b = new Animal();

        b.name = "Goat";
        b.color = "Black";
        b.age = 2;

        System.out.println("Name is: " + b.name);
        System.out.println("Color is: " + b.color);
        System.out.println("Age is : " + b.age);


    }
}
