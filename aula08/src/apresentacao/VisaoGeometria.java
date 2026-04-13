package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class VisaoGeometria {
	public static void main(String[] args) {
		//Declaração de varáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Solido objSolido = null;
		int opcao = 0;
		
		//Entrada de dados
		
		try {
			
			System.out.print("Digite <1> para Cubo ou " + 
									" <2> para Cilindro:");
			opcao = Integer.parseInt(leitor.readLine());
			
			if (opcao == 1) {
				objSolido = new Cubo();
				new Cubo()
;
				System.out.print("Digite a aresta: ");
				((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
				
			}else {
				objSolido = new Cilindro();
				
				System.out.print("Digite o raio : ");
				((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
				
				System.out.print("Digite a altura : ");
				((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
			}
			
			
		} catch (Exception erro) {
			System.out.println(erro);
			
		}
		//Saída de dados 
		System.out.println("Área total: " + objSolido.calcularArea());
		System.out.println("Volume: " + objSolido.calcularVolume());
		
	}
}
