import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame{
	public VentanaInicio() {
		getContentPane().setLayout(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Window ");
		setSize(780, 500);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel lbl1 = new JLabel("The Classic Form includes all visible fields for this list");
		lbl1.setBounds(20, 20, 300, 20);
		lbl1.setFont(new Font("Arial", 0, 12));
		add(lbl1);

		JLabel lbl2 = new JLabel("Form options");
		lbl2.setBounds(20, 40, 200, 20);
		lbl2.setFont(new Font("Arial", 0, 14));
		add(lbl2);

		JLabel lbl3 = new JLabel("Include the following:");
		lbl3.setBounds(20, 60, 200, 20);
		lbl3.setFont(new Font("Arial", 0, 11));
		add(lbl3);

		JCheckBox checkB1 = new JCheckBox("a title for you form  ");
		checkB1.setBounds(20, 85, 200, 20);
		add (checkB1);

		JTextField caja1 = new JTextField(23);
		caja1.setBounds(20, 108,200, 20);
		add(caja1);

		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioB1 = new JRadioButton("only required fields ");
		bg.add(radioB1);
		radioB1.setBounds(20, 140, 200, 20);
		add(radioB1);

		JRadioButton radioB2 = new JRadioButton("all fields");
		bg.add(radioB2);
		radioB2.setBounds(20, 160, 200, 20);
		add(radioB2);

		JLabel lbl4 = new JLabel("(edit required fields in the form builder) ");
		lbl4.setBounds(40, 180, 200, 20);
		lbl4.setFont(new Font("Arial", 0, 11));
		add(lbl4);

		JCheckBox checkB2 = new JCheckBox("interest group fields");
		checkB2.setBounds(20,230, 150, 20);
		add(checkB2);

		JCheckBox checkB3 = new JCheckBox("required field indicators");
		checkB3.setBounds(20, 250, 150, 20);
		add(checkB3);

		JLabel lbl5 = new JLabel("Set form widht");
		lbl5.setBounds(20, 280, 200, 20);
		lbl5.setFont(new Font("Arial", 0, 11));
		add(lbl5);

		JTextField caja2 = new JTextField(23);
		caja2.setBounds(20, 310, 200, 20);
		add(caja2);

		JLabel lbl6 = new JLabel("Enchance you form");
		lbl6.setBounds(20, 330, 200, 20);
		lbl6.setFont(new Font("Arial", 0, 11));
		add(lbl6);

		JCheckBox checkB4 = new JCheckBox("enable evil popup mode");
		checkB4.setBounds(20, 350, 200, 20);
		add(checkB4);
		JCheckBox checkB5 = new JCheckBox("disable all JavaScript i info");
		checkB5.setBounds(20, 370, 200, 20);
		add(checkB5);
		JCheckBox checkB6 = new JCheckBox("include archive link i info");
		checkB6.setBounds(20, 390, 200, 20);
		add(checkB6);
		JCheckBox checkB7 = new JCheckBox("include MonkeyRewards Link");
		checkB7.setBounds(20,410, 200, 20);
		add(checkB7);

		
		//Lado derecho
		JLabel lbl7 = new JLabel("Preview");
		lbl7.setBounds(370, 20, 200, 20);
		lbl7.setFont(new Font("Arial", 0, 16));
		add(lbl7);


		JLabel lbl8 = new JLabel("Email Address");
		lbl8.setBounds(370, 50, 200, 20);
		lbl8.setFont(new Font("Arial", 0, 12));
		add(lbl8);
		JTextField caja3 = new JTextField(22);
		caja3.setBounds(370, 70, 350, 20);
		add(caja3);

		JLabel lbl9 = new JLabel("First Name");
		lbl9.setBounds(370, 90, 200, 20);
		lbl9.setFont(new Font("Arial", 0, 12));
		add(lbl9);
		JTextField caja4 = new JTextField(47);
		caja4.setBounds(370, 110, 350, 20);
		add(caja4);

		JLabel lbl10 = new JLabel("Last Name");
		lbl10.setBounds(370, 130, 200, 20);
		lbl10.setFont(new Font("Arial", 0, 12));
		add(lbl10);
		JTextField caja5 = new JTextField(47);
		caja5.setBounds(370, 150, 350, 20);
		add(caja5);

		JButton btn1 = new JButton("Suscribe");
		btn1.setBounds(370,185,85,20);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.WHITE);
		add(btn1);


		JLabel lbl11 = new JLabel("Copy/paste into your site");
		lbl11.setBounds(350,230, 200, 20);
		lbl11.setFont(new Font("Arial", 0, 16));
		add(lbl11);

		JTextArea areaTexto = new JTextArea(10, 49);
		areaTexto.setText("Enter the text here...");
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		areaTexto.setBounds(350, 250, 400, 200);


		add(areaTexto);
		JScrollPane scroll = new JScrollPane(areaTexto);
		scroll.setBounds(350, 250, 400, 200);
		add(scroll);


	}//constructor
}//ventanaInicio

public class PruebaLayoutNulo {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}//main
}//class