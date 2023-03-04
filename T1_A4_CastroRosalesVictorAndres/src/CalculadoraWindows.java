import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class VentanaInicio extends JFrame implements ActionListener,KeyListener{
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	JTextField tf1,tf2,tfRes;
	JLabel lbl1,lbl2;
	JButton btnSuma,btnResta,btnMulti,btnDivision,btnCE,btnBorrar,
	btnPorcentaje,btnRaizCua,btnPotencia,btnpotNeg,btn0,btn1,btn2,btn3,btn4,btn5,btn6
	,btn7,btn8,btn9,btnMasMen,btnPunto,btnIgual;
	String texto="",textoR="";
	int num1,num2;
	boolean band= true;

	public VentanaInicio() {
		getContentPane().setLayout(gbl);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);
		setResizable(false);

		tfRes= new JTextField("");
		tfRes.setFont(new Font("Arial", 0, 16));
		tfRes.addKeyListener(this);
		//tfRes.setEditable(false);
		tfRes.setHorizontalAlignment(JTextField.RIGHT);
		gbc.fill= GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(tfRes, 0, 0,4,1);


		//fila2
		btnPorcentaje= new JButton("%");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnPorcentaje.addActionListener(this);
		MetodoMagicoAcomodo(btnPorcentaje, 0, 1,1,1);

		btnRaizCua= new JButton("sqr");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnRaizCua.addActionListener(this);
		MetodoMagicoAcomodo(btnRaizCua, 1, 1, 1, 1);

		btnPotencia= new JButton("^2");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnPotencia.addActionListener(this);
		MetodoMagicoAcomodo(btnPotencia, 2, 1, 1, 1);

		btnpotNeg= new JButton("1/x");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnpotNeg.addActionListener(this);
		MetodoMagicoAcomodo(btnpotNeg, 3, 1, 1, 1);
		//fila3
		btnCE= new JButton("CE");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnCE.addActionListener(this);
		MetodoMagicoAcomodo(btnCE, 0, 2, 2,1);

		btnBorrar= new JButton("<");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnBorrar.addActionListener(this);
		MetodoMagicoAcomodo(btnBorrar, 2, 2,1,1);


		btnDivision= new JButton("/");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnDivision.addActionListener(this);
		MetodoMagicoAcomodo(btnDivision, 3, 2, 1, 1);		

		btn7= new JButton("7");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn7.addActionListener(this);
		MetodoMagicoAcomodo(btn7, 0, 3,1, 1);

		btn8= new JButton("8");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn8.addActionListener(this);
		MetodoMagicoAcomodo(btn8, 1, 3,1, 1);

		btn9= new JButton("9");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn9.addActionListener(this);
		MetodoMagicoAcomodo(btn9, 2, 3,1, 1);

		btnMulti= new JButton("X");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnMulti.addActionListener(this);
		MetodoMagicoAcomodo(btnMulti, 3, 3, 1, 1);

		btn4= new JButton("4");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn4.addActionListener(this);
		MetodoMagicoAcomodo(btn4, 0, 4,1, 1);

		btn5= new JButton("5");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn5.addActionListener(this);
		MetodoMagicoAcomodo(btn5, 1,4,1, 1);

		btn6= new JButton("6");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn6.addActionListener(this);
		MetodoMagicoAcomodo(btn6, 2, 4,1, 1);

		btnResta= new JButton("-");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnResta.addActionListener(this);
		MetodoMagicoAcomodo(btnResta, 3, 4, 1, 1);

		btn3= new JButton("3");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn3.addActionListener(this);
		MetodoMagicoAcomodo(btn3, 0, 5,1, 1);

		btn2= new JButton("2");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn2.addActionListener(this);
		MetodoMagicoAcomodo(btn2, 1, 5,1, 1);

		btn1= new JButton("1");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn1.addActionListener(this);
		MetodoMagicoAcomodo(btn1, 2, 5,1, 1);

		btnSuma= new JButton("+");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnSuma.addActionListener(this);
		MetodoMagicoAcomodo(btnSuma, 3, 5, 1, 1);

		btnMasMen= new JButton("±");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnMasMen.addActionListener(this);
		MetodoMagicoAcomodo(btnMasMen, 0, 6, 1, 1);

		btn0= new JButton("0");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btn0.addActionListener(this);
		MetodoMagicoAcomodo(btn0, 1, 6, 1, 1);

		btnPunto= new JButton(".");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnPunto.addActionListener(this);
		MetodoMagicoAcomodo(btnPunto, 2,6, 1, 1);

		btnIgual= new JButton("=");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		btnIgual.addActionListener(this);
		MetodoMagicoAcomodo(btnIgual, 3, 6, 1, 1);

		pack();//Hacerlo lo mas pequeño posible
		setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		Component c = (Component)e.getSource();
		if (c==btn1) {
			texto=texto+btn1.getText();
			tfRes.setText(texto);
		}else if (c==btn2) {

			texto=texto+btn2.getText();
			tfRes.setText(texto);
		} 
		else if (c==btn3) {

			texto=texto+btn3.getText();
			tfRes.setText(texto);
		}else if (c==btn4) {
			texto=texto+btn4.getText();
			tfRes.setText(texto);
		}
		else if (c==btn5) {

			texto=texto+btn5.getText();
			tfRes.setText(texto);
		}else if (c==btn6) {

			texto=texto+btn6.getText();
			tfRes.setText(texto);
		}else if (c==btn7) {
			texto=texto+btn7.getText();
			tfRes.setText(texto);
		}else if (c==btn8) {
			texto=texto+btn8.getText();
			tfRes.setText(texto);
		}else if (c==btn9) {

			texto=texto+btn9.getText();
			tfRes.setText(texto);
		}else if (c==btn0) {

			texto=texto+btn0.getText();
			tfRes.setText(texto);
		}
		else if(c==btnCE) {
			texto="";
			tfRes.setText(texto);
		}
		else if(c==btnBorrar) {
			if(tfRes.getText()=="") {
				tfRes.setText("");
			}else {
				texto=tfRes.getText().substring(0, (tfRes.getText().length())-1);
				tfRes.setText(texto);
			}

		}else if(c==btnPotencia) {
			if(texto!="") {

				if(texto.contains("*")||texto.substring(1,texto.length()).contains("-")||texto.contains("+")||texto.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<texto.length(); i++) {
						double num4;
						if(texto.charAt(0)=='-') {
							texto=texto.substring(1,texto.length());
							bandera1=false;
						}
						if(texto.charAt(i)=='+'||texto.charAt(i)=='-'||texto.charAt(i)=='*'||texto.charAt(i)=='/') {
							if(texto.substring(i+1,texto.length())=="") {

							}else {
								String cad2=texto.substring(i+1,texto.length());
								double num3= Double.parseDouble(cad2);
								if(bandera1==false) {
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (Math.pow(num3, 2))-(num4);
									texto=String.valueOf(num5);
									tfRes.setText(texto);
								}else if(bandera1==true){
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (Math.pow(num3, 2))+(num4);
									texto=String.valueOf(num5);
									tfRes.setText(texto);
								}
								
							}
						}
					}
				}else {
					String num3= tfRes.getText();
					double num= Double.parseDouble(num3);
					texto=String.valueOf(Math.pow(num, 2));
					tfRes.setText(texto);
					texto=tfRes.getText();

				}
			}
		}else if(c==btnPunto) {

			if(band==true) {
				tfRes.setText(".");
				texto=texto+tfRes.getText();
				tfRes.setText(texto);
				band=false;
			}
		}else if(c==btnSuma) {
			if(texto!="") {
				if(texto.charAt(0)=='-') {
					texto=texto+" + ";
					tfRes.setText(texto);

				}
				else {if(texto.substring(1, texto.length()).contains("-")||texto.contains("*")||texto.contains("+")||texto.contains("/")) {

				} else {
					texto=texto+" + ";
					tfRes.setText(texto);
					texto=tfRes.getText();
					band=true;
				}
				}}

		}//suma
		else if(c==btnResta) {
			if(texto!="") {
				if(texto.substring(1, texto.length()).contains("-")||texto.contains("*")||texto.contains("+")||texto.contains("/")) {

				} else {
					texto=texto+" - ";
					tfRes.setText(texto);
					texto=tfRes.getText();
					band=true;
				}
			}
		}else if(c==btnMulti) {
			if(texto!="") {
				if(texto.substring(1, texto.length()).contains("-")||texto.contains("*")||texto.contains("+")||texto.contains("/")) {

				} else {
					texto=texto+" * ";
					tfRes.setText(texto);
					texto=tfRes.getText();
					band=true;
				}
			}
		}else if(c==btnDivision) {
			if(texto!="") {
				if(texto.substring(1, texto.length()).contains("-")||texto.contains("*")||texto.contains("+")||texto.contains("/")) {

				} else {
					texto=texto+" / ";
					tfRes.setText(texto);
					texto=tfRes.getText();
					band=true;
				}
			}
		}else if(c==btnMasMen) {
			if(texto!="") {
				if(texto.charAt(0)=='-') {
					texto=texto.substring(1,texto.length());
					tfRes.setText(texto);
				}
				else {
					texto="-"+texto;
					tfRes.setText(texto);
				}
			}
		}else if(c==btnPorcentaje) {
			if(texto!="") {

				if(texto.contains("*")||texto.substring(1,texto.length()).contains("-")||texto.contains("+")||texto.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<texto.length(); i++) {
						double num4;
						if(texto.charAt(0)=='-') {
							texto=texto.substring(1,texto.length());
							bandera1=false;
						}
						if(texto.charAt(i)=='+'||texto.charAt(i)=='-'||texto.charAt(i)=='*'||texto.charAt(i)=='/') {
							if(texto.substring(i+1,texto.length())=="") {

							}else {
								String cad2=texto.substring(i+1,texto.length());
								double num3= Double.parseDouble(cad2)/100;
								//1/Double.parseDouble(cad2)	
								if(bandera1==false) {
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5=(num3)*(num4);
									//								cambiar a menos num4 cambia num3				
									texto=texto.substring(0,i+1) +String.valueOf(num5);
									tfRes.setText("-"+texto);
								}else if(bandera1==true){
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (num3)*(num4);
									//cambia a +						
									texto=texto.substring(0,i+1) +String.valueOf(num5);
									tfRes.setText(texto);
								}
								;
							}
						}
					}
				}else {
					String num3= tfRes.getText();
					double num= Double.parseDouble(num3)/100;
					//cmabiar operacion como arriba
					texto=String.valueOf(num);
					tfRes.setText(texto);
					texto=tfRes.getText();

				}
			}

		}else if(c==btnpotNeg) {
			if(texto!="") {

				if(texto.contains("*")||texto.substring(1,texto.length()).contains("-")||texto.contains("+")||texto.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<texto.length(); i++) {
						double num4;
						if(texto.charAt(0)=='-') {
							texto=texto.substring(1,texto.length());
							bandera1=false;
						}
						if(texto.charAt(i)=='+'||texto.charAt(i)=='-'||texto.charAt(i)=='*'||texto.charAt(i)=='/') {
							if(texto.substring(i+1,texto.length())=="") {

							}else {
								String cad2=texto.substring(i+1,texto.length());
								double num3= 1/Double.parseDouble(cad2);
								if(bandera1==false) {
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (num4)-(num3);
									texto=String.valueOf(num5);
									tfRes.setText("-"+texto);
								}else if(bandera1==true){
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (num3)+(num4);
									texto=String.valueOf(num5);
									tfRes.setText(texto);
								}
								;
							}
						}
					}
				}else {
					String num3= tfRes.getText();
					double num= 1/Double.parseDouble(num3);
					texto=String.valueOf(num);
					tfRes.setText(texto);
					texto=tfRes.getText();

				}
			}
		}else if(c==btnRaizCua) {

			if(texto!="") {

				if(texto.contains("*")||texto.substring(1,texto.length()).contains("-")||texto.contains("+")||texto.contains("/")) {
					boolean bandera1=true;
					for(int i=0; i<texto.length(); i++) {
						double num4;
						if(texto.charAt(0)=='-') {
							texto=texto.substring(1,texto.length());
							bandera1=false;
						}
						if(texto.charAt(i)=='+'||texto.charAt(i)=='-'||texto.charAt(i)=='*'||texto.charAt(i)=='/') {
							if(texto.substring(i+1,texto.length())=="") {

							}else {
								String cad2=texto.substring(i+1,texto.length());
								double num3= Double.parseDouble(cad2);
								if(bandera1==false) {
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (Math.sqrt(num3))-(num4);
									texto=String.valueOf(num5);
									tfRes.setText(texto);
								}else if(bandera1==true){
									num4= (Double.parseDouble(texto.substring(0,i)));
									double num5= (Math.sqrt(num3))+(num4);
									texto=String.valueOf(num5);
									tfRes.setText(texto);
								}
								
							}
						}
					}
				}else {
					String num3= tfRes.getText();
					double num= Double.parseDouble(num3);
					if(texto.charAt(0)=='-') {
						JOptionPane.showMessageDialog(this, "No existen raices negativas!!!");
						texto="";
						tfRes.setText(texto);
					}else {
						texto=String.valueOf(Math.sqrt(num));
						tfRes.setText(texto);
					texto=tfRes.getText();
					}
				}
			}
		}else if(c==btnIgual) {
			boolean band2=true;
			if(texto.charAt(0)=='-') {
				texto=texto.substring(1,texto.length());
				band2=false;
			}

			for(int i=0;i<texto.length();i++) {
				char carac=texto.charAt(i);
				if(carac=='+') {
					String num1=texto.substring(0,i);
					String num2=texto.substring(i+1,texto.length());
					if(band2==false) {
						double resultado=Double.parseDouble(num2)-Double.parseDouble(num1);
						tfRes.setText(String.valueOf(resultado));
						texto=String.valueOf(resultado);
					}else {
						double resultado=Double.parseDouble(num1)+Double.parseDouble(num2);
						tfRes.setText(String.valueOf(resultado));
						texto=String.valueOf(resultado);
					}
				}
				else if(carac=='-') {
					String num1=texto.substring(0,i);
					String num2=texto.substring(i+1,texto.length());

					if(band2==false) {
						double resultado=Double.parseDouble(num1)+Double.parseDouble(num2);
						tfRes.setText(String.valueOf("-"+resultado));
						texto=String.valueOf("-"+resultado);
					}else {
						double resultado=Double.parseDouble(num1)-Double.parseDouble(num2);
						tfRes.setText(String.valueOf(+resultado));
						texto=String.valueOf(resultado);
					}
				}else if(carac=='*') {
					String num1=texto.substring(0,i);
					String num2=texto.substring(i+1,texto.length());
					if(band2==false) {
						double resultado=Double.parseDouble(num1)*Double.parseDouble(num2);
						tfRes.setText(String.valueOf("-"+resultado));
						texto=String.valueOf("-"+resultado);
					}else {
						double resultado=Double.parseDouble(num1)*Double.parseDouble(num2);
						tfRes.setText(String.valueOf(+resultado));
						texto=String.valueOf(+resultado);
					}
				}
				else if(carac=='/') {
					String num1=texto.substring(0,i);
					String num2=texto.substring(i+1,texto.length());

					if(Double.parseDouble(num2)==0) {
						JOptionPane.showMessageDialog (this,"Error al dividir entre cero");
						texto="";
						tfRes.setText(texto);
					}else if(band2==false) {
						double resultado=Double.parseDouble(num1)/Double.parseDouble(num2);
						tfRes.setText("-"+Double.toString(resultado));
						texto=String.valueOf("-"+resultado);
					}
					else {
						double resultado=Double.parseDouble(num1)/Double.parseDouble(num2);
						tfRes.setText("-"+Double.toString(resultado));
						texto=String.valueOf(+resultado);
					}
				}
			}//btn igual
		}}

	//System.out.println(texto);

	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(com, gbc);
		com.setFont(new Font("Arial",1/2,20));
		add(com);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		char caracter = e.getKeyChar();
		if(caracter<'0' || caracter>'9' )
			e.consume();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent e) {


	}
}
public class CalculadoraWindows {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}//main

}
