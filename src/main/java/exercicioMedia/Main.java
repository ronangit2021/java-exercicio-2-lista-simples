package exercicioMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		float valoresRecebidos;
		
		
		
		valoresRecebidos = obterValores();
		
		System.out.println(" a media é : "+ valoresRecebidos);
	
		
	}
	
	
	private float obterValores() {
		
		Scanner ler = new Scanner(System.in);
		
		List<Integer> valoresRecebidos = new ArrayList<Integer>();
		int condicao =0, testa=0;				
		float media, soma=0;
		
		while (condicao != -1) {			
			System.out.println("Digite um valor: ");
			valoresRecebidos.add(testa, ler.nextInt());
			soma = soma + valoresRecebidos.get(testa);
			if(testa==3) {
				System.out.println("Deseja continuar? 0 sim ou -1 não");
				condicao = ler.nextInt();
				testa=-1;
			}	
			
			
			testa++;
			
		}
		//Media aqui
		
		media = soma / valoresRecebidos.size();
		
		return media;
		
	}
	
}
