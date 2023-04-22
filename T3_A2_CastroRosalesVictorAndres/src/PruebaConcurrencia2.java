import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;


class VentanaInicio extends JFrame {
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	String[] encuesta= new String[10];
	String[]eleccion= {"Si","No"};
	
	public VentanaInicio() {
		getContentPane().setLayout(gbl); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Twitter");
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lbl1 = new JLabel("SI");
		MetodoMagicoAcomodo(lbl1, 0, 0, 2, 1);
		
		JLabel lbl2 = new JLabel("NO");
		MetodoMagicoAcomodo(lbl2, 3, 0, 2, 1);
		
		JLabel lbl3 = new JLabel(" ");
		MetodoMagicoAcomodo(lbl3, 2, 1, 1, 3);
		String cadFin="";
		String cad="";
		for (int i = 0; i < encuesta.length; i++) {
			 cad=cad+""+ encuesta[i];
			if(cad.equals("si")) {
				cadFin+=cad;
			}
		}
		JTextArea PersonasSi= new JTextArea();
		PersonasSi.setText(cadFin);
		PersonasSi.setLineWrap(true);
		PersonasSi.setWrapStyleWord(true);
		JScrollPane scroll1 = new JScrollPane(PersonasSi);
		PersonasSi.setEditable(false);
		
		MetodoMagicoAcomodo(PersonasSi, 0, 1, 2, 3);
		
		JTextArea PersonasNo= new JTextArea();
		PersonasNo = new JTextArea();
		PersonasNo.setLineWrap(true);
		PersonasNo.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(PersonasNo);
		PersonasNo.setEditable(false);
		MetodoMagicoAcomodo(PersonasNo, 3, 1, 2, 3);
		
		
		JTextArea a1= new JTextArea();
		MetodoMagicoAcomodo(a1, 0, 0, 2, 2);
		pack();
	}

	public void llenado() {
		Random random = new Random();
	
		for(int i=0;i<encuesta.length;i++) {
			int randomNumber = random.nextInt(2); 
			encuesta[i]=eleccion[randomNumber];
		}
		System.out.println(Arrays.toString(encuesta));
	}

	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(com, gbc);
		add(com);
	}
}


public class PruebaConcurrencia2 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
		VentanaInicio v= new VentanaInicio();
		v.llenado();
	}//main

}

//==========================




	
	
	
