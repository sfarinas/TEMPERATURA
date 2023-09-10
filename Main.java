import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // CONTANTES AJUTE E FATOR
        final double AJUSTE = 32.0;
        final double FATOR = 5.0 / 9.0; // 5/9
        //formula : (F - 32 x 5/9 = C )

        System.out.print("Digite a temperatura em fahenheit : ");
        double fahenheit = entrada.nextDouble();

        double celsius = (fahenheit - AJUSTE) * FATOR;
        System.out.println("Temperatura em Celsis: " + celsius);

        entrada.close();

    }
}