package State;

/**
 * Клас, що представляє замовлення та управляє його станами.
 */
public class Order {
    private OrderState newState;
    private OrderState paidState;
    private OrderState shippedState;
    private OrderState deliveredState;
    private OrderState cancelledState;
    private OrderState currentState;
    /**
     * Конструктор для ініціалізації замовлення з початковим станом NewState.
     */
    public Order() {
        newState = new NewState(this);
        paidState = new PaidState(this);
        shippedState = new ShippedState(this);
        deliveredState = new DeliveredState(this);
        cancelledState = new CancelledState(this);

        currentState = newState;
        System.out.println("Створено замовлення в стані: " + currentState);
    }
    /**
     * Операція оплати замовлення.
     */
    public void pay() {
        currentState.pay(this);
    }

    /**
     * Операція відправлення замовлення.
     */
    public void ship() {
        currentState.ship(this);
    }
    /**
     * Операція доставки замовлення.
     */
    public void deliver() {
        currentState.deliver(this);
    }

    /**
     * Операція скасування замовлення.
     */
    public void cancel() {
        currentState.cancel(this);
    }
    /**
     * Встановити новий стан для замовлення.
     *
     * @param newState Новий стан для замовлення.
     */
    public void setState(OrderState newState) {
        this.currentState = newState;
        System.out.println("Поточний стан замовлення: " + currentState);
    }

    /**
     * Отримати стан NewState.
     *
     * @return Стан NewState.
     */
    public OrderState getNewState() {
        return newState;
    }
    /**
     * Отримати стан PaidState.
     *
     * @return Стан PaidState.
     */
    public OrderState getPaidState() {
        return paidState;
    }
    /**
     * Отримати стан ShippedState.
     *
     * @return Стан ShippedState.
     */
    public OrderState getShippedState() {
        return shippedState;
    }

    /**
     * Отримати стан DeliveredState.
     *
     * @return Стан DeliveredState.
     */
    public OrderState getDeliveredState() {
        return deliveredState;
    }

    /**
     * Отримати стан CancelledState.
     *
     * @return Стан CancelledState.
     */
    public OrderState getCancelledState() {
        return cancelledState;
    }
}