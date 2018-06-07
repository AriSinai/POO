public class Convertidor {

	public static double convertirCentigradosAFarenheit (double tempe){
		return tempe*(9.0/5.0)+32;
	}

	public static double convertirCentigradosAKelvin (double tempe){
		return tempe+273.15;
	}

	public static double convertirFahrenheitACelcius(double tempe){
		return (tempe-32)*(5.0/9.0);
	}

	public static double convertirKelvinACelcius(double tempe){
		return tempe*(9.0/5.0)-459.67;
	}

	public static double convertirFahrenheitAKelvin(double tempe){
		return (tempe+459.67)*(5.0/9.0);
	}

	public static double convertirKelvinAFahrenheit(double tempe){
		return tempe-273.15;
	}

	
	
	
}
