
import java.util.Scanner;
public class MovimentaConta {

    static String cadnome;
    static int cadCPF;
    static int cadSenha;


    public static void criarccorrente() {
        // Criar uma instancia da conta corrente e do metodo cadastro
        Corrente cont01 = new Corrente();
        MovimentaConta.cadastro();
        cont01.setNome(cadnome);
        cont01.setCpf(cadCPF);
        cont01.setSenha(cadSenha);
        System.out.println("Conta Corrente");
        System.out.println(cont01.getNome());
        System.out.println(cont01.getCpf());
        System.out.println(cont01.getSenha());
    } // fim do metodo criaccorrente

    public static void criarcpoupanca() {
        // Criar uma instancia da poupanca e do metodo cadastro
        Corrente cont01 = new Corrente();
        MovimentaConta.cadastro();
        cont01.setNome(cadnome);
        cont01.setCpf(cadCPF);
        cont01.setSenha(cadSenha);
        System.out.println("Conta Poupança");
        System.out.println(cont01.getNome());
        System.out.println(cont01.getCpf());
        System.out.println(cont01.getSenha());
    } // fim do metodo poupanca
    public static void movsaque() {

    } // fim do metodo saque
    public static void movdeposito() {

    } // fim do metodo deposito
    public static void consulta() {

    } // fim do metodo consulta
    public static void cadastro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite seu nome: ");
        cadnome = sc.nextLine();

        System.out.print("\nDigite seu CPF: ");
        cadCPF = sc.nextInt();

        System.out.print("\nDigite sua senha: ");
        cadSenha = sc.nextInt();

    } // fim do metodo consulta
} // fim da classe movimenta conta
