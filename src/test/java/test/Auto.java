package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos; 
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	public int cantidadAsientos(){
		int totalAsientos = 0;
		for( int i = 0; i < asientos.length ; i ++) {
			
			if(asientos[i] != null) {
				totalAsientos++;
				
			}
		}
		return totalAsientos;
		
	}	
	public void verificarIntegridad() {
		Motor motor = new Motor();
		Asiento asiento = new Asiento();
		if((this.registro == motor.registro) && (this.registro == asiento.registro))
			System.out.print("Auto original");
			else;
			System.out.print("Las piezas no son originales");
	}

}
 