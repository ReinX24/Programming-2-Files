import javax.swing.*;

public class GradeCalculator {

   public static void main(String[] args) {
   
      JOptionPane.showMessageDialog(null, "[Grade Calculator Program]");
      
      Double prelimGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter PRELIM GRADE"));
      
      Double midtermGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter MIDTERM GRADE"));
      
      Double semiFinalGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter SEMI-FINAL GRADE"));
      
      Double finalGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter FINAL GRADE"));
      
      Double computedGrade = (prelimGrade + midtermGrade + semiFinalGrade + finalGrade) / 4;
      
      String gradeStatus = "";
      
      if (computedGrade >= 97.0 && computedGrade <= 100.0) {
         gradeStatus = "A+";
      } else if (computedGrade >= 93.0 && computedGrade <= 96.0) {
         gradeStatus = "A";
      } else if (computedGrade >= 90.0 && computedGrade <= 92.0) {
         gradeStatus = "A-";
      } else if (computedGrade >= 87.0 && computedGrade <= 89.0) {
         gradeStatus = "B+";
      } else if (computedGrade >= 83.0 && computedGrade <= 86.0) {
         gradeStatus = "B";
      } else if (computedGrade >= 80.0 && computedGrade <= 82.0) {
         gradeStatus = "B-";
      } else if (computedGrade >= 77.0 && computedGrade <= 79.0) {
         gradeStatus = "C+";
      } else if (computedGrade >= 73.0 && computedGrade <= 76.0) {
         gradeStatus = "C";
      } else if (computedGrade >= 70.0 && computedGrade <= 72.0) {
         gradeStatus = "C-";
      } else if (computedGrade >= 67.0 && computedGrade <= 69.0) {
         gradeStatus = "D+";
      } else if (computedGrade >= 65.0 && computedGrade <= 66.0) {
         gradeStatus = "D";
      } else if (computedGrade < 65.0) {
         gradeStatus = "E/F";
      }
      
      JOptionPane.showMessageDialog(null,
      "Prelim Grade: " + prelimGrade + 
      "\nMidterm Grade: " + midtermGrade + 
      "\nSemi-Final Grade: " + semiFinalGrade +
      "\nFinal Grade: " + finalGrade +
      "\n\nAverage Grade: " + computedGrade +
      "\nGrade Status: " + gradeStatus);
      
   }

}