public interface Animal {
    String info = "INFO";// Все параметры всегда static final

    void say(); // Этот метод обязаны релаизовать все наслденики

    static void staticSay() {
        System.out.println("Статик привет");// Не запрещено создавать статические методы
        System.out.println(info);
    }

    default void defaultSay() {
        System.out.println("Привет"); // Либо прописывать каку-то логику по-умолчанию с >Java 8
    }
}
