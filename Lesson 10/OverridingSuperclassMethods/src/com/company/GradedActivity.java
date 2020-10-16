package com.company;

public class GradedActivity {
    private double score;

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return this.score;
    }

    public char getGrade() {
        if (this.score > 90) {
            return 'A';
        }
        else if (this.score < 90 && this.score >= 80) {
            return 'B';
        }
        else if (this.score < 80 && this.score >= 70) {
            return 'C';
        }
        else if (this.score < 70 && this.score >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

}
