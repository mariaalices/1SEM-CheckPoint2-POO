public class Hora {

	int horas;
	int minutos;
	
	public Hora(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}
	
	public int calcularMinutos(Hora saida) {
		int entradaMinutos = this.horas * 60 + this.minutos;
		int saidaMinutos = saida.horas * 60 + saida.minutos;
		
		return saidaMinutos - entradaMinutos;
	}
	
}
