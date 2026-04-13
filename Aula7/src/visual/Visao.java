package visual;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import logica.Aguia;
import logica.Animal;
import logica.Ave;
import logica.Cachorro;
import logica.Leopardo;
import logica.Mamifero;

public class Visao {
	public static void main(String args[]) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Animal objAnimal = null; 
		String opcao1 = "";
		String opcao2 = "";

		
		try {
			System.out.println("Mamifero ou Ave: <Mamifero> <Ave>");
			opcao1 = leitor.readLine();
			
			if (opcao1.equalsIgnoreCase("Mamifero")) {
				System.out.println("Qual animal voce gostaria de registrar: <leopardo> <cachorro>");
				opcao2 = leitor.readLine();
				if (opcao2.equalsIgnoreCase("leopardo")) {
					objAnimal = new Leopardo();
				} else {
					objAnimal = new Cachorro();
				}
			} else if (opcao1.equalsIgnoreCase("Ave")) {
				System.out.println("Qual animal voce gostaria de registrar: <aguia>");
				opcao2 = leitor.readLine();
				objAnimal = new Aguia();
				
			}
			
			System.out.println("Qual é o nome do animal: ");
			objAnimal.setNome(leitor.readLine());
			
			System.out.println("Qual é o peso do animal: ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			
			System.out.println("Qual a altural do animal: ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			
			if (opcao1.equalsIgnoreCase("mamifero")) {
				if (opcao2.equalsIgnoreCase("leopardo")) {
					System.out.println("Qual a velocidade do leopardo: ");
					((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
					System.out.println("Litros de leite: ");
					((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
				} else {
					System.out.println("Qual a forca de mordida do cachorro: ");
					((Cachorro) objAnimal).setForcaMordida((Double.parseDouble(leitor.readLine())));
					System.out.println("Litros de leite: ");
					((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
				}
			} else {
				System.out.println("Qual a autonomia da aguia: ");
				((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
				System.out.println("Quantos ovos: ");
				((Ave) objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));
			}
			
			if (opcao1.equalsIgnoreCase("Mamifero")) {
				if (opcao2.equalsIgnoreCase("leopardo")) {
					System.out.println("Leopardo: " + objAnimal.getNome());
				} else {
					System.out.println("Cachorro: " + objAnimal.getNome());
				}
			} else {
				System.out.println("Aguia: " + objAnimal.getNome());
			}
			System.out.println("Peso: " + objAnimal.getPeso());
			System.out.println("Altura: " + objAnimal.getAltura());
			System.out.println("IMC: " + objAnimal.calcularImc());
			
			if (opcao1.equalsIgnoreCase("Mamifero")) {
				System.out.println("Litros de leite: "+ ((Mamifero) objAnimal).getLitrosLeite());
				if (opcao2.equalsIgnoreCase("leopardo")) {
					System.out.println("Velocidade: " + ((Leopardo) objAnimal).getVelocidade());
					((Leopardo) objAnimal).correr();
				} else {
					System.out.println("Forca Mordida: " + ((Cachorro) objAnimal).getForcaMordida());
					((Cachorro) objAnimal).morder();
				}
			} else {
				System.out.println("Autonomia: " + ((Aguia) objAnimal).getAutonomia());
				((Aguia) objAnimal).voar();
			}
			
			
			
		} catch (Exception error) {
			System.out.println(error);
		}
	}
}
