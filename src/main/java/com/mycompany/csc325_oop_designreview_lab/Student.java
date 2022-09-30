
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Rafael Sandoval Ramirez
 */
public class Student extends Human{
    
    private double gpa;
    private int credits;

    // Constructor calls superclass constructor first
    public Student(String name, short age, int credits) {
        super(name, age);
        address = "N/A";
        this.credits = credits;
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

    @Override
    public String toString() {
        return getName() + ": " + "gpa=" + gpa + ", credits=" + credits;
    }


}