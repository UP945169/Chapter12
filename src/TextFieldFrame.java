import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JTextField password;

    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter Text: ");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        password = new JPasswordField("Hidden Text");
        add(password);

        //eventHandling
        TextFieldHandler handler = new TextFieldHandler();

    }

    private class TextFieldHandler implements ActionListener {
        @Override

        public void actionPerformed(ActionEvent event){
            String string = "";

            if(event.getSource() == textField1){
                string = String.format("textField1: %s",event.getActionCommand());
            }
            else if(event.getSource()==textField2){

            }
        }
    }
}
