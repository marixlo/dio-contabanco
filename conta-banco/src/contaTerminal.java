import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nome;
        int numero;
        String agencia;
        float saldo = 10000.f;

        Scanner scan = new Scanner (System.in);

        System.out.println(" Digite seu nome: ");
            nome = scan.nextLine();
        System.out.println(" Digite o numero da sua conta:");
            numero=scan.nextInt();
            scan.nextLine();
        System.out.println(" Digite o número da sua agencia : ");
           agencia = scan.nextLine();

        System.out.println( " olá" + " "+ nome+ " o número da sua conta é"+ " "+ numero+ "o número da sua agencia é "+ " " + agencia +" e seu saldo " + saldo + " está disponivel para saque");
        
        
    }
}
