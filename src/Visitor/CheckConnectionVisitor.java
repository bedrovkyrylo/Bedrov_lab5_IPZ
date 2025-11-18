package Visitor;
/**
 * Відвідувач для перевірки з'єднання в мережі.
 */
public class CheckConnectionVisitor implements NetworkVisitor {
    /**
     * Перевірка з'єднання для кабелю.
     *
     * @param cable Кабель для перевірки.
     */
    @Override
    public void visitCable(Cable cable) {
        System.out.println("CheckConnectionVisitor: перевіряю кабель " + cable.getName());
    }
    /**
     * Перевірка з'єднання для сервера.
     *
     * @param server Сервер для перевірки.
     */
    @Override
    public void visitServer(Server server) {
        System.out.println("CheckConnectionVisitor: перевіряю сервер " + server.getName());
    }
    /**
     * Перевірка з'єднання для робочої станції.
     *
     * @param workstation Робоча станція для перевірки.
     */
    @Override
    public void visitWorkstation(Workstation workstation) {
        System.out.println("CheckConnectionVisitor: перевіряю робочу станцію " + workstation.getName());
    }

    @Override
    public void visitNetwork(Network network) {
        System.out.println("CheckConnectionVisitor: перевіряю мережу " + network.getName());
    }
}