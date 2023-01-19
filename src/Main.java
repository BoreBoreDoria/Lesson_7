public class Main {
    public static void main(String[] args) {
        test(new Cat());
        System.out.println();
        test(new Dog());
        test(new Animal());
    }


    public static void test(Animal animal) {
        System.out.println("Обзор животного");
        System.out.println("Функция первая:");
        animal.say();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Функция вторая:");
            cat.run();
        } else if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            System.out.println("Функция вторая:");
            dog.jump();
        } else {
            System.out.println("К нам пришло нечто и больше ничего");
        }
    }
}