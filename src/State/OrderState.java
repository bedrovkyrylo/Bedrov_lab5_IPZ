package State;
/**
 * Інтерфейс для визначення різних станів замовлення.
 * Кожен конкретний стан (NewState, PaidState, ShippedState, тощо) має реалізовувати ці методи.
 */
public interface OrderState {
    void pay(Order order);
    void ship(Order order);
    void deliver(Order order);
    void cancel(Order order);
}