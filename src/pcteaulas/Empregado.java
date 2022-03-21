package pcteaulas;

public abstract class Empregado {
	protected String nome, nrDoc;
	protected Double rendimento;
	public Empregado(String nome, String nrDoc, Double rendimento) {
		super();
		this.nome = nome;
		this.nrDoc = nrDoc;
		this.rendimento = rendimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNrDoc() {
		return nrDoc;
	}
	public void setNrDoc(String nrDoc) {
		this.nrDoc = nrDoc;
	}
	public Double getRendimento() {
		return rendimento;
	}
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	public abstract Double rendimentos();
	
}
