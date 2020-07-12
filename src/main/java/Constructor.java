public class Constructor {

    public static void main(String[] args) {

        Animal animan = new Animal("Eugene", 14);

    }

}

class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {

        System.out.println("You added the name of the animal and its age: " + name + ", " + age);

    }

}