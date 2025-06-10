import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static String MENSAGEM_NOME = "Ola, informe seu nome: ";
    private final static String MENSAGEM_IDADE = "Ola, informe sua idade: ";

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var scanner = new Scanner(System.in);

        System.out.println(MENSAGEM_NOME);
        var nome = scanner.next();

        System.out.println(MENSAGEM_IDADE);
        var idade = scanner.nextInt();

        System.out.printf("Ola %s, sua idade é %s. \n", nome, idade);
    }
}