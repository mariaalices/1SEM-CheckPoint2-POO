public class Controle {

	private Veiculos veiculos;
	private Hora horaSaida;
	private Hora horaEntrada;
	
	public Controle(Veiculos veiculos, Hora horaSaida, Hora horaEntrada) {
		this.veiculos = veiculos;
		this.horaSaida = horaSaida;
		this.horaEntrada = horaEntrada;
	}
	
	public void imprimir() {
		
		System.out.println("Usuário: " + veiculos.getUsuarios().getNome());
		System.out.println("Veiculo: " + veiculos.getModelo());
		System.out.println("Placa: " + veiculos.getPlaca());
		System.out.println("Horário de entrada: " + horaEntrada.horas + ":" + horaEntrada.minutos);
		System.out.println("Horário de saída: " + horaEntrada.horas + ":" + horaSaida.minutos);
		
	}
	
	public double calcularValor() {
		int permanencia = horaEntrada.calcularMinutos(horaSaida);
		
		return permanencia * 0.20;
	}
	
}
