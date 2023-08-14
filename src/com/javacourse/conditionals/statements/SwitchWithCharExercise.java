package com.javacourse.conditionals.statements;
class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
    
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        
        switch (Character.toLowerCase(ch)) {
        
            // TODO: Complete the switch statement
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':return true;
        }

        return false;
    }
}
public class SwitchWithCharExercise {

	public static void main(String[] args) {
		 // Prueba 1: Verificar si 'a' es una vocal
        char caracter1 = 'a';
        MyChar miCaracter = new MyChar();
		boolean esVocal1 = miCaracter .isVowel(caracter1);
        System.out.println("'" + caracter1 + "' es una vocal: " + esVocal1);
        // Debe imprimir: "'a' es una vocal: true"

        // Prueba 2: Verificar si 'U' es una vocal (mayúscula)
        char caracter2 = 'U';
        boolean esVocal2 = miCaracter.isVowel(caracter2);
        System.out.println("'" + caracter2 + "' es una vocal: " + esVocal2);
        // Debe imprimir: "'Z' es una vocal: false"
		
	}

}
