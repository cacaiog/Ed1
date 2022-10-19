package AtividadeSenhaBanco;

import java.util.Scanner;
import AtividadeSenhaBanco.Desenvolvimento.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueComQtd<Integer> fila;
        int senha = 1;
        char op;
        fila = new QueueComQtd(20);
        

        do{
            menu();
            op = sc.next().charAt(0);
            switch(op){

                case '1': 
                if(fila.isFull()){
                    System.out.println("Fila está cheia, voltei em outro momento");
                } else if (fila.isEmpty()){
                    System.out.println("Sua senha é: " + "[" + senha +"]" + " Vá até o caixa");
                    fila.enQueue(senha);
                    senha++;
                } else{
                    fila.enQueue(senha);
                    System.out.println("Sua senha é: " +"[" + senha +"]" + " Aguarde!");
                    senha++;

                }
                break;

                case '2':
                if (fila.isEmpty()){
                    System.out.println("Não tem clientes na fila de espera");
                } else {
                    int senhaAtual = fila.deQueue();
                    System.out.println("Cliente da senha: " +"[" + senhaAtual +  "]"+ " atendido, Obrigado!");
                }
                break;

                case '0':
                System.out.println("Programa encerrado");
                break;

                default:
                System.out.println("Opção inválida!");
                            
            }


        } while (op != '0');
        sc.close();

    }

    public static void menu() {
        System.out.println( "1 - Emitir Senha");
        System.out.println("2 - Chamar Senha");
        System.out.println("0 - Fechar Programa");
        System.out.println("Escolha uma opcao: ");        
    }


   
}
