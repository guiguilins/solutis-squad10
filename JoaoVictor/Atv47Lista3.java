package JoaoVictor;
import java.util.Scanner;

public class Atv47Lista3 {
    public static void main(String[] args) {
        Paciente[] pacientes = lerPacientes();
        gerarRelatorio(pacientes);
    }

    public static Paciente[] lerPacientes() {
        Scanner scanner = new Scanner(System.in);
        Paciente[] pacientes = new Paciente[200];
        int count = 0;

        while (true) {
            System.out.print("Nome do paciente (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            pacientes[count] = new Paciente(nome, sexo, peso, idade, altura);
            count++;
        }

        return trimArray(pacientes, count);
    }

    public static void gerarRelatorio(Paciente[] pacientes) {
        System.out.println("\nRelatório:\n");
        System.out.println("i. Quantidade de pacientes: " + pacientes.length+"\n");
        System.out.println("ii. Média de idade dos homens: " + calcularMediaIdadeHomens(pacientes)+"\n");
        System.out.println("iii. Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + contarMulheresAlturaPeso(pacientes)+"\n");
        System.out.println("iv. Quantidade de pessoas com idade entre 18 e 25: " + contarPessoasIdade(pacientes, 18, 25)+"\n");
        System.out.println("v. Nome do paciente mais velho: " + encontrarPacienteMaisVelho(pacientes)+"\n");
        System.out.println("vi. Nome da mulher mais baixa: " + encontrarMulherMaisBaixa(pacientes)+"\n");
        System.out.println("vii. Pacientes com IMC maior que 30:");
        pacientesComIMCAlto(pacientes, 30);
    }

    public static double calcularMediaIdadeHomens(Paciente[] pacientes) {
        int somaIdades = 0;
        int count = 0;

        for (Paciente p : pacientes) {
            if (p.getSexo() == 'M' || p.getSexo() == 'm') {
                somaIdades += p.getIdade();
                count++;
            }
        }

        return (count > 0) ? (double) somaIdades / count : 0;
    }

    public static int contarMulheresAlturaPeso(Paciente[] pacientes) {
        int count = 0;

        for (Paciente p : pacientes) {
            if ((p.getSexo() == 'F' || p.getSexo() == 'f') && p.getAltura() >= 1.60 && p.getAltura() <= 1.70 && p.getPeso() > 70) {
                count++;
            }
        }

        return count;
    }

    public static int contarPessoasIdade(Paciente[] pacientes, int idadeMin, int idadeMax) {
        int count = 0;

        for (Paciente p : pacientes) {
            if (p.getIdade() >= idadeMin && p.getIdade() <= idadeMax) {
                count++;
            }
        }

        return count;
    }

    public static String encontrarPacienteMaisVelho(Paciente[] pacientes) {
        int maiorIdade = -1;
        String nomeMaisVelho = "";

        for (Paciente p : pacientes) {
            if (p.getIdade() > maiorIdade) {
                maiorIdade = p.getIdade();
                nomeMaisVelho = p.getNome();
            }
        }

        return nomeMaisVelho;
    }

    public static String encontrarMulherMaisBaixa(Paciente[] pacientes) {
        double menorAltura = Double.MAX_VALUE;
        String nomeMaisBaixa = "";

        for (Paciente p : pacientes) {
            if ((p.getSexo() == 'F' || p.getSexo() == 'f') && p.getAltura() < menorAltura) {
                menorAltura = p.getAltura();
                nomeMaisBaixa = p.getNome();
            }
        }

        return nomeMaisBaixa;
    }

    public static void pacientesComIMCAlto(Paciente[] pacientes, double imcLimite) {
        for (Paciente p : pacientes) {
            double imc = p.calcularIMC();
            if (imc > imcLimite) {
                System.out.println("O paciente " +p.getNome() + " tem IMC maior que " + imcLimite + " (IMC = " + imc + ")");
            }
        }
    }

    private static Paciente[] trimArray(Paciente[] pacientes, int count) {
        Paciente[] result = new Paciente[count];
        System.arraycopy(pacientes, 0, result, 0, count);
        return result;
    }
}

class Paciente {
    private String nome;
    private char sexo;
    private double peso;
    private int idade;
    private double altura;

    public Paciente(String nome, char sexo, double peso, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
