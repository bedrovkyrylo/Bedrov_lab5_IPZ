package Visitor;
/**
 * Інтерфейс для відвідувачів мережі.
 */
public interface NetworkVisitor {
    void visitCable(Cable cable);
    void visitServer(Server server);
    void visitWorkstation(Workstation workstation);
    void visitNetwork(Network network);
}