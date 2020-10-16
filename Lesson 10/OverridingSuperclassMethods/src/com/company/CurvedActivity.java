package com.company;

public class CurvedActivity extends GradedActivity {
    private double rawScore;
    private double percentage;

    public CurvedActivity(double percent){
        this.percentage = percent;
    }

    @Override
    public void setScore(double s) {
        this.rawScore = s;
        super.setScore(rawScore * percentage);
    }

    public double getRawScore() {
        return this.rawScore;
    }

    public double getPercentage() {
        return this.percentage;
    }

}
