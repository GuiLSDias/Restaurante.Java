package Restaurante;

public class Reserva{
    private int numero;
    private String data;

    Cliente cli;


 void mostrareserva(){
     System.out.println("--------Número da reserva--------- \n"+ this.numero);
     System.out.println("data da reserva: "+ this.data);
     System.out.println("Nome do cliente: "+ this.cli.getNome());
     System.out.println("Nome do cliente: "+ this.cli.getTelefone());
     System.out.println("documento do cliente: "+ this.cli.getDocumento());
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


}
