public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Ger");
        person1.setAge(31);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        person1.speak();
        //person1.setNameAndAge("Роман", 20);
        //person1.name = "Роман"; private
        //person1.age = 50;

        String s1 = "Вова";

        person1.sayHello();
        //System.out.println("Меня зовут " +person1.name + ", " + "мне " + person1.age + " лет" );

        Person person2 = new Person();
        person2.setNameAndAge(s1, 60);
        //person2.age = 20;

        //person1.speak();
        //person2.speak();
        //person2.sayHello();

        // int year1 = person1.calculateYearsToRetirement();
        //int year2 = person2.calculateYearsToRetirement();
        //System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        //System.out.println("Второму человеку до пенсии: " + year2 + " лет");

        //System.out.println("Меня зовут " +person2.name + ", " + "мне " + person2.age + " лет");
    }

}

class Person {
                  //у класса могут быть:
                  //1. Данные (поля)
                  //2. Действия, которые он может совершать (методы)
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("ты не ввел имя");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if(userAge < 0) {
            System.out.println("Возраст должен быть положительный");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String userName, int userAge) {

        name = userName;
        age = userAge;

    }


    int calculateYearsToRetirement() {

        int years = 65-age;
        return years; // after return method is it exit.

    }


    void speak(){   //void - пустота, ничто в переводе. Тип возвращаемого значения метода
                    //можно указать вместо void, например int. А доступ получить через return

        for(int i = 0; i < 3; i++) {

            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");

        }

    }

    void sayHello() {

        System.out.println("Привет");

    }

}