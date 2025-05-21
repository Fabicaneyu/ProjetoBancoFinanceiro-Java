/*
Opções cliente
1 - criar CC
2 - criar poupança
3 - Saque
4 - Deposito
5 - Consulta Saldo
 */
import java.util.Scanner;

public class Main {
    // psvm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1- Criar Conta Corrente");
        System.out.println("2- Criar Conta Poupança ");
        System.out.println("3- Saque");
        System.out.println("4- Depósito");
        System.out.println("5- Consulta Saldo");
        System.out.print("Digite sua opção: ");
        int opcao = sc.nextInt();

        // codigo para escolha da opção
        // aqui vc instancia tudo da classe movimentaConta pois ela é tudo public da pra acessar

        switch (opcao) {
            case 1:
                MovimentaConta.criarccorrente();
                break;
            case 2:
                MovimentaConta.criarcpoupanca();
                break;

            case 3:
                MovimentaConta.movsaque();
                break;
            case 4:
                MovimentaConta.movdeposito();
                break;
            case 5:
                MovimentaConta.consulta();
                break;

            default:
        }
    }
}
