import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		 
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro valor");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo valor");
            int parametroDois = scanner.nextInt();
        
    
            try {
                contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException e) {
                System.out.println("O segundo valor informado deve ser maior que o primeiro!");
            }
        }
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		    if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		for(int e = 1; e <= contagem; e++) {
            System.out.println("Imprimindo o número " + e);
        }
	}
}

