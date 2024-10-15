package org.example;

public class ApagarServer implements Command{
    private final IServer servidor;
    public ApagarServer(IServer servidor) {
        this.servidor = servidor;
    }

    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.apagate();
        servidor.cerraConexion();
    }
}
