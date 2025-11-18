package State;
/**
 * Клас, що представляє стан замовлення, коли воно доставлене.
 */
public class DeliveredState implements OrderState {
    private Order order;
    /**
     * Конструктор для ініціалізації доставленого стану.
     *
     * @param order Замовлення, яке знаходиться у стані доставки.
     */
    public DeliveredState(Order order) {
        this.order = order;
    }
    /**
     * Обробка оплати для доставленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані доставки.
     */
    @Override
    public void pay(Order order) {
        System.out.println("DeliveredState: замовлення вже завершене, оплата недоступна.");
    }
    /**
     * Обробка відправлення для доставленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані доставки.
     */
    @Override
    public void ship(Order order) {
        System.out.println("DeliveredState: замовлення вже доставлене.");
    }
    /**
     * Обробка доставки для доставленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані доставки.
     */
    @Override
    public void deliver(Order order) {
        System.out.println("DeliveredState: замовлення вже доставлене.");
    }
    /**
     * Обробка скасування для доставленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані доставки.
     */
    @Override
    public void cancel(Order order) {
        System.out.println("DeliveredState: неможливо скасувати доставлене замовлення.");
    }
}