package State;
/**
 * Клас, що представляє стан замовлення, коли воно відправлене.
 */
public class ShippedState implements OrderState {
    private Order order;
    /**
     * Конструктор для ініціалізації відправленого стану.
     *
     * @param order Замовлення, яке знаходиться у стані відправлення.
     */
    public ShippedState(Order order) {
        this.order = order;
    }
    /**
     * Обробка оплати для відправленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані відправлення.
     */
    @Override
    public void pay(Order order) {
        System.out.println("ShippedState: замовлення вже оплачене й відправлене.");
    }
    /**
     * Обробка відправлення для відправленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані відправлення.
     */
    @Override
    public void ship(Order order) {
        System.out.println("ShippedState: замовлення вже відправлене.");
    }

    /**
     * Обробка доставки для відправленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані відправлення.
     */
    @Override
    public void deliver(Order order) {
        System.out.println("ShippedState: доставляємо замовлення. Перехід у стан DeliveredState.");
        order.setState(order.getDeliveredState());
    }

    /**
     * Обробка скасування для відправленого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані відправлення.
     */
    @Override
    public void cancel(Order order) {
        System.out.println("ShippedState: не можна скасувати відправлене замовлення.");
    }
}