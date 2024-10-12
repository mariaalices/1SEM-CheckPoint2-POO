public class Usuarios {

	private String nome;
	private int cpf, idUnico;
	
	public Usuarios(String nome, int cpf, int idUnico) {
		this.nome = nome;
		this.cpf = cpf;
		this.idUnico = idUnico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdUnico() {
		return idUnico;
	}

	public void setIdUnico(int idUnico) {
		this.idUnico = idUnico;
	}
	
	
}
