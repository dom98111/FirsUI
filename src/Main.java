import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dratuti");
        JFrame mainFrame = new JFrame("Hello!");

        MainForm mainForm = new MainForm();

        mainFrame.setContentPane(mainForm.rootPanel);

        mainFrame.pack();

        mainFrame.setVisible(true);
    }
}
