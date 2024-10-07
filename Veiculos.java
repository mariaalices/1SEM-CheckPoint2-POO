public class Veiculos {

	private String placa, marca, cor, modelo;
	private Usuarios usuarios;
	
	public Veiculos(String placa, String marca, String cor, String modelo, Usuarios usuarios) {
		this.placa = placa;
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.usuarios = usuarios;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
