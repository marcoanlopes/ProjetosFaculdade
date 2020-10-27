package gravar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
import java.util.List;

import lista.Produtos;
import registro.Pedidos;

public class Armazenamento {
	public static void armazenar(List<Pedidos> listaPedidosArmazenados)
			throws FileNotFoundException {
		File ArquivoSaida = new File("d:\\Eclipse\\atv3\\pedidos.txt");
		PrintWriter gravador = new PrintWriter(ArquivoSaida);

		double somaTotalPedidos = 0.00;
		int i = 1;
		for (Pedidos arm : listaPedidosArmazenados) {
			gravador.println("Pedido número: " + i);
			if (arm.getNomePratosPedidos() != " ") {
				gravador.println("Prato pedido: " + arm.getNomePratosPedidos() + " - valor: R$" + arm.precoPratosPedidos);
			}
			if (arm.getNomeBebidasPedidas() != " ") {
				gravador.println("Bebida pedida: " + arm.getNomeBebidasPedidas() + " - valor: R$" + arm.precoBebidasPedidas);
			}
			if (arm.getNomeVinhosPedidos() != " ") {
				gravador.println("Vinho pedido: " + arm.getNomeVinhosPedidos() + " - valor: R$" + arm.precoVinhosPedidos);
			}
			gravador.println("Observação do cliente: " + arm.getObservacaoClienteArmazenamento());
			if (arm.getPrecoPedidos() != 0.00) {
				gravador.println("Total deste pedido: R$" + arm.getPrecoPedidos());
			}
			somaTotalPedidos += arm.getPrecoPedidos();
			gravador.println("------------------------------------------------------");
			i++;
		}
		gravador.println("Valor total dos pedidos: R$" + somaTotalPedidos);
		gravador.println("-------------------------------------FIM--------------------------------------------");
		gravador.close();

		System.out.println("Pedido Realizado!");
	}
	
	public static void gravadorPedidosAdicionaisPratos(Produtos adicionarPratos) throws IOException {
		File file = new File("D:\\Eclipse\\atv3\\pratos.csv");
		BufferedWriter out = new BufferedWriter(
			    new OutputStreamWriter(
			        new FileOutputStream(file, true), // Append arquivo
			        StandardCharsets.UTF_8                  // Set encoding
			    )
			);	
		out.write("\n" + adicionarPratos.getNomePrato() + ";" + adicionarPratos.getPrecoPrato());
		out.close();
	}
	public static void gravadorPedidosAdicionaisBebidas(Produtos adicionarBebidas) throws IOException {
		File file = new File("D:\\Eclipse\\atv3\\bebidas-tabuladas.txt");
		BufferedWriter out = new BufferedWriter(
			    new OutputStreamWriter(
			        new FileOutputStream(file, true), // Append arquivo
			        StandardCharsets.UTF_8                  // Set encoding
			    )
			);	
		out.write("\n" + adicionarBebidas.getPrecoBebida() + "\t" + adicionarBebidas.getNomeBebida());
		out.close();
	}
	
	public static void gravadorPedidosAdicionaisVinhos(Produtos adicionarVinhos) throws IOException {
		File file = new File("D:\\Eclipse\\atv3\\vinhos-tabulados.txt");
		BufferedWriter out = new BufferedWriter(
			    new OutputStreamWriter(
			        new FileOutputStream(file, true), // Append arquivo
			        StandardCharsets.UTF_8                  // Set encoding
			    )
			);	
		out.write("\n" + adicionarVinhos.getPrecoVinho() + "\t" + adicionarVinhos.getNomeVinho());
		out.close();
	}
	
}
