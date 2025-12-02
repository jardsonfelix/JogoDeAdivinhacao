package aplicacao;

import java.util.Random;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("~~~~~~JOGO DE ADINHAR O NÚMERO!~~~~~~");
		System.out.println();
		int numGerado = rd.nextInt(1,100);
		System.out.println(numGerado);
		
		System.out.print("Escolha um número entre 1 e 100!");
		
		int numChutado = sc.nextInt();
		int cont = 10;
		int tentativas = 0;
		
		while(numChutado != numGerado ) {
			if(numChutado > numGerado) {
				System.out.print("Calma zero meia! Um pouco menos.");
				numChutado = sc.nextInt();
				cont--;
				tentativas++;
			}
			
			if(numChutado < numGerado) {
				System.out.print("Ai tu quer Humilhar né! um pouquinho mais.");
				numChutado = sc.nextInt();
				cont--;
				tentativas++;
			}
			if(numChutado == numGerado){
				System.out.println("Parabéns, vc acertou!");
				cont--;
				tentativas++;
			}
			
			if(cont == 0) {
				System.out.println("Acabaram suas tentativas!");
				break;
			}
			
		}
		
		System.out.print("O numero sorteado foi " + numGerado +"!");
		System.out.println();
		System.out.println("Você usou " + tentativas+ " tentativa(s).");
		System.out.println();
		
		if(tentativas <= 5) {
			System.out.println("O menino é bom! usou apenas " + tentativas+" tentativa()s.");
		}
		if(tentativas > 5) {
			System.out.println("Pensei que não ia conseguir! usou "+tentativas+" tentativa()s.");
		}
		System.out.println("~~~~~~FIM!~~~~~~");
	}

}
