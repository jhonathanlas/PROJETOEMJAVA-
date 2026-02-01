import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name = scanner.nextLine();

        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        boolean isEmancipado = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s, você tem %d anos e pode dirigir.%n", name, age);

        } else if (age >= 16 && isEmancipado) {
            System.out.printf(
                "%s, apesar de ter %d anos, você é emancipado e pode dirigir.%n",
                name, age
            );

        } else {
            System.out.printf("%s, você não pode dirigir.%n", name);
        }

        System.out.println("Fim da execução");
        scanner.close();
    }
}

