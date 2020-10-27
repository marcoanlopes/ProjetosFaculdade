package menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gravar.Armazenamento;
import lista.Produtos;
import processadorArquivos.LeitorListas;
import registro.Pedidos;

public class ListarMenu {
	public static void abrirMenu() throws IOException, InterruptedException {
		Scanner leitor = new Scanner(System.in);
		List<Produtos> listaPratos = LeitorListas.LeitorPratos();
		List<Produtos> listaBebidas = LeitorListas.LeitorBebidas();
		List<Produtos> listaVinhos = LeitorListas.LeitorVinhos();

		List<Pedidos> listaPedidos = new ArrayList<>();
		List<Pedidos> listaPedidosArmazenados = new ArrayList<>();
		
		int retornoMenu = 0;

		
		do {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1- Listar os Pratos");
			System.out.println("2- Listar as Bebidas");
			System.out.println("3- Listar os Vinhos");
			System.out.println("4- Realizar o pedido");
			System.out.println("5- Adicionar itens");
			System.out.println("0- Para sair");
			int escolha = leitor.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("-----------------------------------");
				for (int i = 0; i < listaPratos.size(); i++) {
					System.out.println((i + 1) + "- Prato: " + listaPratos.get(i).getNomePrato() + "\nValor: R$"
							+ listaPratos.get(i).getPrecoPrato() + "\n");
				}
				System.out.println("-----------------------------------");
				System.out.println("Para retornar ao menu digite 1");
				retornoMenu = leitor.nextInt();
				break;

			case 2:
				System.out.println("-----------------------------------");
				for (int i = 0; i < listaBebidas.size(); i++) {
					System.out.println((i + 1) + "- Bebida: " + listaBebidas.get(i).getNomeBebida() + "\nValor: R$"
							+ listaBebidas.get(i).getPrecoBebida() + "\n");
				}
				System.out.println("Para retornar ao menu digite 1");
				retornoMenu = leitor.nextInt();
				break;

			case 3:
				System.out.println("-----------------------------------");
				for (int i = 0; i < listaVinhos.size(); i++) {
					System.out.println((i + 1) + "- Vinho: " + listaVinhos.get(i).getNomeVinho() + "\nValor: R$"
							+ listaVinhos.get(i).getPrecoVinho() + "\n");
				}
				System.out.println("Para retornar ao menu digite 1");
				retornoMenu = leitor.nextInt();
				break;

			case 4:
				System.out.println("Digite o numero do prato desejado ou 0 se não deseja nada:");
				Pedidos pedidoPrato = new Pedidos();
				Pedidos armazenamentoPedidos = new Pedidos();
				Thread.sleep(3000);
				System.out.println("-----------------------------------");
				for (int i = 0; i < listaPratos.size(); i++) {
					System.out.println((i + 1) + "- Prato: " + listaPratos.get(i).getNomePrato() + "\nValor: R$"
							+ listaPratos.get(i).getPrecoPrato() + "\n");
				}
				System.out.println("-----------------------------------");
				int escolhaPrato = leitor.nextInt();
				if (escolhaPrato != 0) {
					escolhaPrato = escolhaPrato - 1;
					pedidoPrato.setNomePratosPedidos(listaPratos.get(escolhaPrato).getNomePrato());
					pedidoPrato.setPrecoPedidos(listaPratos.get(escolhaPrato).getPrecoPrato());
					listaPedidos.add(pedidoPrato);
					
					armazenamentoPedidos.setNomePratosPedidos(listaPratos.get(escolhaPrato).getNomePrato());
					
					armazenamentoPedidos.precoPratosPedidos = listaPratos.get(escolhaPrato).getPrecoPrato();
				}
				else {
					armazenamentoPedidos.setNomePratosPedidos(" ");
					armazenamentoPedidos.precoPratosPedidos = 0;

				}
				System.out.println("Digite o numero da bebida desejada ou 0 se não deseja nada:");
				Pedidos pedidoBebida = new Pedidos();
				Thread.sleep(3000);
				System.out.println("-----------------------------------");
				for (int i = 0; i < listaBebidas.size(); i++) {
					System.out.println((i + 1) + "- Bebida: " + listaBebidas.get(i).getNomeBebida() + "\nValor: R$"
							+ listaBebidas.get(i).getPrecoBebida() + "\n");
				}
				System.out.println("-----------------------------------");
				escolhaPrato = leitor.nextInt();
				if (escolhaPrato != 0) {
					escolhaPrato = escolhaPrato - 1;
					pedidoBebida.setNomeBebidasPedidas(listaBebidas.get(escolhaPrato).getNomeBebida());
					pedidoBebida.setPrecoPedidos(listaBebidas.get(escolhaPrato).getPrecoBebida());
					listaPedidos.add(pedidoBebida);
					
					armazenamentoPedidos.setNomeBebidasPedidas(listaBebidas.get(escolhaPrato).getNomeBebida());
					
					armazenamentoPedidos.precoBebidasPedidas = listaBebidas.get(escolhaPrato).getPrecoBebida();
				}
				else {
					armazenamentoPedidos.setNomeBebidasPedidas(" ");
					armazenamentoPedidos.precoBebidasPedidas = 0;

				}
				System.out.println("Digite o numero do vinho desejado ou 0 se não deseja nada:");
				Pedidos pedidoVinho = new Pedidos();
				Thread.sleep(3000);
				System.out.println("-----------------------------------");
				for (int i = 0; i < listaVinhos.size(); i++) {
					System.out.println((i + 1) + "- Vinho: " + listaVinhos.get(i).getNomeVinho() + "\nValor: R$"
							+ listaVinhos.get(i).getPrecoVinho() + "\n");
				}
				System.out.println("-----------------------------------");
				escolhaPrato = leitor.nextInt();
				if (escolhaPrato != 0) {
					escolhaPrato = escolhaPrato - 1;
					pedidoVinho.setNomeVinhosPedidos(listaVinhos.get(escolhaPrato).getNomeVinho());
					pedidoVinho.setPrecoPedidos(listaVinhos.get(escolhaPrato).getPrecoVinho());
					listaPedidos.add(pedidoVinho);
					
					armazenamentoPedidos.setNomeVinhosPedidos(listaVinhos.get(escolhaPrato).getNomeVinho());
					
					armazenamentoPedidos.precoVinhosPedidos = listaVinhos.get(escolhaPrato).getPrecoVinho();
				}
				else {
					armazenamentoPedidos.setNomeVinhosPedidos(" ");
					armazenamentoPedidos.precoVinhosPedidos = 0;
					
				}
				for (int j = 0; j < listaPedidos.size(); j++) {
					if (listaPedidos.get(j).getNomePratosPedidos() != null) {
					System.out.println("Prato pedido: " + listaPedidos.get(j).getNomePratosPedidos() + " valor individual: R$" + armazenamentoPedidos.precoPratosPedidos);
					}
					if (listaPedidos.get(j).getNomeBebidasPedidas() != null) {
					System.out.println("Bebida pedida: " + listaPedidos.get(j).getNomeBebidasPedidas() + " valor individual: R$" + armazenamentoPedidos.precoBebidasPedidas);
					}
					if (listaPedidos.get(j).getNomeVinhosPedidos() != null) {
					System.out.println("Vinho pedido: " + listaPedidos.get(j).getNomeVinhosPedidos() + " valor individual: R$" +  armazenamentoPedidos.precoVinhosPedidos);
					}

				}
				Double somaPedidos = 0.00;
				for (int k = 0; k < listaPedidos.size(); k++) {
					somaPedidos += listaPedidos.get(k).getPrecoPedidos();
				}
				armazenamentoPedidos.setPrecoPedidos(somaPedidos);
				System.out.println("O total do pedido foi: R$" + somaPedidos);
				System.out.println("Deseja adicionar alguma observação? Digite (n) caso não queira adicionar nenhuma observação" );
				leitor.nextLine();
				String observacao = leitor.nextLine();
				
				if (("n").equals(observacao)) {
					observacao = "Sem observações";
					armazenamentoPedidos.setObservacaoClienteArmazenamento(observacao);
					listaPedidosArmazenados.add(armazenamentoPedidos);
				} else {
					armazenamentoPedidos.setObservacaoClienteArmazenamento(observacao);
					listaPedidosArmazenados.add(armazenamentoPedidos);
				}
				Armazenamento.armazenar(listaPedidosArmazenados);
				listaPedidos.clear();
				

				retornoMenu = 1;
				break;

			// ADICIONAR ITENS
			case 5:
				System.out.println("Selecione alguma das seguintes opções a seguir para adicionar: ");
				System.out.println("1- Adicionar Prato");
				System.out.println("2- Adicionar Bebida");
				System.out.println("3- Adicionar Vinho");
				System.out.println("0- Voltar ao menu anterior");
				escolha = leitor.nextInt();
				switch (escolha) {
				case 1:
					Produtos adicionarPratos = new Produtos();
					leitor.nextLine();
					System.out.println("Digite o nome do prato:");
					adicionarPratos.setNomePrato((leitor.nextLine()));
					System.out.println("Digite o valor do prato:");
					adicionarPratos.setPrecoPrato(leitor.nextDouble());
					listaPratos.add(adicionarPratos);
					
					Armazenamento.gravadorPedidosAdicionaisPratos(adicionarPratos);
					
					retornoMenu = 1;
					break;

				case 2:
					Produtos adicionarBebidas = new Produtos();
					leitor.nextLine();
					System.out.println("Digite o nome da bebida:");
					adicionarBebidas.setNomeBebida((leitor.nextLine()));
					System.out.println("Digite o valor da bebida:");
					adicionarBebidas.setPrecoBebida(leitor.nextDouble());
					listaBebidas.add(adicionarBebidas);
					
					Armazenamento.gravadorPedidosAdicionaisBebidas(adicionarBebidas);

					retornoMenu = 1;
					break;

				case 3:
					Produtos adicionarVinhos = new Produtos();
					leitor.nextLine();
					System.out.println("Digite o nome do vinho:");
					adicionarVinhos.setNomeVinho((leitor.nextLine()));
					System.out.println("Digite o valor do vinho:");
					adicionarVinhos.setPrecoVinho(leitor.nextDouble());
					listaVinhos.add(adicionarVinhos);
					
					Armazenamento.gravadorPedidosAdicionaisVinhos(adicionarVinhos);

					retornoMenu = 1;
					break;

				case 0:
					retornoMenu = 1;
					break;
				default:
					System.out.println("Não foi digitado uma opção valida, tente novamente");
				}
				break;
			default:
				System.out.println("Não foi digitado uma opção valida, tente novamente.");
				retornoMenu = 1;
				break;
			case 0:
				retornoMenu = 0;
			}
		} while (retornoMenu != 0);
		System.out.println("-----------------------------------------------\nPrograma Finalizado!\n-----------------------------------------------");

		leitor.close();

	}
}
