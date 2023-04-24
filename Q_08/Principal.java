package Q_08;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int opcao;
	        do {
	            System.out.println("MENU DE OP��ES:");
	            System.out.println("1 - Somar dois n�meros");
	            System.out.println("2 - Calcular a raiz quadrada de um n�mero");
	            System.out.println("0 - Sair do programa");
	            System.out.print("Digite a op��o desejada: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o primeiro n�mero: ");
	                    double numero1 = scanner.nextDouble();
	                    System.out.print("Digite o segundo n�mero: ");
	                    double numero2 = scanner.nextDouble();
	                    double resultadoSoma = numero1 + numero2;
	                    System.out.printf("A soma de %.2f e %.2f � igual a %.2f\n", numero1, numero2, resultadoSoma);
	                    break;
	                case 2:
	                    System.out.print("Digite um n�mero para calcular a raiz quadrada: ");
	                    double numeroRaiz = scanner.nextDouble();
	                    double resultadoRaiz = Math.sqrt(numeroRaiz);
	                    System.out.printf("A raiz quadrada de %.2f � igual a %.2f\n", numeroRaiz, resultadoRaiz);
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Op��o inv�lida. Digite novamente.");
	                    break;
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
}
