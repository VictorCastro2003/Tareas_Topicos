import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

class VentanaInicio extends JFrame {
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagLayout gbl2 = new GridBagLayout();
	GridBagConstraints gbc2 = new GridBagConstraints();
	GridBagLayout gbl3 = new GridBagLayout();
	GridBagConstraints gbc3 = new GridBagConstraints();
	GridBagLayout gbl4= new GridBagLayout();
	GridBagConstraints gbc4 = new GridBagConstraints();
	GridBagLayout gbl5= new GridBagLayout();
	GridBagConstraints gbc5 = new GridBagConstraints();

	JInternalFrame IF1;
	JButton btnAdd,btnEdit,btnBack,btnNext,btnList,btnSave,btnPrint,btnTest,btnCancel,btnSettings,btnDelete,btnSlip,btnExit;
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Internal Frames");
		setVisible(true);
		setResizable(false);

		JMenuBar menuBar =new  JMenuBar();
		JMenu menuMasters = new JMenu("Masters");
		JMenu menuBooking = new JMenu("Booking");
		JMenu menuTestP= new JMenu("Test Perform");
		JMenu menuPrinting= new JMenu("Printing");
		JMenu menuTransaction = new JMenu("Transaction");
		JMenu menuLabR= new JMenu("Lab reports");
		JMenu menuSettings = new JMenu("Settings");
		JMenu menuUtilities = new JMenu("Utilities");
		JMenu menuWindows= new JMenu("Windows");
		JMenu menuHelp= new JMenu("Help");
		menuBar.add(menuMasters);
		menuBar.add(menuBooking);
		menuBar.add(menuTestP);
		menuBar.add(menuPrinting);
		menuBar.add(menuTransaction);
		menuBar.add(menuLabR);
		menuBar.add(menuSettings);
		menuBar.add(menuUtilities);
		menuBar.add(menuWindows);
		menuBar.add(menuHelp);
		MetodoMagicoAcomodo(menuBar, 0, 0, 1, 1);

		JToolBar toolbar = new JToolBar(JToolBar.HORIZONTAL);
		btnAdd= new JButton();
		btnAdd.setIcon(new ImageIcon("./assets/add.png"));
		toolbar.add(btnAdd);
		btnEdit= new JButton();
		btnEdit.setIcon(new ImageIcon("./assets/edit.png"));
		toolbar.add(btnEdit);
		btnBack= new JButton();
		btnBack.setIcon(new ImageIcon("./assets/back.png"));
		toolbar.add(btnBack);
		btnNext= new JButton();
		btnNext.setIcon(new ImageIcon("./assets/next.png"));
		toolbar.add(btnNext);
		btnList= new JButton();
		btnList.setIcon(new ImageIcon("./assets/list.png"));
		toolbar.add(btnList);
		btnSave= new JButton();
		btnSave.setIcon(new ImageIcon("./assets/save.png"));
		toolbar.add(btnSave);
		btnPrint= new JButton();
		btnPrint.setIcon(new ImageIcon("./assets/print.png"));
		toolbar.add(btnPrint);
		btnTest= new JButton();
		btnTest.setIcon(new ImageIcon("./assets/test.png"));
		toolbar.add(btnTest);
		btnCancel= new JButton();
		btnCancel.setIcon(new ImageIcon("./assets/cancel.png"));
		toolbar.add(btnCancel);
		btnSettings= new JButton();
		btnSettings.setIcon(new ImageIcon("./assets/settings.png"));
		toolbar.add(btnSettings);
		btnDelete= new JButton();
		btnDelete.setIcon(new ImageIcon("./assets/delete.png"));
		toolbar.add(btnDelete);
		btnSlip= new JButton();
		btnSlip.setIcon(new ImageIcon("./assets/slip.png"));
		toolbar.add(btnSlip);
		btnExit= new JButton();
		btnExit.setIcon(new ImageIcon("./assets/exit.png"));
		toolbar.add(btnExit);
		MetodoMagicoAcomodo(toolbar, 0, 1, 1, 1);

		JDesktopPane desktopPane = new JDesktopPane();
		IF1 = new JInternalFrame();

		IF1.getContentPane().setLayout(gbl2);
		IF1.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IF1.setTitle("");
		IF1.setSize(300,300);
		IF1.setClosable(true);
		IF1.setIconifiable(true);
		IF1.setMaximizable(true);
		IF1.setResizable(true);
		IF1.setVisible(true);

		MetodoMagicoAcomodo(IF1, 0, 2, 1,1);

		JLabel lbl1 = new JLabel("Patient ID    ");
		MetodoMagicoIF(IF1, lbl1, 0, 0,1, 1);

		JTextField tf= new JTextField(7);
		MetodoMagicoIF(IF1, tf, 1, 0,1, 1);

		JLabel lbl2 = new JLabel("   Date   ");
		MetodoMagicoIF(IF1, lbl2, 2, 0,1, 1);

		JComboBox<String> cb= new JComboBox<String>();
		cb.addItem("12/12/2023");
		MetodoMagicoIF(IF1, cb, 3, 0,1, 1);

		JLabel lbl3 = new JLabel("*Time(hh:mm)    ");
		MetodoMagicoIF(IF1, lbl3, 4, 0,1, 1);

		JTextField tf1 = new JTextField(1);
		MetodoMagicoIF(IF1, tf1, 5, 0,1, 1);

		JLabel lbl4= new JLabel(" : ");
		MetodoMagicoIF(IF1, lbl4, 6, 0,1, 1);

		JTextField tf2 = new JTextField(1);
		MetodoMagicoIF(IF1, tf2, 7, 0,1, 1);
		JLabel lbl5= new JLabel("    Lab No.    ");
		MetodoMagicoIF(IF1, lbl5, 8, 0,1, 1);
		JTextField tf3=new JTextField(5);
		MetodoMagicoIF(IF1, tf3, 9, 0,1, 1);

		//Segunda fila
		JLabel lbl6 = new JLabel("Name");
		MetodoMagicoIF(IF1, lbl6, 0, 1, 1, 1);
		JComboBox<String> cb2= new JComboBox<String>();
		cb2.addItem("MR.");
		MetodoMagicoIF(IF1, cb2, 1, 1,1, 1);

		JTextField tf4 = new JTextField(12);
		MetodoMagicoIF(IF1, tf4,2, 1, 2, 1);

		JLabel lbl7= new JLabel("Sex  ");
		MetodoMagicoIF(IF1, lbl7, 0, 2, 1, 1);

		JComboBox<String> cb3= new JComboBox<String>();
		cb3.addItem("MALE  ");
		MetodoMagicoIF(IF1, cb3, 1, 2,1, 1);

		JLabel lbl8= new JLabel("Age");
		MetodoMagicoIF(IF1, lbl8, 2, 2,1, 1);

		JTextField tf5= new JTextField(2);
		MetodoMagicoIF(IF1, tf5,3, 2, 1,1);

		JLabel lbl9= new JLabel("Month");
		MetodoMagicoIF(IF1, lbl9, 4, 2,1, 1);

		JTextField tf6= new JTextField(2);
		MetodoMagicoIF(IF1, tf6,5, 2, 1,1);

		JLabel lbl10= new JLabel("Days");
		MetodoMagicoIF(IF1, lbl10, 6, 2,1, 1);

		JTextField tf7= new JTextField(2);
		MetodoMagicoIF(IF1, tf7,7, 2, 1,1);

		JLabel lbl11= new JLabel("Sample By");
		MetodoMagicoIF(IF1, lbl11, 8, 2, 1, 1);

		JTextField tf8 = new JTextField(8);
		MetodoMagicoIF(IF1, tf8, 9, 2,1, 1);

		JLabel lbl12= new JLabel("Reffered By: ");
		MetodoMagicoIF(IF1, lbl12, 0, 3, 1, 1);

		JTextField tf9= new JTextField(8);
		MetodoMagicoIF(IF1, tf9, 1, 3, 1, 1);

		JTextField tf10 = new JTextField(10);
		MetodoMagicoIF(IF1, tf10,2, 3, 1,1);

		JLabel lbl13= new JLabel("Panel Code");
		MetodoMagicoIF(IF1, lbl13, 8, 3, 1, 1);

		JTextField tf11 = new JTextField(8);
		MetodoMagicoIF(IF1, tf11, 9, 3,1, 1);

		JLabel lbl14= new JLabel("Panel ID");
		MetodoMagicoIF(IF1, lbl14, 8, 4, 1, 1);

		JTextField tf12 = new JTextField(8);
		MetodoMagicoIF(IF1, tf12, 9, 4,1, 1);

		JLabel lbl15= new JLabel("e-mail");
		MetodoMagicoIF(IF1, lbl15, 8, 5, 1, 1);

		JTextField tf13 = new JTextField(8);
		MetodoMagicoIF(IF1, tf13, 9, 5,1, 1);


		JPanel pn1 = new JPanel();
		pn1.setSize(300,300);
		pn1.setLayout(gbl3);
		MetodoMagicoAcomodo(pn1, 0, 3, 1,1);

		String[] columnNames = {"testID", "testName ", "Rate","Disc%","DisccounA","Tax(%)","Tax Amt"};
		Object[][] datos = {
				{"Test ID", "Test Name          ","Rate","Disc%","Discount Amount","Tax(%)","Tax Amt"},
				{"", "", "",""}};

		DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
		final JTable table = new JTable(dtm);
		table.setBackground(Color.pink);
		pn1.setBackground(Color.LIGHT_GRAY);
		gbc3.fill=GridBagConstraints.BOTH;
		MetodoMagicoIF(pn1, table, 0, 0, 1, 1);

		JPanel pn2 = new JPanel();
		pn2.setSize(300,300);
		pn2.setLayout(gbl4);
		pn2.setBackground(Color.MAGENTA);
		MetodoMagicoAcomodo(pn2, 1, 3, 1,1);

		JLabel lbl16= new JLabel("Total less");
		MetodoMagicoIF2(pn2, lbl16, 0, 0, 1, 1);
		JTextField tf14 = new JTextField(5);
		tf14.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf14, 1, 0, 1,1);

		JLabel lbl17= new JLabel("Test Amt");
		MetodoMagicoIF2(pn2, lbl17, 0, 2, 1, 1);
		JTextField tf15 = new JTextField(5);
		tf15.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf15, 1,2, 1,1);
		
		JLabel lbl18= new JLabel("Concession");
		MetodoMagicoIF2(pn2, lbl18, 0, 3, 1, 1);
		JTextField tf16 = new JTextField(5);
		tf16.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf16, 1,3, 1,1);

		JLabel lbl19= new JLabel("Home colection");
		MetodoMagicoIF2(pn2, lbl19, 0, 4, 1, 1);
		JTextField tf17 = new JTextField(5);
		tf17.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf17, 1,4, 1,1);
		
		JLabel lbl20= new JLabel("Tax Amt");
		MetodoMagicoIF2(pn2, lbl20, 0, 5, 1, 1);
		JTextField tf18 = new JTextField(5);
		tf18.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf18, 1,5, 1,1);
		
		JLabel lbl21= new JLabel("Net Amt");
		MetodoMagicoIF2(pn2, lbl21, 0, 6, 1, 1);
		JTextField tf19 = new JTextField(5);
		tf19.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf19, 1,6, 1,1);
		
		JLabel lbl22= new JLabel("Balance");
		MetodoMagicoIF2(pn2, lbl22, 0, 7, 1, 1);
		JTextField tf20 = new JTextField(5);
		tf20.setBackground(Color.BLUE);
		MetodoMagicoIF2(pn2, tf20, 1,7, 1,1);
		
		JPanel pn3 = new JPanel();
		pn3.setSize(300,300);
		pn3.setLayout(gbl5);
		MetodoMagicoAcomodo(pn3, 0, 4, 1,1);
		JLabel lbl23= new JLabel("Home Collection");
		MetodoMagicoIF3(pn3, lbl23, 0,0, 1,1);
		JTextField tf21 = new JTextField(5);
		MetodoMagicoIF3(pn3, tf21, 1, 0, 1, 1);
		JLabel lbl24= new JLabel("Paid");
		MetodoMagicoIF3(pn3, lbl24, 2, 0, 1, 1);
		JTextField tf22 = new JTextField(5);
		MetodoMagicoIF3(pn3, tf22, 3,0, 1, 1);
		JLabel lbl25= new JLabel("Pay Type");
		MetodoMagicoIF3(pn3, lbl25, 4, 0, 1, 1);
		JTextField tf23 = new JTextField(5);
		MetodoMagicoIF3(pn3, tf23, 5, 0, 1,1);
		
		JLabel lbl26= new JLabel("Pay Type");
		MetodoMagicoIF3(pn3, lbl26, 6, 0, 1, 1);
		JTextField tf24 = new JTextField(5);
		MetodoMagicoIF3(pn3, tf24,7, 0, 1,1);
		
		JTextArea ta1= new JTextArea(3,3);
		ta1.setText("Comandos...");
		MetodoMagicoIF3(pn3, ta1, 0, 1,2, 2);
		
		pack();//Hacerlo lo mas pequeño posible
		setLocationRelativeTo(null);
	}//Constructor
	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(com, gbc);
		add(com);
	}
	public void MetodoMagicoIF(JInternalFrame IF,Component com,int gx,int gy,int gw,int gh) {
		gbc2.gridx=gx;
		gbc2.gridy=gy;
		gbc2.gridwidth=gw;
		gbc2.gridheight=gh;
		gbl2.setConstraints(com, gbc2);
		IF.add(com);
	}
	public void MetodoMagicoIF(JPanel Pn1,Component com,int gx,int gy,int gw,int gh) {
		gbc3.gridx=gx;
		gbc3.gridy=gy;
		gbc3.gridwidth=gw;
		gbc3.gridheight=gh;
		gbl3.setConstraints(com, gbc3);
		Pn1.add(com);
	}
	public void MetodoMagicoIF2(JPanel Pn1,Component com,int gx,int gy,int gw,int gh) {
		gbc4.gridx=gx;
		gbc4.gridy=gy;
		gbc4.gridwidth=gw;
		gbc4.gridheight=gh;
		gbl4.setConstraints(com, gbc4);
		Pn1.add(com);
	}
	
	public void MetodoMagicoIF3(JPanel Pn1,Component com,int gx,int gy,int gw,int gh) {
		gbc5.gridx=gx;
		gbc5.gridy=gy;
		gbc5.gridwidth=gw;
		gbc5.gridheight=gh;
		gbl5.setConstraints(com, gbc5);
		Pn1.add(com);
	}

}//VentanaInicio

public class MenuInternalFrames {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}