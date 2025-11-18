package State;
/**
 * Клас, що представляє стан замовлення, коли воно оплачено.
 */
public class PaidState implements OrderState {
    private Order order;

    /**
     * Конструктор для ініціалізації оплаченого стану.
     *
     * @param order Замовлення, яке знаходиться у стані оплати.
     */
    public PaidState(Order order) {
        this.order = order;
    }
    /**
     * Обробка оплати для оплаченого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані оплати.
     */
    @Override
    public void pay(Order order) {
        System.out.println("PaidState: замовлення вже оплачене.");
    }

    /**
     * Обробка відправлення для оплаченого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані оплати.
     */
    @Override
    public void ship(Order order) {
        System.out.println("PaidState: відправляємо замовлення. Перехід у стан ShippedState.");
        order.setState(order.getShippedState());
    }
    /**
     * Обробка доставки для оплаченого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані оплати.
     */
    @Override
    public void deliver(Order order) {
        System.out.println("PaidState: не можна доставити замовлення, яке ще не відправлено.");
    }
    /**
     * Обробка скасування для оплаченого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані оплати.
     */
    @Override
    public void cancel(Order order) {
        System.out.println("PaidState: скасовуємо оплачене замовлення. Перехід у стан CancelledState.");
        order.setState(order.getCancelledState());
    }
}