import java.util.Scanner;

public class MostraNumerosImpares {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroLimiteParaMostrarImpares = obterNumeroLimiteParaMostrarImpares("Show dos ímpares!\nDigite um número:");
        mostrarImpares(numeroLimiteParaMostrarImpares);
    }

    private static int obterNumeroLimiteParaMostrarImpares(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }

    private static void mostrarImpares(int numeroLimiteParaMostrarImpares) {
        for (int imparASerMostrado = 1; imparASerMostrado <= numeroLimiteParaMostrarImpares; imparASerMostrado+=2) {
            System.out.println(imparASerMostrado);
        }
    }
}
