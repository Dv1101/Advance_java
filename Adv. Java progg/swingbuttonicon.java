import javax.swing.*;      
public class swingbuttonicon{    
swingbuttonicon(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("D:\\SEM 5 programming\\Adv. Java progg\\reg.jpg"));    
b.setBounds(100,100,339, 148);    
f.add(b);    
f.setSize(900,600);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new swingbuttonicon();    
}    
}    