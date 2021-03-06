package com.company;

public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;

        pointsEach = 100 / questions;

        double numericScore = 100.0-(missed * pointsEach);
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
