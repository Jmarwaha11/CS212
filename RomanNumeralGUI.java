import javax.swing.*;
import java.awt.*;

public class RomanNumeralGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    public RomanNumeralGUI(String[] numerals) {
        super("Roman Numeral Converter");
        JPanel panel = new JPanel(new GridLayout(numerals.length, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (String numeral : numerals) {
            JLabel romanNumeralLabel = new JLabel(numeral);
            JLabel arabicValueLabel = new JLabel(Integer.toString(convertToArabic(numeral)));

            panel.add(romanNumeralLabel);
            panel.add(arabicValueLabel);
        }

        add(panel);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private int convertToArabic(String romanNumeral) {
        int arabicValue = 0;
        int previousValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = getRomanNumeralValue(currentChar);

            if (currentValue < previousValue) {
                arabicValue -= currentValue;
            } else {
                arabicValue += currentValue;
            }

            previousValue = currentValue;
        }

        return arabicValue;
    }

    private int getRomanNumeralValue(char romanNumeral) {
        switch (romanNumeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
            