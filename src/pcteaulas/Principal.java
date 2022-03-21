package pcteaulas;

public class Principal {

	public static void main(String[] args) {
		
		Salario m = new Salario("pedro", "123123321", 0.0, 1400.0);
		
		System.out.println("***Rendimento Mensal***");
		System.out.println("Nome : " + m.getNome());
		System.out.println("Número do Documento : " + m.getNrDoc());
		System.out.println("Salário Mensal : " + m.getSalarioMensal());
		System.out.println();
		m.rendimentos();
		System.out.println("Rendimentos : " + m.getRendimento());
		System.out.println();
		
		//Horario ho = new Horario(null, null, null, null, null)
		Horario h = new Horario("augusto", "123123321",0.0,30.00,12.00);
		
		System.out.println("***Rendimento de Horista***");
		System.out.println("Nome : " + h.getNome());
		System.out.println("Número do Documento : " + h.getNrDoc());
		System.out.println("Valor Hora: " + h.getSalario());
		System.out.println("Número de Horas Trabalhadas: " + h.getHoras());
		System.out.println();
		h.rendimentos();
		System.out.println("Rendimentos : " + h.getRendimento());
		System.out.println();
		
		Comissao c = new Comissao("araujo", "123123321",0.0,30000.0,0.45);
		
		System.out.println("***Rendimento Comissão***");
		System.out.println("Nome : " + c.getNome());
		System.out.println("Número do Documento : " + c.getNrDoc());
		System.out.println("Total Vendido: " + c.getVendaBruta());
		System.out.println("% de Comissão: " + c.getTaxaComissao());
		System.out.println();
		c.rendimentos();
		System.out.println("Rendimentos : " + c.getRendimento());
		System.out.println();
		
	}

}