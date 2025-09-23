import java.util.Scanner;

public class calculadora {
    private static Scanner sc = new Scanner(System.in);
    private static Double altura;
    private static Double peso;

    public static void main(String[] args) {

        // Laço infinito para garantir que o usuário informe um peso válido
        while (true) {
            try {
                System.out.print("Informe seu peso:  ");
                String pesoStr = sc.nextLine().replace(",", "");

                // Validação: verificar se contém apenas números (e ponto para decimais)
                if (!pesoStr.matches("[0-9]*\\.?[0-9]+")) { 
                    System.out.println(" Informe apenas números! ");
                    continue; // volta para o início do laço para pedir novamente
                }

                peso = Double.parseDouble(pesoStr);

                if (peso <= 0) {
                    System.out.println(" O peso não pode ser menor ou igual a 0 ");
                } else {
                    break; // sai do laço se for válido
                }
            } catch (Exception e) {
                System.out.println(" Informe apenas números: ");
            }
        }

        // Agora faz o mesmo para a altura
        while (true) {
            try {
                System.out.print("Informe sua altura:  ");
                String alturaStr = sc.nextLine().replace(",", "");

                // Validação: verificar se contém apenas números (e ponto)
                if (!alturaStr.matches("[0-9]*\\.?[0-9]+")) {
                    System.out.println(" Informe apenas números! ");
                    continue;
                }

                altura = Double.parseDouble(alturaStr);

                if (altura <= 0) {
                    System.out.println(" A altura não pode ser menor ou igual a 0 ");
                } else {
                    break; // sai do laço se for válido
                }
            } catch (Exception e) {
                System.out.println(" Informe apenas números: ");
            }
        }
    }
}


