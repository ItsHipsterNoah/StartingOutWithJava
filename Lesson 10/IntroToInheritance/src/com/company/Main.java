package com.company;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
/*	    String input;
	    double testScore;

	    GradedActivity gradedActivity = new GradedActivity();

	    input = JOptionPane.showInputDialog("Enter a numeric test score.");
	    testScore = Double.parseDouble(input);

	    gradedActivity.setScore(testScore);

	    JOptionPane.showMessageDialog(null,"The grade for that test is " + gradedActivity.getGrade());

	    System.exit(0);
    }*/
		String input;
		int questions;
		int missed;

		input = JOptionPane.showInputDialog("How many questions are on the final exam?");
		questions = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("How many questions did the student miss?");
		missed = Integer.parseInt(input);

		FinalExam finalExam = new FinalExam(questions, missed);
		JOptionPane.showMessageDialog(null, "Each question counts " + finalExam.getPointsEach()
				+ " points.\nThe exam score is " + finalExam.getScore() + "\nThe exam grade is " + finalExam.getGrade());

		System.exit(0);

	}
}
