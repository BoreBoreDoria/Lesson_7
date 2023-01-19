public class Dog implements Animal, Test { // В отличие от extends, интерфейсы можно длетаь более 1
    @Override
    public void say() {
        System.out.println("Гав");
        System.out.println(info);
    }

    public void jump() {
        System.out.println("Прыгает");
    }
}
