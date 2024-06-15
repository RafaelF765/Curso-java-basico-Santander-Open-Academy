import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o primeiro valor");
        int segundoParametro = terminal.nextInt();

        try {
            // Chamando o método  contendo a lógica de contagem
            contar(primeiroParametro, segundoParametro);
            
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
    }

  /**
 * @param primeiroParametro
 * @param segundoParametro
 * @throws ParametrosInvalidosException
 */
static void contar(int primeiroParametro, int segundoParametro)throws ParametrosInvalidosException {
    // Válidar se primeiroParametro e MAIOR que segundoParametro e lançar a exceção.
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException(segundoParametro);
        }
        int contagem = segundoParametro -primeiroParametro;
        // realizar o for para imprimir com base na variavél contagem
        for(int i = contagem; i > 0; i--){
            System.out.println("Imprimindo o "+ i +" valor: "+contagem--);
        }
        
    }
}
