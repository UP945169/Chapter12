import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        String FNumber = JOptionPane.showInputDialog("Enter first number: ");
        String SNumber = JOptionPane.showInputDialog("Enter second number: ");

        int number1 = Integer.parseInt(FNumber);
        int number2 = Integer.parseInt(SNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two integers",
                JOptionPane.PLAIN_MESSAGE);
    }
}
