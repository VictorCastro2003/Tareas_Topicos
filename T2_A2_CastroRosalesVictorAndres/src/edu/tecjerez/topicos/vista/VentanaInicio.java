package edu.tecjerez.topicos.vista;

import edu.tecjerez.topicos.figuras.dosdimensiones.*;
import edu.tecjerez.topicos.figuras.tresdimensiones.*;
import edu.tecjerez.topicos.figuras.Triangulo;
import edu.tecjerez.topicos.geometria.Punto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class VentanaInicio extends JFrame implements ActionListener{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JComboBox <String>combo;
	JButton btnOpcion;


	public VentanaInicio() {

		getContentPane().setLayout(gbl);
		setBackground(Color.LIGHT_GRAY);
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Cálculo de áreas");

		String Figuras[] = {"Circulo", "Elipse", "Rombo", "Cono", "Triangulo", "Piramide"}; 
		combo = new JComboBox<String>(Figuras);

		btnOpcion = new JButton("Seleccionar");
		MetodoMagicoAcomodo(combo, 0,0, 1, 1);
		JLabel lbl1 = new JLabel(" ");
		MetodoMagicoAcomodo(lbl1, 1, 0, 1, 1);
		MetodoMagicoAcomodo(btnOpcion, 2, 0, 1, 1);

		btnOpcion.addActionListener(this);

		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);

	}
	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbc.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(com, gbc);
		add(com);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOpcion) {
			String item = (String)combo.getSelectedItem();

			if(item.equals("Circulo")) {
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio: "));

				Circulo c = new Circulo(radio);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(c.area())+"\nPerimetro: "+String.valueOf(c.perimetro()));
			}else if(item.equals("Rombo")) {
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un lado: "));
				double d = Double.parseDouble(JOptionPane.showInputDialog("Ingresa diagonal menor: "));
				double D = Double.parseDouble(JOptionPane.showInputDialog("Ingresa diagonal mayor: "));

				Rombo r = new Rombo(lado, D, d);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(r.area())+"\nPerimetro: "+String.valueOf(r.perimetro()));
			}else if(item.equals("Cono")) {
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un radio: "));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura: "));
				double generatriz = Double.parseDouble(JOptionPane.showInputDialog("Ingresa generatriz: "));

				Rombo r = new Rombo(radio, altura, generatriz);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(r.area())+"\nPerimetro: "+String.valueOf(r.perimetro()));
			}else if(item.equals("Elipse")) {
				double radioMa = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio mayor: "));
				double radioMe = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio menor: "));

				Elipse el = new Elipse(radioMa, radioMe);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(el.area())+"\nPerimetro: "+String.valueOf(el.perimetro()));
			}else if(item.equals("Triangulo")) {
				double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado 1: "));
				double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado 2: "));
				double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado 3: "));

				Triangulo t = new Triangulo(lado1, lado2, lado3);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(t.area())+"\nPerimetro: "+String.valueOf(t.perimetro()));
			}else {
				double a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor de a: "));
				double a2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor de a': "));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura: "));

				Piramide p = new Piramide(a, a2, altura);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(p.area())+"\nVolumen: "+String.valueOf(p.volumen()));
			}	
		}	
	}
}