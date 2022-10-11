
package Queue;

import Queue.Desenvolvimento.Queue;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue <Integer>fila = new Queue();
        int pedido;
        char op;
        System.out.println("lanchonete joao e maria");
        do {
            menu();
            op = in.next().charAt(0);
            switch (op) {
                case '1':
                    System.out.println("informe o numero do pedido: ");
                    pedido = in.nextInt();
                    fila.enQueue(pedido);
                    System.out.println("[" + pedido +"]"+  " pedido registrado aguarde!");
                    break;
                case '2':
                    if (fila.isEmpty()) {
                        System.err.println("nao existe pedidos pendentes");
                    } else {
                    int numPedido = (int) fila.head();
                    fila.deQueue();
                    System.out.println("pedido: "+ "[" + numPedido + "]" + " registrado!");
                    }
                    break;
                case '0':
                    
                    System.out.println("Programa Fechado");
                   
                    break;
                default:
                    System.err.println("Opção inválida!");
            }
        } while (op != '0');

    }

    public static void menu() {
        System.out.println( "1 - Anotar pedido");
        System.out.println("2 - Registrar atendimento");
        System.out.println("0 - Fechar lanchonete");
        System.out.println("Escolha uma opcao: ");        
    }


    
}
