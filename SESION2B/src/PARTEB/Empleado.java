package PARTEB;

//import sun.security.krb5.internal.crypto.Des;

public class Empleado {
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salario = 0; 
		
		if ("Vendedor".equals(tipo.toString())) {
			tipo.setSalario(2000);
			
			//  Comprobar primero el límite mayor
			if (ventasMes >= 1500) {
				tipo.addSalario(200);
			} else if (ventasMes >= 1000) {
				tipo.addSalario(100);
			}

			for (int i = 0; i < horasExtra; i++) {
				tipo.addSalario(30);
			}
			
			salario = tipo.getSalario(); 
		} else {
			tipo.setSalario(2500);

			// Comprobar primero el límite mayor
			if (ventasMes >= 1500) {
				tipo.addSalario(200);
			} else if (ventasMes >= 1000) {
				tipo.addSalario(100);
			}

			for (int i = 0; i < horasExtra; i++) {
				tipo.addSalario(30);
			}
			
			salario = tipo.getSalario(); 
		}
		
		return salario; 
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		// CORRECCIÓN la nueva nómina es la bruta 
		float NominaNueva = nominaBruta; 
		float Descuento = 0; 
		
		
		if (nominaBruta >= 2500) {
			Descuento = (nominaBruta/100)*18;
			NominaNueva = nominaBruta - Descuento;
		} else if (nominaBruta >= 2100) {
			Descuento = (nominaBruta/100)*15; 
			NominaNueva = nominaBruta - Descuento; 
		}
		
		return NominaNueva; 
	}
}

