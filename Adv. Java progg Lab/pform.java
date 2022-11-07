import java.awt.*;
import java.awt.event.*;

public class pform
{
    Label lblTitle,lblName,lblFather,lblAge,lblGender,lblCourse,lblHobbies,lblAddress;
	TextField txtName,txtFather,txtAge;
	TextArea txtAddress;
	Checkbox checkMale, checkFemale, checkOthers, Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice Course;
	Button btnSave,btnClear;

    pform()
    {
        Frame a = new Frame("User Registrarion Form");
        a.setSize(1000,800);
        a.setLayout(null);
        a.setVisible(true);
        Color formColor = new Color(168, 131, 200);
		a.setBackground(formColor);

        Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.PLAIN, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 15);

        lblTitle=new Label("Registration Form");  
		lblTitle.setBounds(250,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.BLUE);
		a.add(lblTitle);

        lblName=new Label("Name");  
		lblName.setBounds(250,100,150,30);
		lblName.setFont(labelFont);  
		lblName.setForeground(Color.WHITE);
		a.add(lblName);

        txtName=new TextField();
		txtName.setBounds(400,100,400,30);
		txtName.setFont(textFont);
		a.add(txtName);

        lblFather=new Label("Father Name");  
		lblFather.setBounds(250,150,150,30);
		lblFather.setFont(labelFont); 
		lblFather.setForeground(Color.WHITE);
		a.add(lblFather);

        txtFather=new TextField();
		txtFather.setBounds(400,150,400,30);
		txtFather.setFont(textFont);
		a.add(txtFather);

        lblAge=new Label("Age");  
		lblAge.setBounds(250,200,150,30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.WHITE);
		a.add(lblAge);

        txtAge=new TextField();
		txtAge.setBounds(400,200,400,30);
		txtAge.setFont(textFont);
		a.add(txtAge);

        lblGender=new Label("Gender");  
		lblGender.setBounds(250,250,150,30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.WHITE);
		a.add(lblGender);

        cbg = new CheckboxGroup();

        checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(400,250, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		a.add(checkMale);

        checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(500,250, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		a.add(checkFemale);
 
        checkOthers = new Checkbox("Others",cbg,false);
		checkOthers.setBounds(500,250, 100, 30);
		checkOthers.setFont(labelFont);
		checkOthers.setForeground(Color.WHITE);
		a.add(checkOthers);

        lblCourse=new Label("Course");  
		lblCourse.setBounds(250,300,150,30);
		lblCourse.setFont(labelFont);
		lblCourse.setForeground(Color.WHITE);
		a.add(lblCourse);
 
		Course= new Choice();
		Course.setFont(labelFont);
		Course.setBounds(400, 300, 400, 50);
		Course.add("C");
		Course.add("C++");
		Course.add("Java");
		Course.add("C#");
		Course.add("Python");
		a.add(Course);
 
		lblHobbies=new Label("Hobbies");  
		lblHobbies.setBounds(250,350,150,30);
		lblHobbies.setFont(labelFont);
		lblHobbies.setForeground(Color.WHITE);
		a.add(lblHobbies);
 
		Hobbies1=new Checkbox("Drawing");
		Hobbies1.setBounds(400, 350, 100, 50);
		Hobbies1.setFont(labelFont);
		Hobbies1.setForeground(Color.WHITE);
		a.add(Hobbies1);
 
		Hobbies2=new Checkbox("Singing");
		Hobbies2.setBounds(500, 350, 100, 50);
		Hobbies2.setFont(labelFont);
		Hobbies2.setForeground(Color.WHITE);
		a.add(Hobbies2);
 
		Hobbies3=new Checkbox("Music");
		Hobbies3.setBounds(600, 350, 100, 50);
		Hobbies3.setFont(labelFont);
		Hobbies3.setForeground(Color.WHITE);
		a.add(Hobbies3);
 
		Hobbies4=new Checkbox("Others");
		Hobbies4.setBounds(700, 350, 100, 50);
		Hobbies4.setFont(labelFont);
		Hobbies4.setForeground(Color.WHITE);
		a.add(Hobbies4);
 
		lblAddress=new Label("Address");  
		lblAddress.setBounds(250,400,150,30);
		lblAddress.setFont(labelFont);
		lblAddress.setForeground(Color.WHITE);
		a.add(lblAddress);
 
		txtAddress=new TextArea(10,30);
		txtAddress.setBounds(400,400,400,100);
		txtAddress.setFont(labelFont);
		a.add(txtAddress);
 
 
		btnSave=new Button("Save Details");
		btnSave.setBounds(400,530,150,30);
		btnSave.setFont(labelFont);
		btnSave.setBackground(Color.GREEN);
		btnSave.setForeground(Color.WHITE);
		a.add(btnSave);
 
		btnClear=new Button("Clear All");
		btnClear.setBounds(560,530,150,30);
		btnClear.setFont(labelFont);
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		a.add(btnClear);

		// Close Button Code
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			}
		});
        
    }

    private void addWindowListener(WindowAdapter windowAdapter) {
	}

	public static void main(String[]args)
    {
        new pform();
    }
}