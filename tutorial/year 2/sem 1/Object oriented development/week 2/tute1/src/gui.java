import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {
    private JTextField fahrenheitTextField;
    private JTextField celsiusTextField;

    public gui() {
        setTitle("Temperature Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusTextField = new JTextField(10);
        JButton convertButton = new JButton("Convert");

        // Set layout
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        add(fahrenheitLabel);
        add(fahrenheitTextField);
        add(celsiusLabel);
        add(celsiusTextField);
        add(convertButton);

        // Add action listener to the convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Convert Fahrenheit to Celsius
                    if (fahrenheitTextField.getText().isEmpty()) {
                        throw new IllegalArgumentException("Please enter a Fahrenheit temperature.");
                    }
                    double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    celsiusTextField.setText(String.format("%.2f", celsius));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(gui.this,
                            "Invalid input! Please enter a valid Fahrenheit temperature.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(gui.this,
                            ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gui().setVisible(true);
            }
        });
    }
}
