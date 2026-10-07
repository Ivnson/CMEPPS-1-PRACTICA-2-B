package PARTEB;

public class TipoEmpleado {
	String tipo ;
	float salario ; 

	public TipoEmpleado(String tipo, int salario) {
		super();
		this.tipo = tipo;
		this.salario = salario ; 
	}

	@Override
	public String toString() {
		return tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	} 
	
	public void addSalario(float incremento)
	{
		this.salario = this.salario + incremento ; 
	}
	
}

