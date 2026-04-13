package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import logic.Cilindro;
import logic.Cubo;
import logic.solido;

public class GeometryVision {
	public static void main(String args[]) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		solido objSolido = null;	
	
		int opcao = 0;
		
		try {
			
			System.out.print("Cubo <0> ou Cilindro <1>: ");
			opcao = Integer.parseInt(leitor.readLine());
			if (opcao == 0) {
				objSolido = new Cubo();
				System.out.print("Qual a aresta: ");
				((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
				//System.out.println("Volume do Cubo: " + (Math.pow(((Cubo) objSolido).getAresta(), 3)));
				//System.out.println("Area do Cubo: " + (Math.pow(((Cubo) objSolido).getAresta(), 2) * 6));
			}else {
				objSolido = new Cilindro();
				System.out.println("Qual o raio: ");
				((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
				System.out.println("Qual a altura: ");
				((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
				//System.out.println("Volume do Cilindro: ");
			}
			
	

			
			
			
			
			
			
		} catch (Exception error) {
			System.out.println(error);
		}
		
		System.out.println("Volume: " + objSolido.calcularVolume());
		System.out.println("Area total: " + objSolido.calcularArea());
	}
}
