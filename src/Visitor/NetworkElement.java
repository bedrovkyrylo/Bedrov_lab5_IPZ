package Visitor;
/**
 * Інтерфейс для елементів мережі, які можуть бути відвідані відвідувачем.
 */
public interface NetworkElement {
    /**
     * Метод для прийому відвідувача.
     *
     * @param visitor Відвідувач, який виконує операції.
     */
    void accept(NetworkVisitor visitor);
}