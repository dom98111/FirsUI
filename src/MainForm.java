import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Executable;

public class MainForm {
    public JPanel rootPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button5;
    private JTextField textField3;
    private JRadioButton сложениеRadioButton;
    private JRadioButton делениеRadioButton;
    private JButton button1;

    public MainForm() {
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1;
                    int num2;

                    num1 = Integer.parseInt(textField1.getText());
                    num2 = Integer.parseInt(textField2.getText());
                    int result = 0;
                    if (сложениеRadioButton.isSelected()) {
                        result = num1 + num2;

                    } else if (делениеRadioButton.isSelected()) {
                        result = num1 / num2;
                    }
                    textField3.setText(String.valueOf(result));


                } catch (Exception e1){
                    JOptionPane.showMessageDialog(rootPanel, "Введите число!", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
