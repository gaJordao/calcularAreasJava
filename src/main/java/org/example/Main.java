package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para calcular a média aritmética e 2 para a media ponderada:");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o primeiro número: ");
                double nota_aritimetica1 = scanner.nextDouble();
                Validacao val = new Validacao(nota_aritimetica1);
                while (true){
                    try {
                        System.out.println(!val.validaNota(nota_aritimetica1));
                    }catch (Exception e){
                        System.out.println("Digite um número entre 0 e 10");
                        continue;
                    }
                    break;
                }

                System.out.println("Digite o segundo número: ");
                double nota_aritimetica2 = scanner.nextDouble();
                Validacao val2 = new Validacao(nota_aritimetica2);
                System.out.println(val2.validaNota(nota_aritimetica2));

                EntradaSaida aritimetica = new EntradaSaida(nota_aritimetica1, nota_aritimetica2);

                aritimetica.setN1(nota_aritimetica1);
                aritimetica.setN2(nota_aritimetica2);
                System.out.println(aritimetica.getN1());
                System.out.println(aritimetica.getN2());
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                double nota_ponderada1 = scanner.nextDouble();

                System.out.println("Digite o segundo número: ");
                double nota_ponderada2 = scanner.nextDouble();

                System.out.println("Digite o valor da primeira nota: ");
                double peso1 = scanner.nextDouble();

                System.out.println("Digite o valor da segunda nota: ");
                double peso2 = scanner.nextDouble();

                EntradaSaida ponderada = new EntradaSaida(nota_ponderada1, nota_ponderada2, peso1, peso2);

                ponderada.setN1(nota_ponderada1);
                ponderada.setN2(nota_ponderada2);

                ponderada.setP1(peso1);
                ponderada.setP2(peso2);
                System.out.println(ponderada.getN1());
                System.out.println(ponderada.getN2());

                System.out.println(ponderada.getP1());
                System.out.println(ponderada.getP2());
                break;
        }
    }
}