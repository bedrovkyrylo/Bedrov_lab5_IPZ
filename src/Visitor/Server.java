package Visitor;
/**
 * Клас, що представляє сервер у мережі.
 */
public class Server implements NetworkElement {
    private final String name;
    /**
     * Конструктор для ініціалізації сервера.
     *
     * @param name Назва сервера.
     */
    public Server(String name) {
        this.name = name;
    }
    /**
     * Отримати назву сервера.
     *
     * @return Назва сервера.
     */
    public String getName() {
        return name;
    }
    /**
     * Метод для прийому відвідувача.
     *
     * @param visitor Відвідувач, що виконує перевірку.
     */
    @Override
    public void accept(NetworkVisitor visitor) {
        visitor.visitServer(this);
    }
}