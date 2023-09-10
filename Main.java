import java.util.Scanner;

public class converte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double AJUSTE = 32.0;
        final double FATOR = 5.0 / 9.0;

        System.out.print("Digite o falor em fahenheit : ");
        double fahenheit = entrada.nextDouble();

        double celcis = (fahenheit - AJUSTE) * FATOR;
        String resultado = String.format("%.2f", celcis);

        System.out.println("Temperatura em celcis 'e "+ resultado);

        entrada.close();

    }
}
