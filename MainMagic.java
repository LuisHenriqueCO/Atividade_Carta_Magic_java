package atividade_pilha;

import java.util.Scanner;

public class MainMagic {

	public static void main(String[] args) {	
		PilhaMagic pilha = new PilhaMagic();
		
		while (true) {
		
			System.out.println("===============Menu Magic===============");
			System.out.println("1 - Adicionar Magia");
			System.out.println("2 - Remover Magia Recente");
			System.out.println("3 - Exibir Magias");
			System.out.println("4 - Remover todas as magias");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			Scanner inputOpcao = new Scanner(System.in);
			int opcao = inputOpcao.nextInt();
			
			if (opcao == 0) {
				break;
			} else if(opcao == 1) {			
				while(true) {
					Magic magic = new Magic();
					
		            System.out.print("Digite o nome da mágica: ");
		            Scanner inputNome = new Scanner(System.in);
					String nome = inputNome.nextLine();
					magic.setName(nome);
					
					String[] tipoMagia = {"Terreno", "Criatura", "Encantamento", "Artefato", "Planeswalker", "Feitiço"};
					
					while (true) {
						System.out.print("Digite o tipo da mágica: ");
					    Scanner inputTipo = new Scanner(System.in);
					    String tipo = inputTipo.nextLine();

					    boolean tipoValido = false;
					    for (String tipoValidoMagia : tipoMagia) {
					        if (tipoValidoMagia.equals(tipo)) {
					            tipoValido = true;
					            break;
					        }
					    }

					    if (tipoValido) {
					        magic.setType(tipo);
					        break;
					    } else {
					        System.out.println("Tipo de Magia inválida, insira um tipo válido.");
					    }
					}
						
					System.out.print("Digite o custo da mágica: ");
					Scanner inputCusto = new Scanner(System.in);
					int custo = inputCusto.nextInt();
					magic.setCost(custo);
						
					System.out.print("Digite o efeito da mágica: ");
					Scanner inputEfeito = new Scanner(System.in);
					String efeito = inputEfeito.nextLine();
					magic.setEffect(efeito);
						
					pilha.push(magic);
					
					break;
					
				} 
			} else if (opcao == 2) {
				if (pilha.isEmpty()) {
					System.out.println("Não tem magias inseridas");
			    } else {
			    	System.out.println("Magia removida: ");
			        Magic removedMagic = pilha.pop();
			        System.out.println(removedMagic);
			    }
				
			} else if (opcao == 3) {
				if (pilha.isEmpty()) {
			        System.out.println("Não tem magias inseridas");
			    } else {
			        System.out.println("Listas de Magias:");
			        for (int i = pilha.size() - 1; i >= 0; i--) {
			            Magic magic = pilha.get(i);
			            System.out.println(magic);
			            System.out.println("----------------------");
			        }
			    }
			} else if (opcao == 4) {
				pilha.clear();
			    System.out.println("Todas as magias foram removidas");
			} else {
				System.out.println("Opção inválida, por favor, insira uma opção válida");
			}
		}
	}
}

