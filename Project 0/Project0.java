// Authored by Jatin K. Marwaha Lab Section 22B
import javax.swing.JOptionPane;
public class Project0 {
    
    public static void main(String[] args) {
    
    
    
    while (true) {
    
    
    // prompts for a sentence to be inputed
    String sent = JOptionPane.showInputDialog(null, "Please enter a sentence.");
    
    // checks if the input is "stop"
    
        if (sent.equalsIgnoreCase("stop")) {
    break;}
    
        int countLower=0;
    
        int countUpper=0;
    
    //  uses a loop to check the string 
    
            for(int i=0; i<sent.length();i++){
    
    //checks if the current char is lower case e
    
                if(sent.charAt(i)=='e'){
    
                countLower++; }
    
    //checks if the current char is Upper case e
    
                if(sent.charAt(i)=='E'){
    
                countUpper++; }
    
            }
    
    // output 
    
    String output="Number of lower case e's:"+countLower;
    
    output+="\nNumber of upper case e's:"+countUpper;
    
    JOptionPane.showMessageDialog(null, output, "Message",
    
    JOptionPane.INFORMATION_MESSAGE);
    
    }}}