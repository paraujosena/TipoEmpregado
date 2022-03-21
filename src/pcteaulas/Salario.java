package pcteaulas;

public class Salario extends Empregado {
	private Double salarioMensal;
	
	public Salario(String nome, String nrDoc, Double rendimento, Double salarioMensal) {
		super(nome, nrDoc, rendimento);
		
		if(salarioMensal <= 0) {
			throw new IllegalArgumentException("Salário Mensal deve ser maior que zero!!");
		}
		this.salarioMensal = salarioMensal;
	}


	public Double getSalarioMensal() {
		return salarioMensal;
	}


	public void setSalarioMensal(Double salarioMensal) {
		if(salarioMensal <= 0) {
			throw new IllegalArgumentException("Salário Mensal deve ser maior que zero!!");
		}
		this.salarioMensal = salarioMensal;
	}


	@Override
	public Double rendimentos() {
		setRendimento(getSalarioMensal());
		return getSalarioMensal();
	}
	
}
