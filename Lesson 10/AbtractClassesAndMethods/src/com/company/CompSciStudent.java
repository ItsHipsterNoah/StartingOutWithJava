package com.company;

public class CompSciStudent extends Student {

    // Required hours
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    // Hours taken
    private int mathHours;
    private int csHours;
    private int genEdHours;

    public CompSciStudent(String n, String id, int year) {
        super(n, id, year);
    }

    public void setMathHours(int hrs) {
        this.mathHours = hrs;
    }

    public void setCsHours(int hrs) {
        this.csHours = hrs;
    }

    public void setGenEdHours(int hrs) {
        this.genEdHours = hrs;
    }

    @Override
    public int getRemainingHours() {
        return (MATH_HOURS + CS_HOURS + GEN_ED_HOURS) - (mathHours + csHours + genEdHours);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMajor: Computer Science" + "\nMath Hours Taken: " + mathHours +
                "\nCS Hours Taken: " + csHours + "\nGeneral Ed Hours: " + csHours + "\n Hours Remaining: " + this.getRemainingHours();
    }
}
