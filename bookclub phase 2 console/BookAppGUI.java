import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookAppGUI extends JFrame {

    private BookService inventory;
    private JTextField titleField, authorField, pricTextField, qtyField;
    private JTextArea displayArea;
    private JButton addButton, displyBtn, searchBtn, clearBtn;
    private JLabel statusLabel, totalLabel;


    public BookAppGUI(){
        inventory = new BookService(null);
        initializeGUI();
    }

    private void initializeGUI(){
        setTitle("Book Store Inventory System");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(20 ,20));

        //Top panel - input fields
        JPanel inputPanel = createInputPanel();
        add(inputPanel,  BorderLayout.NORTH);

        //for the footnote fields
        JPanel ftnotePanel = footnotePanel();
        add(ftnotePanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true); //displays window
    }

    private JPanel footnotePanel(){
        JPanel fnpanel = new JPanel(new GridLayout(3,2,5,5));
        fnpanel.setBorder(BorderFactory.createTitledBorder("Send Message to Administrator"));
        fnpanel.setBackground(new Color(200));
        fnpanel.add(new JLabel("Compose message: "));
        fnpanel.add(new JTextArea());
        // fnpanel.add(new JLabel("Password"));
        // fnpanel.add(new JTextField());
        // fnpanel.add(new Button("Submit"));
        // fnpanel.add(new Button("Cancel"));
        

        return fnpanel;
    }

    private JPanel createInputPanel(){
        JPanel panel = new JPanel(new GridLayout(5,2,5,5));
        panel.setBorder(BorderFactory.createTitledBorder("Book Information"));
        panel.setBackground(new Color(212, 150, 100));


        //Title
        panel.add(new JLabel("Title: "));
        titleField = new JTextField();
        panel.add(titleField);

        return panel;
    }

    public static void main(String[] args){
        //Lauch GUI on terminal

        SwingUtilities.invokeLater(() -> {
            new BookAppGUI();
        });
    }
}
