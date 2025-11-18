package Visitor;
/**
 * Клас, що представляє робочу станцію в мережі.
 */
public class Workstation implements NetworkElement {
    private final String name;
    /**
     * Конструктор для ініціалізації робочої станції.
     *
     * @param name Назва робочої станції.
     */
    public Workstation(String name) {
        this.name = name;
    }
    /**
     * Отримати назву робочої станції.
     *
     * @return Назва робочої станції.
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
        visitor.visitWorkstation(this);
    }
}