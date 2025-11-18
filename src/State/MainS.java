package State;
/**
 * Головний клас для тестування сценаріїв роботи з замовленнями.
 */
public class MainS {
    public static void main(String[] args) {
        System.out.println("Сценарій 1: нормальний життєвий цикл");
        Order order1 = new Order();
        order1.pay();
        order1.ship();
        order1.deliver();
        order1.cancel();

        System.out.println("\nСценарій 2: скасування на етапі New");
        Order order2 = new Order();
        order2.cancel();

        System.out.println("\nСценарій 3: скасування на етапі Paid");
        Order order3 = new Order();
        order3.pay();
        order3.cancel();
    }
}