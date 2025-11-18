package Visitor;
/**
 * Клас, що представляє мережу, яка складається з елементів мережі.
 */
import java.util.ArrayList;
import java.util.List;

public class Network implements NetworkElement {
    private final String name;
    private final List<NetworkElement> children = new ArrayList<>();
    /**
     * Конструктор для ініціалізації мережі.
     *
     * @param name Назва мережі.
     */
    public Network(String name) {
        this.name = name;
    }
    /**
     * Отримати назву мережі.
     *
     * @return Назва мережі.
     */
    public String getName() {
        return name;
    }
    /**
     * Додати елемент до мережі.
     *
     * @param element Елемент мережі для додавання.
     */
    public void addElement(NetworkElement element) {
        children.add(element);
    }
    /**
     * Отримати список елементів мережі.
     *
     * @return Список елементів.
     */
    public List<NetworkElement> getChildren() {
        return children;
    }
    /**
     * Метод для прийому відвідувача.
     *
     * @param visitor Відвідувач, що виконує операції з елементами.
     */
    @Override
    public void accept(NetworkVisitor visitor) {
        visitor.visitNetwork(this);
        for (NetworkElement e : children) {
            e.accept(visitor);
        }
    }
}