package TemperaturaSemanalArray;

import java.util.Scanner;

public class TemperaturaSemanalArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Registro de Temperaturas Semanal");
		
		System.out.println("Por favor, insira as temperaturas para cada dia semana.");
		int[] semana = new int[7];
		
		for(int i = 0; i < semana.length; i++) {
			if(semana[i] == semana [0]) {
				System.out.print("Digite a temperatura de segunda-feira: ");
				semana[0] = scanner.nextInt();
			} else if(semana[i] == semana [1]) {
				System.out.print("Digite a temperatura de terça-feira: ");
				semana[1] = scanner.nextInt();
			} else if(semana[i] == semana [2]) {
				System.out.print("Digite a temperatura de quarta-feira: ");
				semana[2] = scanner.nextInt();
			} else if(semana[i] == semana [3]) {
				System.out.print("Digite a temperatura de quinta-feira: ");
				semana[3] = scanner.nextInt();
			} else if(semana[i] == semana [4]) {
				System.out.print("Digite a temperatura de sexta-feira: ");
				semana[4] = scanner.nextInt();
			} else if(semana[i] == semana [5]) {
				System.out.print("Digite a temperatura de sábado: ");
				semana[5] = scanner.nextInt();
			} else if(semana[i] == semana [6]) {
				System.out.print("Digite a temperatura de domingo: ");
				semana[6] = scanner.nextInt();
			}
		}
		
		// temperaturaMedia = soma de semana[0] até semana[6]
		int temperaturaMedia = 0;
		for(int i = 0; i< semana.length; i++) {
			temperaturaMedia += semana[i];
		}
		
		System.out.println("Obrigado! Aqui está o resumo das temperaturas");
		
		System.out.println("Temperatura Média da Semana: " + temperaturaMedia / 7);
		
		 int diaQuente = semana[0];
	     int diaFrio = semana[0];
		
	     for(int i = 0; i < semana.length; i++) {
	    	 if(semana[i] > semana[0]) {
	    		 diaQuente = semana[i];
	    	 }
	    	   
	     }
	     
	     boolean temperaturaIgualDuranteSemana = true;
	     if (diaQuente == diaFrio) {
	    	 temperaturaIgualDuranteSemana = false;
	    	 System.out.println("A semana não tem diferenças climaticas.");
         }
	     
	     while(temperaturaIgualDuranteSemana) { 
	     if(diaQuente == semana[0]) {
	    		System.out.println("O dia mais quente é segunda-feira: " + semana[0]);
	    	} else if (diaQuente == semana[1]) {
	    		System.out.println("O dia mais quente é terça-feira: " + semana[1]);
	    	} else if (diaQuente == semana[2]) {
	    		System.out.println("O dia mais quente é quarta-feira: " + semana[2]);
	    	} else if (diaQuente == semana[3]) {
	    		System.out.println("O dia mais quente é quinta-feira: " + semana[3]);
	    	} else if (diaQuente == semana[4]) {
	    		System.out.println("O dia mais quente é sexta-feira: " + semana[4]);
	    	} else if (diaQuente == semana[5]) {
	    		System.out.println("O dia mais quente é sábado: " + semana[5]);
	    	} else if (diaQuente == semana[6]) {
	    		System.out.println("O dia mais quente é domingo: " + semana[6]);
	    	}   
	     
	     for(int i = 0; i < semana.length; i++) {
	    	 if(semana[i] < semana[0]) {
	    		 diaFrio = semana[i];
	    	 }
	     }
	     
	     if(diaFrio == semana[0]) {    	
	    		System.out.println("O dia mais frio é segunda-feira: " + semana[0]);
	    	} else if (diaFrio == semana[1]) {
	    		System.out.println("O dia mais frio é terça-feira: " + semana[1]);
	    	} else if (diaFrio == semana[2]) {
	    		System.out.println("O dia mais frio é quarta-feira: " + semana[2]);
	    	} else if (diaFrio == semana[3]) {
	    		System.out.println("O dia mais frio é quinta-feira: " + semana[3]);
	    	} else if (diaFrio == semana[4]) {
	    		System.out.println("O dia mais frio é sexta-feira: " + semana[4]);
	    	} else if (diaFrio == semana[5]) {
	    		System.out.println("O dia mais frio é sábado: " + semana[5]);
	    	} else if (diaFrio == semana[6]) {
	    		System.out.println("O dia mais frio é domingo: " + semana[6]);
	    	}      
	     
	     temperaturaIgualDuranteSemana = false;
	     }
	    
	     
	     
		scanner.close();
	}

}
