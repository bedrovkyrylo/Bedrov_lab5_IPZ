package State;
/**
 * Клас, що представляє стан замовлення, коли воно нове.
 */
public class NewState implements OrderState {
    private Order order;
    /**
     * Конструктор для ініціалізації нового стану.
     *
     * @param order Замовлення, яке знаходиться у новому стані.
     */
    public NewState(Order order) {
        this.order = order;
    }
    /**
     * Обробка оплати для нового замовлення.
     *
     * @param order Замовлення, яке знаходиться у новому стані.
     */
    @Override
    public void pay(Order order) {
        System.out.println("NewState: оплата замовлення. Перехід у стан PaidState.");
        order.setState(order.getPaidState());
    }
    /**
     * Обробка відправлення для нового замовлення.
     *
     * @param order Замовлення, яке знаходиться у новому стані.
     */
    @Override
    public void ship(Order order) {
        System.out.println("NewState: не можна відправити неоплачене замовлення.");
    }
    /**
     * Обробка доставки для нового замовлення.
     *
     * @param order Замовлення, яке знаходиться у новому стані.
     */
    @Override
    public void deliver(Order order) {
        System.out.println("NewState: не можна доставити неоплачене замовлення.");
    }
    /**
     * Обробка скасування для нового замовлення.
     *
     * @param order Замовлення, яке знаходиться у новому стані.
     */
    @Override
    public void cancel(Order order) {
        System.out.println("NewState: скасування замовлення. Перехід у стан CancelledState.");
        order.setState(order.getCancelledState());
    }
}