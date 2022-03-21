package pcteaulas;

public class Comissao extends Empregado{
	private Double vendaBruta, taxaComissao;

	public Comissao(String nome, String nrDoc, Double rendimento, Double vendaBruta, Double taxaComissao) {
		super(nome, nrDoc, rendimento);
		
		if(taxaComissao <= 0.0 || taxaComissao >=1.0) {
			throw new IllegalArgumentException("A taxa de comissão deve estar entre 'Zero' e 'Um'");
			
		}
		if(vendaBruta < 0.0) {
			throw new IllegalArgumentException("O valor de vendas deve ser maior que 'Zero'!!");
		}
		
		this.vendaBruta = vendaBruta;
		this.taxaComissao = taxaComissao;
	}

	public Double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(Double vendaBruta) {
		if(vendaBruta < 0.0) {
			throw new IllegalArgumentException("O valor de vendas deve ser maior que 'Zero'!!");
		}
		this.vendaBruta = vendaBruta;
	}

	public Double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(Double taxaComissao) {
		if(taxaComissao <= 0.0 || taxaComissao >=1.0) {
			throw new IllegalArgumentException("A taxa de comissão deve estar entre 'Zero' e 'Um'");
			
		}
		this.taxaComissao = taxaComissao;
	}

	@Override
	public Double rendimentos() {
		setRendimento(getTaxaComissao()*getVendaBruta());
		return getRendimento();
	}
	
	
	
	
}
