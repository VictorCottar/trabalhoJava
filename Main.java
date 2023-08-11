import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static int[] alocarNumeros(int[] numeros) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número para o Vetor: ");
        numeros[0] = sc.nextInt();

        System.out.println("Digite o segundo número para o Vetor: ");
        numeros[1] = sc.nextInt();

        System.out.println("Digite o terceiro número para o Vetor: ");
        numeros[2] = sc.nextInt();

        System.out.println("Digite o quarto número para o Vetor: ");
        numeros[3] = sc.nextInt();

        return numeros;
    }


    public static int[] imprimirNumeros(int[] numeros) {
        for (int n : numeros) {
            System.out.println(n);
        }
        return numeros;
    }



    public static void finalizarMenu() {
        System.out.println("MENU FINALIZADO.");
        System.exit(0);
    }



     public static int voltarMenu() {

         Scanner sc = new Scanner(System.in);
         int v;
         int m = 0;

         System.out.println("APERTE 1 PARA VOLTAR AO MENU.");
         v = sc.nextInt();

         if (v == 1) {
             while( m!= 0);
         }


         return v;
     }



     public static int[] alterarNumeros(int[] numeros) {

        int a;
        int j;

        Scanner sc = new Scanner(System.in);

         System.out.println("QUAL ÍNDICE VOCÊ QUER MUDAR: ");
         System.out.println("ÍNDICE 1 - " + numeros[0]);
         System.out.println("ÍNDICE 2 - " + numeros[1]);
         System.out.println("ÍNDICE 3 - " + numeros[2]);
         System.out.println("ÍNDICE 4 - " + numeros[3]);
         j = sc.nextInt();

         System.out.println("DIGITE O NOVO VALOR DO ÍNDICE: ");
         a = sc.nextInt();

         if  (j < 0 || j > 4) {
             System.out.println("O VETOR É LIMITADO A QUATRO NÚMEROS!.");
         } else {
             if (j == 1) {
                 numeros[0] = a;

             } else if (j == 2) {
                 numeros[1] = a;

             } else if (j == 3) {
                 numeros[2] = a;

             } else {
                 numeros[3] = a;
             }

         }

         System.out.println();
         System.out.println("VETOR ATUALIZADO.");
         System.out.println(numeros);

         return numeros;
     }





    public static int[] removerNumeros(int[] numeros) {

        int r;
        Scanner sc = new Scanner(System.in);


        System.out.println("QUAL ÍNDICE DO VETOR VOCÊ DESEJA REMOVER: ");
        System.out.println("ÍNDICE 1 - " + numeros[0]);
        System.out.println("ÍNDICE 2 - " + numeros[1]);
        System.out.println("ÍNDICE 3 - " + numeros[2]);
        System.out.println("ÍNDICE 4 - " + numeros[3]);
        r = sc.nextInt();

        if (r < 0 || r > 4) {
            System.out.println("O VETOR É LIMITADO A QUATRO NÚMEROS!.");
        } else {
            if (r == 1) {
                numeros[0] = 0;

            } else if (r == 2) {
                numeros[1] = 0;

            } else if (r == 3) {
                numeros[2] = 0;

            } else {
                numeros[3] = 0;
            }

            System.out.println();
            System.out.println("VETOR ATUALIZADO.");
            System.out.println(numeros);
        }
        return numeros;
    }



    //PROGRAMA PRINCIPAL

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros;
        numeros = new int[4];
        int r;
        int m;
        int v;
        int a;

        System.out.println();
        System.out.println("BEM-VINDO AO MENU DO VETOR!");
        System.out.println();
        System.out.println("ESCREVA SEUS NÚMEROS PARA CONTINUAR.");
        System.out.println();
        alocarNumeros(numeros);
        System.out.println();
        System.out.println("BELEZA, AGORA VOCÊ PODE FAZER ESSAS SEGUINTES OPERAÇÕES.");
        System.out.println();
        System.out.println("1 - QUERO VER OS NÚMEROS DO MEU VETOR.");
        System.out.println("2 - QUERO REMOVER UM ÍNDICE DO MEU VETOR.");
        System.out.println("3 - QUERO MUDAR O VALOR DO ÍNDICE DO MEU VETOR.");
        System.out.println("4 - FINALIZAR MENU.");
        System.out.println();
        m = sc.nextInt();

        if (m < 0 || m > 4) {
            System.out.println("NOSSO MENU TEM APENAS 4 OPÇÕES!.");
        } else {
            if (m == 1) {
                System.out.println("AQUI ESTÃO OS NÚMEROS DO SEU VETOR!.");
                imprimirNumeros(numeros);
                System.out.println();
                voltarMenu();

            } else if (m == 2) {
                removerNumeros(numeros);
                System.out.println();
                voltarMenu();

            } else if (m == 3) {
                alterarNumeros(numeros);
                voltarMenu();

            } else {
                finalizarMenu();
            }

        }
    }

}


