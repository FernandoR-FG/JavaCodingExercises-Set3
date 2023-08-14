package com.javacourse.conditionals.statements;
class Student {
    private int marks;

    public Student(int marks) {
        // TODO: Assign 'marks' to the instance variable 'this.marks'
        this.marks = marks;
    }

    public char assignGrade() {
        // TODO: Implement the method which assigns the grade based on marks.
        // If marks are less than 0 or greater than 100, return 'X'
        // If marks are greater than or equal to 90, return 'A'
        // If marks are greater than or equal to 80, return 'B'
        // If marks are greater than or equal to 70, return 'C'
        // If marks are greater than or equal to 60, return 'D'
        // If marks are greater than or equal to 50, return 'E'
        // If marks are less than 50, return 'F'
        if(this.marks < 0 || this.marks >100){
            return 'X';
        } else if(this.marks >= 90){
            return 'A';
        }else if(this.marks >= 80){
            return 'B';
        }else if(this.marks >= 70){
            return 'C';
        }else if(this.marks >= 60){
            return 'D';
        }else if(this.marks >= 50){
            return 'E';
        }else if(this.marks < 50){
            return 'F';
        }
        return 'Y';
    }
}
public class StudentGradesExercise {

	public static void main(String[] args) {
		// Prueba 1: Calificación 'A' para calificaciones en el rango de 90-100
        Student estudiante1 = new Student(95);
        System.out.println("Calificación del estudiante 1: " + estudiante1.assignGrade()); // Debe imprimir 'A'

        // Prueba 2: Calificación 'B' para calificaciones en el rango de 80-89
        Student estudiante2 = new Student(83);
        System.out.println("Calificación del estudiante 2: " + estudiante2.assignGrade()); // Debe imprimir 'B'

	}

}
