/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);
                double inputGpa = 0;
             
		Student std1 = new Freshman("James", (short)20, 12); // name, age, credits
                
                Student std2 = new Senior("John", (short)30, 90);
                
                Student[] students = {std1, std2};
		
                
                for(Student s: students){
                   System.out.println("Enter gpa for " + s.getName() + ":");
                   inputGpa = keyboard.nextDouble();
                   s.setGpa(inputGpa);
                }

		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}    