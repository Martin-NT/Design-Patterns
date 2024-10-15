package org.example;

public class PrenderServer {
    private IServer servidor ;
    public PrenderServer(IServer servidor) {
        this.servidor = servidor ;
    }

    public void execute() {
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.prendete();
        servidor.apagate();
        servidor.cerraConexion();
    }
}
