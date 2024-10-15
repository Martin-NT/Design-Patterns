package org.example;

public class ResetServer {
    private IServer servidor;
    public ResetServer(IServer servidor) {
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