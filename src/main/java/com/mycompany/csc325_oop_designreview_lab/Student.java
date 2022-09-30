
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Rafael Sandoval Ramirez
 */
public class Student extends Human{
    
    private double gpa;

    // Constructor calls superclass constructor first
    public Student(String name, short age, String address) {
        super(name, age);
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}