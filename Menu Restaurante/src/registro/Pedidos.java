package registro;

public class Pedidos {

	private String nomePratosPedidos;
	private String nomeBebidasPedidas;
	private String nomeVinhosPedidos;
	private double precoPedidos;
	private String observacaoClienteArmazenamento;
	
//	private double precoArmazenamentoTotal;
	
	public double precoPratosPedidos;
	public double precoBebidasPedidas;
	public double precoVinhosPedidos;
	
	public String getNomePratosPedidos() {
		return nomePratosPedidos;
	}
	public void setNomePratosPedidos(String nomePratosPedidos) {
		this.nomePratosPedidos = nomePratosPedidos;
	}
	public String getNomeBebidasPedidas() {
		return nomeBebidasPedidas;
	}
	public void setNomeBebidasPedidas(String nomeBebidasPedidas) {
		this.nomeBebidasPedidas = nomeBebidasPedidas;
	}
	public String getNomeVinhosPedidos() {
		return nomeVinhosPedidos;
	}
	public void setNomeVinhosPedidos(String nomeVinhosPedidos) {
		this.nomeVinhosPedidos = nomeVinhosPedidos;
	}
	public double getPrecoPedidos() {
		return precoPedidos;
	}
	public void setPrecoPedidos(double precoPedidos) {
		this.precoPedidos = precoPedidos;
	}
	public String getObservacaoClienteArmazenamento() {
		return observacaoClienteArmazenamento;
	}
	public void setObservacaoClienteArmazenamento(String observacaoClienteArmazenamento) {
		this.observacaoClienteArmazenamento = observacaoClienteArmazenamento;
	}
//	public double getPrecoArmazenamentoTotal() {
//		return precoArmazenamentoTotal;
//	}
//	public void setPrecoArmazenamentoTotal(double precoArmazenamentoTotal) {
//		this.precoArmazenamentoTotal = precoArmazenamentoTotal;
//	}
	
	
}

