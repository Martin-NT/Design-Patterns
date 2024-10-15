package org.example;

public class ArgentinaServer implements IServer{
    @Override
    public void apagate() {
        System.out.println("Apagando el servidor en Argentina");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor en Argentina");
    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrando conexion con el servidor en Argentina");
    }
    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Argentina");
    }
    @Override
    public void verificaConexion() {
        System.out.println("Verificando conexion con el servidor de Argentina");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardar Log en Argentina");

    }
}
