import java.util.Scanner; // Uso da classe Scanner no código.

public class calculadora {
    private static Scanner sc = new Scanner(System.in);
    private static Double altura;
    private static Double peso;

    public static void main(String[] args) {

        // Laço para peso válido
        while (true) {
                try {
                    System.out.print("Informe seu peso (kg):  ");
                    String pesoStr = sc.nextLine().replace(",", "."); // aceita vírgula

                //  Aceita apenas números e ponto decimal
                if (!pesoStr.matches("[0-9]*\\.?[0-9]+")) { 
                    System.out.println("Informe apenas números!");
                    continue; // volta 
                }

                peso = Double.parseDouble(pesoStr);

                if (peso <= 0) {
                    System.out.println("O peso não pode ser menor ou igual a 0");
                }
                else {
                    break; // sai do laço se o valor for válido
                }
            } 
                catch (Exception e) {
                    System.out.println("Erro! Informe apenas números."); // Se der erro dentro do try, executa o que está no catch.
            }
        }

        // Laço para altura válida
        while (true) {
                 try {
                    System.out.print("Informe sua altura (m):  ");
                    String alturaStr = sc.nextLine().replace(",", ".");

                if (!alturaStr.matches("[0-9]*\\.?[0-9]+")) {
                    System.out.println("Informe apenas números!");
                    continue;
                }

                altura = Double.parseDouble(alturaStr); // Transforma string em número decimal 

                if (altura <= 0) {
                    System.out.println("A altura não pode ser menor ou igual a 0");
                }
                else {
                    break;
                }
            } 
                catch (Exception e) {
                    System.out.println("Erro! Informe apenas números.");
            }
        }

            double imc = peso / (altura * altura); 

            // Exibe o resultado(decimais)
            System.out.printf("Seu IMC é: %.2f\n", imc);

    
                 if (imc < 18.5) {
                    System.out.println("Classificação: Abaixo do peso");
        } 
                else if (imc < 24.9) {
                     System.out.println("Classificação: Peso normal");
        } 
                else if (imc < 29.9) {
                     System.out.println("Classificação: Sobrepeso");
        } 
                else if (imc < 34.9) {
                    System.out.println("Classificação: Obesidade Grau I");
        } 
                else if (imc < 39.9) {
                    System.out.println("Classificação: Obesidade Grau II");
        } 
                else {
                    System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }
    }
}



