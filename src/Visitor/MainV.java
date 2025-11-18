package Visitor;
/**
 * Основний клас для запуску Visitor
 */
public class MainV {
    public static void main(String[] args) {
        Network rootNetwork = new Network("Головна мережа");

        Server mainServer = new Server("MainServer");
        Workstation ws1 = new Workstation("WS-1");
        Workstation ws2 = new Workstation("WS-2");
        Cable cable1 = new Cable("Cable-1");
        Cable cable2 = new Cable("Cable-2");

        Network subNetwork = new Network("Підмережа відділу розробки");
        subNetwork.addElement(new Workstation("Dev-1"));
        subNetwork.addElement(new Workstation("Dev-2"));
        subNetwork.addElement(new Cable("Dev-Cable"));

        rootNetwork.addElement(mainServer);
        rootNetwork.addElement(ws1);
        rootNetwork.addElement(ws2);
        rootNetwork.addElement(cable1);
        rootNetwork.addElement(cable2);
        rootNetwork.addElement(subNetwork);

        System.out.println("\nПеревірка з’єднання");
        rootNetwork.accept(new CheckConnectionVisitor());
    }
}