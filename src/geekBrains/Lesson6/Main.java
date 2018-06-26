/*
        Студент: Чепёлкин Иван
        ДЗ №6 по курсу Java. Уровень 1
        Преподователь: Артём Евдокимов
*/

package geekBrains.Lesson6;

class Animal {
    public Animal() {
    }


    public  void run(int runLenth) {

        System.out.println("Животное бежит " + runLenth + " метров");
    }

    public  void swim(int swimLenth) {

        System.out.println("Животное плывет " + swimLenth + " метров");
    }

    public  void jump(int jumpLenth) {

        System.out.println("Животное плывет " + jumpLenth + " метров");
    }

}

class Cat extends Animal {

    public  void run(int runLenth) {
        if (runLenth <= 200)
            System.out.println("Кот бежит " + runLenth + " метров");
        else {
            System.out.println("Слишком большая дистанция для кота!");
        }
    }

    public  void swim(int swimLenth) {

        System.out.println("Кот не умеет плавать...");
    }

    public  void jump(int jumpLenth) {
        if (jumpLenth <= 5)
            System.out.println("Кот прыгает на " + jumpLenth + " метра");
        else {
            System.out.println(jumpLenth + "метров - так далеко кот не прыгнет!");
        }

    }

}

class Dog extends Animal {
    public  void run(int runLenth) {
        if (runLenth <= 500)
            System.out.println("Кот бежит " + runLenth + " метров");
        else {
            System.out.println("Слишком большая дистанция для собаки!");
        }
    }

    public  void swim(int swimLenth) {
        if (swimLenth <= 10)
            System.out.println("Собака плавёт "+swimLenth +"метров");
        else {
            System.out.println(swimLenth + "метров - столько собака не проплывёт!");
        }

    }

    public  void jump(int jumpLenth) {
        if (jumpLenth <= 3)
            System.out.println("Собака прыгает на " + jumpLenth + " метра");
        else {
            System.out.println(jumpLenth + " метров - так далеко собака не прыгнет!");
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run(100);
        dog.run(300);
        cat.swim(10);
        dog.swim(5);
        cat.jump(2);
        dog.jump(15);

	// write your code here
    }
}
