import javax.swing.*;
import java.io.File;

public class ChooseFrame {

   ChooseFrame() {
      
      JFileChooser chooseFile = new JFileChooser();
      chooseFile.setCurrentDirectory(new File("."));
      int userResponse = chooseFile.showOpenDialog(null);
      
      if (userResponse == JFileChooser.APPROVE_OPTION) {
         File userFile = new File(chooseFile.getSelectedFile().getAbsolutePath());
         
         JOptionPane.showMessageDialog(null, "User File Path:\n" + userFile);
         
      }
   
   }

}