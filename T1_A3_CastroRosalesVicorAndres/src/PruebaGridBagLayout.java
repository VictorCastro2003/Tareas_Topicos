import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public VentanaInicio() {
		getContentPane().setLayout(gbl);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
		JLabel lbl1 = new JLabel("The Classic Form includes all visible fields for");
		MetodoMagicoAcomodo(lbl1,0, 0, 2, 1);
		gbc.fill=GridBagConstraints.HORIZONTAL;
			
		JLabel lbl2 = new JLabel("this list");
		MetodoMagicoAcomodo(lbl2,0, 1, 2, 1);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
	
		JLabel lblEsp1= new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp1,0, 2, 2, 1);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		JLabel lbl3 = new JLabel("Form options");
		lbl3.setFont(new Font("Arial", Font.BOLD, 16));
		MetodoMagicoAcomodo(lbl3,0, 3, 2, 1);
		
		JLabel lbl4 = new JLabel("Include the following:");
		MetodoMagicoAcomodo(lbl4,0, 5, 2, 1);
		

		JLabel lblEsp2 = new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp2,0, 5, 2, 1);
		

	
		
		
		JCheckBox check1 = new JCheckBox("a title for you form");
		MetodoMagicoAcomodo(check1,0, 6, 2, 1);
	
		JTextField caja1 = new JTextField();
		MetodoMagicoAcomodo(caja1,0, 7, 2, 1);

		JLabel lblEsp3 = new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp3,0, 8, 2, 1);

		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields");
		bg.add(radio1);
		MetodoMagicoAcomodo(radio1,0, 9, 2, 1);
		JRadioButton radio2 = new JRadioButton("all fields");
		bg.add(radio2);
		MetodoMagicoAcomodo(radio2,0, 10, 2, 1);

		JLabel lbl5 = new JLabel("   (edit required fields in the form builder)");
		MetodoMagicoAcomodo(lbl5,0, 11, 2, 1);
	
		JLabel lblEsp4 = new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp4,0, 12, 2, 1);

		JCheckBox check2 = new JCheckBox("interest group fields");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(check2,0, 13, 2, 1);

		JCheckBox check3 = new JCheckBox("required field indicators");
		MetodoMagicoAcomodo(check3,0, 14, 2, 1);
	
		JLabel lblEsp5 = new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp5,0, 15, 2, 1);
		
		JLabel lbl6 = new JLabel("Set form width");
		MetodoMagicoAcomodo(lbl6,0, 16, 2, 1);
		
		JTextField caja2 = new JTextField();
		MetodoMagicoAcomodo(caja2,0, 17, 2, 1);


		JLabel lblEsp6 = new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp6,0, 18, 2, 1);
	
		JLabel lbl7 = new JLabel("Enhance your form");
		MetodoMagicoAcomodo(lbl7,0, 19, 2, 1);

		JCheckBox check4 = new JCheckBox("eneable evil popup mode");
		MetodoMagicoAcomodo(check4,0, 20, 2, 1);

		JCheckBox check5 = new JCheckBox("disable all JavaScript i Info");
		MetodoMagicoAcomodo(check5,0, 21, 2, 1);

		JCheckBox check6 = new JCheckBox("include archive link i Info");
		MetodoMagicoAcomodo(check6,0, 22, 2, 1);

		JCheckBox check7 = new JCheckBox("include MonkeyRewards link");
		MetodoMagicoAcomodo(check7,0, 23, 2, 1);

		JLabel Esp7 = new JLabel("          ");
		MetodoMagicoAcomodo(Esp7,2, 0, 1, 1);

		JLabel lbl8 = new JLabel("Preview");
		lbl8.setFont(new Font("Arial", Font.BOLD, 16));
		MetodoMagicoAcomodo(lbl8,3, 0, 4, 1);
		
		JLabel lblEsp7= new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp7,3, 0, 4, 1);

		JLabel lbl10 = new JLabel("Email Address");
		MetodoMagicoAcomodo(lbl10,3, 1, 4, 1);

		JTextField caja3 = new JTextField(20);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(caja3,3, 2, 4, 1);

		JLabel lbl11 = new JLabel("First Name");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(lbl11,3, 3, 6, 1);

		JTextField caja4 = new JTextField(20);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(caja4,3, 4, 5, 1);

		JLabel lbl12 = new JLabel("Last Name");
		MetodoMagicoAcomodo(lbl12,3, 5, 5, 1);

		JTextField caja5 = new JTextField(20);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(caja5,3, 6, 5, 1);

		JButton btn1 = new JButton("Suscribe");
		gbc.anchor = GridBagConstraints.WEST;
		MetodoMagicoAcomodo(btn1, 3, 7, 2, 1);
	
		JLabel lblEsp8= new JLabel(" ");
		MetodoMagicoAcomodo(lblEsp8,3, 8, 5, 1);

		JLabel lbl13 = new JLabel("Copy/paste into your site");
		gbc.fill=GridBagConstraints.VERTICAL;
		MetodoMagicoAcomodo(lbl13,3, 9, 5, 1);

		JTextArea areaTexto = new JTextArea();
		areaTexto.setText("enter the text....");
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		
		gbc.fill=GridBagConstraints.BOTH;
	MetodoMagicoAcomodo(areaTexto,3, 10,5, 10);
		
		
		JScrollPane scroll = new JScrollPane(areaTexto);
		scroll.setBounds(350, 250, 400, 200);
		gbc.fill=GridBagConstraints.BOTH;
		MetodoMagicoAcomodo(scroll,3, 10,5, 10);
		pack();
		setLocationRelativeTo(null);
	}
	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(com, gbc);
		add(com);
	}
}//class


public class PruebaGridBagLayout {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}
}