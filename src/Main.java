public class Main {
    public static void main(String[] args) {
        info();
    }


    public static void info() {
        System.out.println("Правила пользования нашим чатом:");

        MessageType[] messageType = MessageType.values();

        for (MessageType i : MessageType.values()) {
            System.out.println("Тип сообщения - " + i.name()
                    + ". Описание: " + i.getInfo() + ". Всего можно отправить: " + i.getCount());
        }
    }
}