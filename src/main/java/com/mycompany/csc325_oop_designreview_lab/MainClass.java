/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author Rafael Sandoval Ramirez
 */
public class MainClass {
	
	public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);
                double inputGpa = 0;
             
                //Switched places of subclass and superclass declaration
		Student std1 = new Freshman("James", (short)20, 12); // name, age, credits
                
                Student std2 = new Senior("John", (short)30, 90);
                
                
               //Array of students to easily ask for user input for each
                Student[] students = {std1, std2};
                
                for(Student s: students){
                   System.out.print("Enter gpa for " + s.getName() + ":");
                   inputGpa = keyboard.nextDouble();
                   s.setGpa(inputGpa);
                }

		System.out.println(std1);
                
                System.out.println(std2);
		

	}

}    