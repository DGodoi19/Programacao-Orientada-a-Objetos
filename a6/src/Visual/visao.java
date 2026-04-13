package Visual;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import logic.Carro;
import logic.Fabricante;
import logic.Moto;
import logic.Veiculo;

public class visao {
	public static void main(String args[]) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String opcao = "";
		Veiculo objVeiculo = null;
		
		try {
			System.out.println("Moto ou Carro: ");
			opcao = leitor.readLine();
			if (opcao.equalsIgnoreCase("moto")) {
				objVeiculo = new Moto();
			} else if (opcao.equalsIgnoreCase("carro")) {
				objVeiculo = new Carro();
			} else {
				System.out.println("Error");
				return;
			}
			
			System.out.println("Qual é o modelo: ");
			objVeiculo.setModelo(leitor.readLine());
			
			System.out.println("Qual é o fabricante: ");
			objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
			
			System.out.println("Qual a cor: ");
			objVeiculo.setCor(leitor.readLine());
			
			if (opcao.equalsIgnoreCase("moto")) {
				System.out.println("Cilindrada: ");
				((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
			} else {
				System.out.println("Digite <S> se houver teto solar ");
				((Carro) objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
			}
			
			System.out.println("O modelo é: " + objVeiculo.getModelo());
			System.out.println("O fabricante é: " + objVeiculo.getObjFabricante().getNome());
			
			System.out.println("A cor é: " + objVeiculo.getCor());
			
			if (opcao.equalsIgnoreCase("moto")) {
				System.out.println("Cilindrada é: " + ((Moto) objVeiculo).getCilindrada());
			} else {
				System.out.println("Tem teto solar: " + (((Carro) objVeiculo).isTetoSolar() ? "SIM":"NÃO"));
			}			
			
		} catch (Exception error) {
			System.out.println(error);
		}
		
		
		
		
	}
	
}
