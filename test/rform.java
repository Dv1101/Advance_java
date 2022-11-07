import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class rform
{
    Label lbltitle, lblname, lbladdress;
    TextField txtname;
    TextArea txtaddress;
    Button btnsave;

    rform()
    {
        Frame a= new Frame("User Registration Form");
        a.setLayout(null);
        a.setVisible(true);
        a.setSize(1000,800);

        lbltitle = new Label("Registration Form");
        lbltitle.setBounds(250,40,300,50);
        a.add(lbltitle);

        lblname=new Label("Name");
        lblname.setBounds(250,100,300,50);
        a.add(lblname);

        txtname = new TextField();
        txtname.setBounds(400,100,400,30);
        a.add(txtname);

        lbladdress=new Label("Address");
        lbladdress.setBounds(250,200,300,50);
        a.add(lbladdress);

        txtaddress = new TextArea(10,30);
        txtaddress.setBounds(400,200,400,100);
        a.add(txtaddress);

        btnsave = new Button("Save");
        btnsave.setBounds(400,530,150,30);
        a.add(btnsave);

    }

    public static void main(String[]args)
    {
        new rform();
    }

}


