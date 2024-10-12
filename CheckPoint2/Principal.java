import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double faturamento = 0;
		
		System.out.println("Quantos veiculos deseja cadastrar? ");
		int quant = entrada.nextInt();
		Controle[] controle = new Controle[quant];
		
		for(int i = 0; i < quant; i++) {
			
			System.out.println("----- CADASTRO DO VEICULO " + (i + 1) + " -----");
			
			//USUARIO 
			System.out.println("Nome do usuário: ");
			String nome = entrada.next();
			System.out.println("CPF do usuário: ");
			int cpf = entrada.nextInt();
			System.out.println("ID do usuário: ");
			int idUnico = entrada.nextInt();
			
			Usuarios usuarios = new Usuarios(nome, cpf, idUnico);
			
			//VEICULO 
			System.out.println("Informe o modelo do veiculo: ");
			String modelo = entrada.next();
			System.out.println("Informe a marca do veiculo: ");
			String marca = entrada.next();
			System.out.println("Informe a cor do veiculo: ");
			String cor = entrada.next();
			System.out.println("Informe a placa do veiculo: ");
			String placa = entrada.next();
			
			Veiculos veiculos = new Veiculos(placa, marca, cor, modelo, usuarios);
			
			//HORARIO DE ENTRADA E SAIDA
			System.out.println("Informe o horário de entrada (primeiro hora depois minuto): ");
			int horaEntrada = entrada.nextInt();
			int minutoEntrada = entrada.nextInt();
			Hora HoraEntrada = new Hora(horaEntrada, minutoEntrada);
			
			System.out.println("Informe o horário de saída: ");
			int horaSaida = entrada.nextInt();
			int minutoSaida = entrada.nextInt();
			Hora HoraSaida = new Hora(horaSaida, minutoSaida);
			
			//CONTROLE
			controle[i] = new Controle(veiculos, HoraSaida, HoraEntrada);
			
			faturamento += controle[i].calcularValor();
				
		}
		
		System.out.println("-------- RESUMO --------");
		for(int i = 0; i < quant; i++) {
			controle[i].imprimir();
			System.out.println("Custo total: " + controle[i].calcularValor());
		}
 		
		System.out.println("Faturamento: " + faturamento);
		
	}
}
