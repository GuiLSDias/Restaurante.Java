

     package Restaurante;

        public class Teste {
            public static void main(String[] args) {
                // Criação de objetos
                Cliente cliente1 = new Cliente();
                cliente1.setNome("João da Silva");
                cliente1.setTelefone("123.456.789-00");
                cliente1.setDocumento("123.456.789-00");

                Mesa mesa1 = new Mesa(1, 4);

                Reserva reserva1 = new Reserva(1, "15/10/2022", cliente1, mesa1);

                // Exibição das informações
                reserva1.mostraReserva();
            }
        }

