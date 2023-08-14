package com.javacourse.conditionals.statements;
class WeatherAdviser {

    public String provideWeatherAdvisory(int temperature) {
        // TODO: Provide a weather advisory message based on the temperature.
        String advise = "";
        if(temperature < 0){
            advise = "It's freezing! Wear a heavy coat.";
        }else if(temperature >= 0 && temperature <= 10){
            advise="It's cold! Bundle up.";
        }else if(temperature > 10 && temperature <= 20){
            advise="It's cool! A light jacket will do.";
        }else if(temperature > 20){
            advise="It's warm! Enjoy the day.";
        }
        return advise;
    }
}
public class WeatherAdviserExercise {

	public static void main(String[] args) {
		// Prueba 1: Consejo climático para una temperatura de -5 grados 
        int temperatura1 = -5;
        WeatherAdviser asesorClimatico = new WeatherAdviser();
		String consejo1 = asesorClimatico .provideWeatherAdvisory(temperatura1);
        System.out.println("Consejo para temperatura de " + temperatura1 + " grados: " + consejo1);
        // Debe imprimir: "It's freezing! Wear a heavy coat."

        // Prueba 2: Consejo climático para una temperatura de 15 grados 
        int temperatura2 = 15;
        String consejo2 = asesorClimatico.provideWeatherAdvisory(temperatura2);
        System.out.println("Consejo para temperatura de " + temperatura2 + " grados: " + consejo2);
        // Debe imprimir: "It's cool! A light jacket will do"
    

	}

}
