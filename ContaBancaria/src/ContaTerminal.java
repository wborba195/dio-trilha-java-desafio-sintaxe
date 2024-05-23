import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite a sua agência");
        int agencia = scanner.nextInt();    
    
        System.out.println("Digite a sua conta");
        String conta = scanner.next(); 
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Prezado, " + nome + "!");
        System.out.println("Seu saldo, na AG/CC: " + agencia + "/" + conta + " é de R$:" + saldo);
    }
}
