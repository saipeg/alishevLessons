public class Constructor {

    public static void main(String[] args) {

        Animal animal = new Animal();

    }

}

class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {

        System.out.println("You added the name of the animal and its age: " + name + ", " + age);

    }

    public Animal() {

        System.out.println("Вы ничего не ввели");

    }

}