package com.nttdata.bootcamp;

public class conversionTemperatura {
	
	private static double temperatura;
	private static char tipo;	
	
	
	public conversionTemperatura(double temperatura, char tipo) {
		conversionTemperatura.temperatura = temperatura;
		conversionTemperatura.tipo = tipo;
	}



	public static double convertirTemperatura() {
        double resultado = 0.0;

        switch (tipo) {
            case 'C':
            case 'c':
                resultado = (temperatura * 9 / 5) + 32;
                break;
            case 'F':
            case 'f':
                resultado = (temperatura - 32) * 5 / 9;
                break;
            default:
                System.out.println("Tipo de temperatura no válido. Use 'C' para Celsius o 'F' para Fahrenheit.");
        }

        return resultado;
    }

}
