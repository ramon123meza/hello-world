package FirstPackage;

public class EnergiaCinetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double masa=5;
		int count=0;
		
		for(int velocidad=90;velocidad<=1000;velocidad++) {
			
		double energiaCinetica=0.5*(masa)*(velocidad*velocidad);
		count++;
		System.out.println("La energia cinetica para este ejercicio es cuando la velocidad es "+(count+velocidad)+" m/s2 es:"+energiaCinetica+" J");

		}

	}

}
