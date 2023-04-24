package Q_08;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int opcao;
	        do {
	            System.out.println("MENU DE OPÇÕES:");
	            System.out.println("1 - Somar dois números");
	            System.out.println("2 - Calcular a raiz quadrada de um número");
	            System.out.println("0 - Sair do programa");
	            System.out.print("Digite a opção desejada: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o primeiro número: ");
	                    double numero1 = scanner.nextDouble();
	                    System.out.print("Digite o segundo número: ");
	                    double numero2 = scanner.nextDouble();
	                    double resultadoSoma = numero1 + numero2;
	                    System.out.printf("A soma de %.2f e %.2f é igual a %.2f\n", numero1, numero2, resultadoSoma);
	                    break;
	                case 2:
	                    System.out.print("Digite um número para calcular a raiz quadrada: ");
	                    double numeroRaiz = scanner.nextDouble();
	                    double resultadoRaiz = Math.sqrt(numeroRaiz);
	                    System.out.printf("A raiz quadrada de %.2f é igual a %.2f\n", numeroRaiz, resultadoRaiz);
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Digite novamente.");
	                    break;
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
}
