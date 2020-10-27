package processadorArquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.Scanner;
import lista.Produtos;

public class LeitorListas {
	public static List<Produtos> LeitorPratos() throws IOException {
		File arquivo = new File("d:\\Eclipse\\atv3\\pratos.csv");
		BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

//		leitor.readLine();
		List<Produtos> listaPratos = new ArrayList<>();

		String linha = leitor.readLine();
		while ((linha = leitor.readLine()) != null) {

			String partes[] = linha.split(";");
			Produtos produto = new Produtos();
			partes[0] = new String(partes[0].getBytes(), "UTF-8");
			produto.setNomePrato((partes[0]));
			produto.setPrecoPrato(Double.parseDouble(partes[1]));
			listaPratos.add(produto);
//			System.out.println(produto.nomePrato);
//			System.out.println(produto.precoPrato);
//			System.out.println("----------------");
//			System.out.println(listaPratos(1));
		}
		leitor.close();
//		System.out.println(listaPratos.get(0).nomePrato);

		return listaPratos;

	}

	public static List<Produtos> LeitorBebidas() throws IOException {
		File arquivo = new File("d:\\Eclipse\\atv3\\bebidas-tabuladas.txt");
//		BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
		Scanner leitor = new Scanner((Readable) new InputStreamReader(new FileInputStream(arquivo),Charset.forName("UTF-8")));
//			String s ="";
//				BufferedReader in = new BufferedReader(new FileReader("file"));
//				while( ( s = in.readLine()) != null) {
//		
//					String UTF8Str = new String(s.getBytes(),"UTF-8");
//					System.out.println(UTF8Str);
//				}
//			System.out.println(s);
		List<Produtos> listaBebidas = new ArrayList<>();
		leitor.nextLine();
		while (leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String partes[] = linha.split("\t");
			Produtos produto = new Produtos();
			produto.setPrecoBebida(Double.parseDouble(partes[0].replaceAll(",", ".")));
//			partes[1] = new String(partes[1].getBytes(), "UTF-8");
			produto.setNomeBebida((partes[1]));
//			System.out.println(produto.precoBebida);
//			System.out.println(produto.nomeBebida);
//			System.out.println("---------------");
			listaBebidas.add(produto);

		}
		leitor.close();
		return listaBebidas;

	}

	public static List<Produtos> LeitorVinhos() throws IOException {
		File arquivo = new File("d:\\Eclipse\\atv3\\vinhos-tabulados.txt");
		BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
		List<Produtos> listaVinhos = new ArrayList<>();
		String linha = leitor.readLine();
		while ((linha = leitor.readLine()) != null) {
			String partes[] = linha.split("\t");
			Produtos produto = new Produtos();
			produto.setPrecoVinho(Double.parseDouble(partes[0]));
			partes[1] = new String(partes[1].getBytes(), "UTF-8");
			produto.setNomeVinho((partes[1]));
			listaVinhos.add(produto);
//			System.out.println(produto.precoVinho + 1);
//			System.out.println(produto.precoVinho);
//			System.out.println(produto.nomeVinho);
//			System.out.println("-------------");			
		}
		leitor.close();
		return listaVinhos;
	}

//	public static List<Produtos> LeitorAcento() throws UnsupportedEncodingException, IOException {
//		BufferedReader in = new BufferedReader(new FileReader("d:\\Eclipse\\atv3\\bebidas-tabuladas.txt"));
//		String s = "";
//		List<Produtos> listaAcento = new ArrayList<>();
//		in.readLine();
//		while ((s = in.readLine()) != null) {
//
//			String UTF8Str = new String(s.getBytes(), "UTF-8");
//			System.out.println(UTF8Str);
//		}
//		return listaAcento;
//	}
}
