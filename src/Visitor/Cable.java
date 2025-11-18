package Visitor;
/**
 * Клас, що представляє кабель у мережі
 */
public class Cable implements NetworkElement {
    private final String name;
    /**
     * Конструктор для ініціалізації кабелю.
     *
     * @param name Назва кабелю.
     */
    public Cable(String name) {
        this.name = name;
    }
    /**
     * Отримати назву кабелю.
     *
     * @return Назва кабелю.
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
        visitor.visitCable(this);
    }
}