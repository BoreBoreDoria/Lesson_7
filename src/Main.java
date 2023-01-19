public class Main {
    public static void main(String[] args) {

        Animal animal = new Cat(); // Восходящим преобразованием.
        Cat cat = (Cat) animal;// Нисходящее преобразование
        animal.say(); // Используем переменную типа родиельского класса, а внутри находится объект дочернего класса
        cat.run();// После нисходящего преобразвания, используем изначальный тип

        //---------------------
        Animal animal1 = new Dog();
        if (animal1 instanceof Cat) {// instanceof это специальная конструкция, которая помогает определить
            // является ли объект определённым классом. На выходе true ( если истина ) и false ( если ложь )
            System.out.println("Это Кошка");
            Cat cat1 = (Cat) animal1;
        } else {
            System.out.println("Это собака");
            Dog dog = (Dog) animal1;
        }
    }
}