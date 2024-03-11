package Restaurante;

public class Reserva {
    private int numero;
    private String data;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(int numero, String data, Cliente cliente, Mesa mesa) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void mostraReserva() {
        System.out.println("------------Reserva------------");
        System.out.println("Número da Reserva: " + this.numero);
        System.out.println("Data: " + this.data);
        System.out.println("\n------------Cliente------------ ");
        this.cliente.mostraCliente();
        System.out.println("\n-------------Mesa------------ ");
        this.mesa.mostraMesa();
    }
}