package State;
/**
 * Клас, що представляє стан замовлення, коли воно скасоване.
 */
public class CancelledState implements OrderState {
    private Order order;
    /**
     * Конструктор для ініціалізації скасованого стану.
     *
     * @param order Замовлення, яке знаходиться у стані скасування.
     */
    public CancelledState(Order order) {
        this.order = order;
    }
    /**
     * Обробка оплати для скасованого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані скасування.
     */
    @Override
    public void pay(Order order) {
        System.out.println("CancelledState: замовлення скасовано, оплата неможлива.");
    }
    /**
     * Обробка відправлення для скасованого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані скасування.
     */
    @Override
    public void ship(Order order) {
        System.out.println("CancelledState: замовлення скасовано, відправлення неможливе.");
    }

    /**
     * Обробка доставки для скасованого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані скасування.
     */
    @Override
    public void deliver(Order order) {
        System.out.println("CancelledState: замовлення скасовано, доставка неможлива.");
    }
    /**
     * Обробка скасування для скасованого замовлення.
     *
     * @param order Замовлення, яке знаходиться у стані скасування.
     */
    @Override
    public void cancel(Order order) {
        System.out.println("CancelledState: замовлення вже скасовано.");
    }
}