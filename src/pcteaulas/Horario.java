package pcteaulas;

public class Horario extends Empregado {
	private Double salario, horas;

	public Horario(String nome, String nrDoc, Double rendimento, Double salario, Double horas){
		super(nome, nrDoc, rendimento);
		
		if(salario <= 0) {
			throw new IllegalArgumentException("Salário por hora deve ser maior que Zero!!!");
		}
		
		
		if(horas<=0) {
			throw new IllegalArgumentException("Número de horas deve ser maior que Zero!!!");
		}
		
		this.salario = salario;
		this.horas = horas;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		if(salario <= 0) {
			throw new IllegalArgumentException("Salário por hora deve ser maior que Zero!!!");
		}
		this.salario = salario;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double h) throws IllegalAccessException {
		if(h<=0) {
			throw new IllegalAccessException("Número de horas deve ser maior que Zero!!!");
		}
		this.horas = h;
	}

	@Override
	public Double rendimentos() {
		if(getHoras() <= 160) {
			setRendimento(getSalario() * getHoras());
		}else {
			setRendimento((160*getSalario())+( getHoras() - 160)*getSalario()*1.5);
		}
		return getRendimento();
	}
	
	
	
}
