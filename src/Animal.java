public abstract class Animal {
    protected String info = "INFO";

    abstract void abstractSay(); // Этот метод обязаны релаизовать все наслденики

    static void staticSay() {
        System.out.println("Статик привет");
    }

    void say() {
        System.out.println("Привет");
        System.out.println(info);
    }
}
