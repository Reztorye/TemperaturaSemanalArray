package atv;

import java.util.Scanner;

public class media_temp {
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     String[] dias= new String[7];
     dias[0]="domingo";
     dias[1]="segunda";
     dias[2]="terça";
     dias[3]="quarta";
     dias[4]="quinta";
     dias[5]="sexta";
     dias[6]="sabado";
     int[]temp =new int[7];
     int soma=0;
     System.out.println("digite a temperatura para cada dia da semana:");
     for(int i=0;i<temp.length;i++) {
         System.out.print("\na temperatura de "+ dias[i]+" é: ");
            temp[i] = scanner.nextInt();
            soma+=temp[i];
        }

     int maior = temp[0], menor =temp[0];
     int indiceMaior = 0, indiceMenor = 0;

     for(int i=1;i<temp.length;i++) {
            if (temp[i] < menor) {
                menor = temp[i];
                indiceMenor=i;
            }

            if (temp[i] > maior) {
                maior = temp[i];
                indiceMaior=i;
            }
            }
     double media = (double) soma / temp.length;

     System.out.println("\nO resumo das temperaturas:\n");

     System.out.println("A menor temperatura foi de " + menor + " no " + dias[indiceMenor]+".\n");
     System.out.println("A maior temperatura foi de " + maior + " no " + dias[indiceMaior]+".\n");
     System.out.println("A média das temperaturas é: " + media+".");

    scanner.close();
 }
}