import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class VentanaInicio extends JFrame implements ActionListener,KeyListener{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JLabel lblT,lbl1,lblEs;
	JTextField tf1,resultado;
	double res;
	boolean band1=true,band2=true;
	byte verifNumPuntos = 0, verifNumMenos = 0;
	ConversorTemperatura obj= new ConversorTemperatura();
	JComboBox<String> opciones,opciones2 ;
	JButton btnConvertir;
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Conversor Temperatura");
		setLocationRelativeTo(null);
		setVisible(true);

		lblT= new JLabel("Conversor Temperaturas");
		MetodoMagicoAcomodo(lblT, 0, 0, 3, 1);
		tf1= new JTextField(10);
		gbc.fill= GridBagConstraints.BOTH;
		MetodoMagicoAcomodo(tf1, 0, 1,2, 1);
		
		tf1.addKeyListener(this);

		opciones=new JComboBox<String>();
		opciones.setEnabled(false);
		opciones.addItem("Selecciona opcion..");
		opciones.addItem("°C");
		opciones.addItem("°F");
		opciones.addItem("°K");
		opciones.addItem("°R");
		opciones.addActionListener(this);
		gbc.fill= GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(opciones, 2,1,2, 1);

		lbl1= new JLabel("A: ");
		MetodoMagicoAcomodo(lbl1, 0, 3, 1, 1);
		gbc.fill= GridBagConstraints.HORIZONTAL;

		opciones2=new JComboBox<String>();
		opciones2.setEnabled(false);
		MetodoMagicoAcomodo(opciones2, 1,3,2, 1);
		opciones2.addActionListener(this);
		
		resultado= new JTextField(10);
		resultado.setEditable(false);
		gbc.fill= GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(resultado,3, 3,2,1);
		pack();

	}
	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(com, gbc);
		add(com);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		if(c == opciones && band1 == true) {
			band1 = false;
			opciones2.removeAllItems();
			if(opciones.getSelectedIndex() == 0) {
				resultado.setText("");
			}else {
				for (int i = 0; i<opciones.getItemCount();i++) {
					if(opciones.getSelectedIndex() == i) {
						
					}else {
						opciones2.addItem(opciones.getItemAt(i));
					}
				}
			}
			band1 = true;
			
		}else if(c == opciones2 && band2 == true) {
			band2 = false;
			if(opciones2.getSelectedIndex() == 0) {
				resultado.setText("");
			}else if(opciones.getSelectedIndex() == 1) {
				if(opciones2.getSelectedIndex() == 1) {
					res=obj.CelciusFahrenheit(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 2) {
					res=obj.CelciusKelvin(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 3) {
					res=obj.CelciusRankin(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}
			}else if(opciones.getSelectedIndex() == 2) {
				if(opciones2.getSelectedIndex() == 1) {
					res=obj.FahrenheitCelcius(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 2) {
					res=obj.FahrenheitKelvin(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 3) {
					res=obj.FahrenheitRankin(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}
			}else if(opciones.getSelectedIndex() == 3) {
				if(opciones2.getSelectedIndex() == 1) {
					res=obj.KelvinCelcius(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 2) {
					res=obj.KelvinFahrenheit(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 3) {
					res=obj.KelvinRankin(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}
			}else if(opciones.getSelectedIndex() == 4) {
				if(opciones2.getSelectedIndex() == 1) {
					res=obj.RankinCelcius(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 2) {
					res=obj.RankinFahrenheit(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}else if(opciones2.getSelectedIndex() == 3) {
					res=obj.RankinKelvin(Double.parseDouble(tf1.getText()));
					resultado.setText(String.valueOf(res));
				}
			}
			band2 = true;
		}}
	@Override
	public void keyTyped(KeyEvent e) {
		int c = e.getKeyChar();
		if(!(c=='.'||c=='-'||c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||
				c=='6'||c=='7'||c=='8'||c=='9')) { 
			e.consume();
		}else {
			if(c=='.') {
				if(tf1.getText().length()==0) {
					e.consume();
				}else if(tf1.getText().length()==1) {
					if(tf1.getText().charAt(0)=='-') {
						e.consume();
					}
				}else if(verifNumPuntos != 0) {
					e.consume();
				}else {
					verifNumPuntos = 1;
				}
			}
			if(c=='-') {
				if(tf1.getText().length()!=0) {
					e.consume();
				}
			}
		}

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(!tf1.getText().contains(".")) {
			verifNumPuntos = 0;
		}
		if(tf1.getText().length()==0) {
			opciones.setEnabled(false);
			opciones2.setEnabled(false);
			resultado.setText("");
		}else if(tf1.getText().charAt(0)!='-' || (tf1.getText().charAt(0)=='-' && 
				tf1.getText().length()>=2)) {
			opciones.setEnabled(true);
			opciones2.setEnabled(true);
		}else {
			opciones.setEnabled(false);
			opciones2.setEnabled(false);
		}

	}
}
public class PruebaEventosCombobox {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}