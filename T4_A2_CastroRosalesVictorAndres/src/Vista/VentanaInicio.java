package Vista;

import Controlador.AlumnoDAO;
import Modelo.Alumno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio extends JFrame implements ActionListener {

    String datos[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
    JMenuBar menuBar;
    JMenu menuPantallas;
    JInternalFrame IF_Altas, IF_Bajas, IF_Cambios ,IF_Consultas;
    JMenuItem itemAltas,itemBajas,itemCambios,itemConsultas;
    JButton btnAgregar, btnBorrar,btnCancelar, btnEliminar2,btnCancelar2,btnBorrar2,btnGuadarC;
    JTextField tf_numControl,tfNombre,tfAp,tfAm,tfNumControl2,tf_nombre2,tfAp2,tfAm2,tfNumControl3,tfNombre3,tfAp3,tfAm3;
    JComboBox<String> comboEdad,comboSemestre,comboCarrera,comboEdad2,comboCarrera2,comboEdad3,comboCarrera3;
    SpinnerListModel modeloDatos;
    JSpinner spinner,spinner2;
    JScrollPane scrollPane,scrollPane2;
    public VentanaInicio(){
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sistema ABCC");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        //Componentes Graficos
         menuBar =new  JMenuBar();
         menuPantallas = new JMenu();
        menuPantallas.setIcon(new ImageIcon("./assets/opciones.png"));

        itemAltas = new JMenuItem("Agregar");
        itemAltas.setIcon(new ImageIcon("./assets/UserAdd.png"));
        itemAltas.addActionListener(this);
        menuPantallas.add(itemAltas);

        itemBajas = new JMenuItem("Bajas");
        itemBajas.setIcon(new ImageIcon("./assets/UserRemove.png"));
        itemBajas.addActionListener(this);
        menuPantallas.add(itemBajas);

         itemCambios = new JMenuItem("Cambios");
         itemCambios.setIcon(new ImageIcon("./assets/modificar.png"));
         itemCambios.addActionListener(this);
         menuPantallas.add(itemCambios);

        itemConsultas  = new JMenuItem("Consultas");
        itemConsultas.setIcon(new ImageIcon("./assets/consulta.png"));
        itemConsultas.addActionListener(this);

        menuPantallas.add(itemConsultas);
        menuBar.add(menuPantallas);
        setJMenuBar(menuBar);

        //DesktoPane
        JDesktopPane desktopPane = new JDesktopPane();
        IF_Altas = new JInternalFrame();
        IF_Altas.getContentPane().setLayout(null);
        IF_Altas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Altas.setTitle("ALTAS");
        IF_Altas.setSize(690, 550);
        IF_Altas.setResizable(false);

        JLabel lbl1  = new JLabel("                          ALTAS                     ");
        lbl1.setFont(new Font("Arial", Font.BOLD, 30));
        lbl1.setForeground(Color.white);
        lbl1.setBounds(60, 0, 685, 60);
        IF_Altas.add(lbl1);
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, 684, 60);
        fondo.setBackground(Color.green);
        fondo.setOpaque(true);
        IF_Altas.add(fondo);

        JLabel lbl_numControl = new JLabel("NUMERO DE CONTROL: ");
        lbl_numControl.setBounds(100, 70, 150, 10);
        IF_Altas.add(lbl_numControl);
         tf_numControl = new JTextField();
        tf_numControl.setBounds(250, 68, 170, 20);
        IF_Altas.add(tf_numControl);

        JLabel lbl2 = new JLabel("NOMBRE(S): ");
        lbl2.setBounds(100, 95, 150, 15);
        IF_Altas.add(lbl2);

         tfNombre = new JTextField();
        tfNombre.setBounds(195, 93, 225, 20);
        IF_Altas.add(tfNombre);


        JLabel lbl3= new JLabel("Edad: ");
        lbl3.setBounds(100,120,200,15);
        IF_Altas.add(lbl3);

         comboEdad=new JComboBox<String>();
        comboEdad.addItem("Selecciona Edad..");
        for (int i=1;i<=120;i++) {
            String n=String.valueOf(i);
            comboEdad.addItem(n);
        }
        comboEdad.setBounds(250,120,170,20);
        IF_Altas.add(comboEdad);

        JLabel lblAp = new JLabel("APELLIDO PATERNO: ");
        lblAp.setBounds(100, 150, 150, 15);
        IF_Altas.add(lblAp);

         tfAp = new JTextField();
        tfAp.setBounds(250, 150, 170, 20);
        IF_Altas.add(tfAp);

        JLabel lblAm = new JLabel("APELLIDO MATERNO:");
        lblAm.setBounds(100, 180, 150, 15);
        IF_Altas.add(lblAm);
         tfAm = new JTextField();
        tfAm.setBounds(250, 175, 170, 20);
        IF_Altas.add(tfAm);

        JLabel lblSemestre = new JLabel("SEMESTRE:");
        lblSemestre.setBounds(100, 200, 150, 15);
        IF_Altas.add(lblSemestre);

         comboSemestre=new JComboBox<String>();
        comboSemestre.addItem("Elige Semestre..");
        for (int i=1;i<=12;i++) {
            String n=String.valueOf(i);
            comboSemestre.addItem(n);
        }
        comboSemestre.setBounds(250,200,170,20);
        IF_Altas.add(comboSemestre);

        JLabel lblCarrera = new JLabel("CARRERA:");
        lblCarrera.setBounds(100, 225, 150, 15);
        IF_Altas.add(lblCarrera);
        String [] items2 = {"Elige Carrera:", "ISC", "IM", "IIA", "LA", "LCP"};
        comboCarrera = new JComboBox<>(items2);
        comboCarrera.setBounds(250, 228, 170, 20);
        IF_Altas.add(comboCarrera);

        btnAgregar = new JButton("AGREGAR");
        btnAgregar.setBounds(460, 80, 100, 20);
        btnAgregar.addActionListener(this);
        IF_Altas.add(btnAgregar);

        btnBorrar = new JButton("BORRAR");
        btnBorrar.setBounds(460, 150, 100, 20);
        IF_Altas.add(btnBorrar);

        btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(460, 220, 100, 20);
        IF_Altas.add(btnCancelar);

        String[] columnNames = {"No. De Control", "Nombre", "Edad", "Apellido Paterno", "Apellido Materno", "Semestre", "Carrera"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        JTable table = new JTable(model);
         scrollPane=  new JScrollPane(table);
        scrollPane.setBounds(100,300,480,100);
        IF_Altas.add(scrollPane);

        desktopPane.add(IF_Altas);


        IF_Bajas = new JInternalFrame();
        IF_Bajas.getContentPane().setLayout(null);
        IF_Bajas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Bajas.setTitle("Bajas");
        IF_Bajas.setSize(690, 550);
        IF_Bajas.setResizable(false);




        JLabel lblBajas = new JLabel("                          BAJAS                      ");
        lblBajas.setFont(new Font("Arial", Font.BOLD, 30));
        lblBajas.setForeground(Color.white);
        lblBajas.setBounds(60, 0, 684, 60);
        IF_Bajas.add(lblBajas);

        JLabel lblFondo2 = new JLabel();
        lblFondo2.setBounds(0, 0, 684, 60);
        lblFondo2.setBackground(Color.red);
        lblFondo2.setOpaque(true);
        IF_Bajas.add(lblFondo2);

        JLabel lblNumControl2 = new JLabel("NUMERO DE CONTROL:");
        lblNumControl2.setBounds(75, 75, 150, 20);
        IF_Bajas.add(lblNumControl2);
         tfNumControl2 = new JTextField();
        tfNumControl2.setBackground(Color.cyan);
        tfNumControl2.setBounds(225, 70, 100, 25);
        IF_Bajas.add(tfNumControl2);

        JButton btnBuscar= new JButton();
        btnBuscar.setIcon(new ImageIcon("./assets/lupaBusqueda.png"));
        btnBuscar.setBounds(350,70,100,30);
        btnBuscar.setBackground(Color.white);
        IF_Bajas.add(btnBuscar);

         btnBorrar2= new JButton("BORRAR");
        btnBorrar2.setBounds(460,75,100,20);
        btnBorrar2.setBackground(Color.white);
        IF_Bajas.add(btnBorrar2);

        JLabel lblNombre2 = new JLabel("NOMBRE(S):");
        lblNombre2.setBounds(75, 120, 150, 15);
        IF_Bajas.add(lblNombre2);
         tf_nombre2 = new JTextField();
        tf_nombre2.setBounds(250, 120, 150, 20);
        IF_Bajas.add(tf_nombre2);



        JLabel lblEdad2 = new JLabel("EDAD: ");
        lblEdad2.setBounds(100,150,150,20);
        IF_Bajas.add(lblEdad2);
         comboEdad2=new JComboBox<String>();
        comboEdad2.addItem("Selecciona Edad..");
        for (int i=1;i<=120;i++) {
            String n=String.valueOf(i);
            comboEdad2.addItem(n);
        }
        comboEdad2.setBounds(250,150,150,20);
        IF_Bajas.add(comboEdad2);

        JLabel lblAp2 = new JLabel("APELLIDO PATERNO:");
        lblAp2.setBounds(75, 180, 150, 10);
        IF_Bajas.add(lblAp2);
         tfAp2 = new JTextField();
        tfAp2.setBounds(250, 180, 150, 20);
        IF_Bajas.add(tfAp2);

        JLabel lblAm2 = new JLabel("APELLIDO MATERNO:");
        lblAm2.setBounds(75, 205, 150, 10);
        IF_Bajas.add(lblAm2);
         tfAm2 = new JTextField();
        tfAm2.setBounds(250, 205, 150, 20);
        IF_Bajas.add(tfAm2);

        JLabel lblSemestre2 = new JLabel("SEMESTRE:");
        lblSemestre2.setBounds(75, 230, 150, 15);
        IF_Bajas.add(lblSemestre2);

         modeloDatos = new SpinnerListModel(datos);
         spinner = new JSpinner(modeloDatos);

        spinner.setBounds(250,230,150,22);
        IF_Bajas.add(spinner);

        JLabel lblCarrera2 = new JLabel("CARRERA:");
        lblCarrera2.setBounds(75, 260, 150, 10);
        IF_Bajas.add(lblCarrera2);

        String carrera [] = {"Selecciona Carrera...","ISC", "IIA", "IM", "LA", "LCP"};
        comboCarrera2 = new JComboBox<>(carrera);
        comboCarrera2.setBounds(250, 260, 150, 20);
        IF_Bajas.add(comboCarrera2);

        btnEliminar2 = new JButton("ELIMINAR");
        btnEliminar2.setBounds(500, 165, 100, 30);
        btnEliminar2.setBackground(Color.white);
        btnEliminar2.addActionListener(this);
        IF_Bajas.add(btnEliminar2);

         btnCancelar2= new JButton("CANCELAR");
        btnCancelar2.setBounds(500,240,100,30);
        btnCancelar2.setBackground(Color.white);
        IF_Bajas.add(btnCancelar2);

        JTable table2 = new JTable(model);
         scrollPane2=  new JScrollPane(table2);
        scrollPane2.setBounds(100,300,480,100);
        IF_Bajas.add(scrollPane2);

        desktopPane.add(IF_Bajas);

        //Cambios
        IF_Cambios= new JInternalFrame();
        IF_Cambios.getContentPane().setLayout(null);
        IF_Cambios.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Cambios.setTitle("Cambios");
        IF_Cambios.setSize(690, 550);
        IF_Cambios.setResizable(false);




        JLabel lblCambios= new JLabel("                          CAMBIOS                      ");
        lblCambios.setFont(new Font("Arial", Font.BOLD, 30));
        lblCambios.setForeground(Color.white);
        lblCambios.setBounds(60, 0, 684, 60);
        IF_Cambios.add(lblCambios);

        JLabel lblFondo3 = new JLabel();
        lblFondo3.setBounds(0, 0, 684, 60);
        lblFondo3.setBackground(Color.orange);
        lblFondo3.setOpaque(true);
        IF_Cambios.add(lblFondo3);

        JLabel lblNumControl3 = new JLabel("NUMERO DE CONTROL:");
        lblNumControl3.setBounds(75, 75, 150, 20);
        IF_Cambios.add(lblNumControl3);
         tfNumControl3 = new JTextField();
        tfNumControl3.setBackground(Color.cyan);
        tfNumControl3.setBounds(225, 70, 100, 25);
        IF_Cambios.add(tfNumControl3);

        JButton btnBuscar2= new JButton();
        btnBuscar2.setIcon(new ImageIcon("./assets/lupaBusqueda.png"));
        btnBuscar2.setBounds(350,70,100,30);
        btnBuscar2.setBackground(Color.white);
        IF_Cambios.add(btnBuscar2);

        JButton btnBorrar3= new JButton("BORRAR");
        btnBorrar3.setBounds(460,75,100,20);
        btnBorrar3.setBackground(Color.white);
        IF_Cambios.add(btnBorrar3);

        JLabel lblNombre3 = new JLabel("NOMBRE(S):");
        lblNombre3.setBounds(75, 120, 150, 15);
        IF_Cambios.add(lblNombre3);
         tfNombre3 = new JTextField();
        tfNombre3.setBounds(250, 120, 150, 20);
        IF_Cambios.add(tfNombre3);



        JLabel lblEdad3 = new JLabel("EDAD: ");
        lblEdad3.setBounds(100,150,150,20);
        IF_Cambios.add(lblEdad3);
         comboEdad3=new JComboBox<String>();
        comboEdad3.addItem("Selecciona Edad..");

        for (int i=1;i<=120;i++) {
            String n=String.valueOf(i);
            comboEdad3.addItem(n);
        }
        comboEdad3.setBounds(250,150,150,20);
        IF_Cambios.add(comboEdad3);

        JLabel lblAp3 = new JLabel("APELLIDO PATERNO:");
        lblAp3.setBounds(75, 180, 150, 10);
        IF_Cambios.add(lblAp3);
         tfAp3 = new JTextField();
        tfAp3.setBounds(250, 180, 150, 20);
        IF_Cambios.add(tfAp3);

        JLabel lblAm3 = new JLabel("APELLIDO MATERNO:");
        lblAm3.setBounds(75, 205, 150, 10);
        IF_Cambios.add(lblAm3);
         tfAm3 = new JTextField();
        tfAm3.setBounds(250, 205, 150, 20);
        IF_Cambios.add(tfAm3);

        JLabel lblSemestre3 = new JLabel("SEMESTRE:");
        lblSemestre3.setBounds(75, 230, 150, 15);
        IF_Cambios.add(lblSemestre3);

         spinner2 = new JSpinner(modeloDatos);
        spinner2.setBounds(250,230,150,22);
        IF_Cambios.add(spinner2);

        JLabel lblCarrera3 = new JLabel("CARRERA:");
        lblCarrera3.setBounds(75, 260, 150, 10);
        IF_Cambios.add(lblCarrera3);

        comboCarrera3 = new JComboBox<>(carrera);
        comboCarrera3.setBounds(250, 260, 150, 20);
        IF_Cambios.add(comboCarrera3);

         btnGuadarC = new JButton("Guardar Cambios");
        btnGuadarC.setBounds(450, 165, 140, 30);
        btnGuadarC.setBackground(Color.white);
        btnGuadarC.addActionListener(this);
        IF_Cambios.add(btnGuadarC);

        JButton btnCancelar3= new JButton("CANCELAR");
        btnCancelar3.setBounds(470,230,100,30);
        btnCancelar3.setBackground(Color.white);
        IF_Cambios.add(btnCancelar3);

        JTable table3 = new JTable(model);
        JScrollPane scrollPane3=  new JScrollPane(table3);
        scrollPane3.setBounds(100,300,480,100);
        IF_Cambios.add(scrollPane3);

        desktopPane.add(IF_Cambios);

        //Consultas
        IF_Consultas = new JInternalFrame();
        IF_Consultas.getContentPane().setLayout(null);
        IF_Consultas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Consultas.setTitle("Consultas");
        IF_Consultas.setSize(690, 550);
        IF_Consultas.setMaximizable(true);
        IF_Consultas.setIconifiable(true);
        IF_Consultas.setClosable(true);
        IF_Consultas.setResizable(true);
        IF_Consultas.setLayout(null);

        JLabel lblConsultas = new JLabel("                        CONSULTAS                       ");
        lblConsultas.setFont(new Font("Arial", Font.BOLD, 30));
        lblConsultas.setForeground(Color.white);
        lblConsultas.setBounds(60, 0, 684, 60);
        IF_Consultas.add(lblConsultas);

        JLabel lblFondo4 = new JLabel();
        lblFondo4.setBounds(0, 0, 684, 60);
        lblFondo4.setBackground(Color.blue);
        lblFondo4.setOpaque(true);
        IF_Consultas.add(lblFondo4);



        JRadioButton radioTodos;


        JLabel seleccion = new JLabel("Selecciona Criterio de Busqueda");
        seleccion.setBounds(60, 60, 500, 30);
        IF_Consultas.add(seleccion);

        radioTodos = new JRadioButton("TODOS");
        radioTodos.setBounds(40, 100, 80, 30);
        IF_Consultas.add(radioTodos);

        JRadioButton radioNombre = new JRadioButton("NOMBRE:");
        radioNombre.setBounds(130, 100, 100, 30);
        IF_Consultas.add(radioNombre);

        JTextField tfNombre4 = new JTextField();
        tfNombre4.setBounds(280, 100, 120, 20);
        IF_Consultas.add(tfNombre4);


        JRadioButton radioEdad = new JRadioButton("EDAD: ");
        radioEdad.setBounds(130,140,100,20);
        IF_Consultas.add(radioEdad);

        JComboBox<String> comboEdad4=new JComboBox<String>();
        comboEdad4.addItem("Selecciona Edad..");
        comboEdad4.setBounds(280,140,150,20);
        IF_Consultas.add(comboEdad4);

        JRadioButton radioAp = new JRadioButton("APELLIDO PATERNO:");
        radioAp.setBounds(130, 180, 150, 20);
        IF_Consultas.add(radioAp);

        JTextField txtAp1 = new JTextField();
        txtAp1.setBounds(280, 180, 120, 20);
        IF_Consultas.add(txtAp1);

        JRadioButton radioAp2 = new JRadioButton("APELLIDO MATERNO:");
        radioAp2.setBounds(130, 220, 160, 20);
        IF_Consultas.add(radioAp2);

        JTextField tfAp4 = new JTextField();
        tfAp4.setBounds(280, 220, 120, 20);
        IF_Consultas.add(tfAp4);

        JRadioButton radioSemestre= new JRadioButton("SEMESTRE:");
        radioSemestre.setBounds(130, 260, 150, 20);
        IF_Consultas.add(radioSemestre);

        JSpinner spinner3 = new JSpinner(modeloDatos);
        spinner3.setBounds(280,260,150,20);
        IF_Consultas.add(spinner3);

        JRadioButton radioCarrera = new JRadioButton("CARRERA:");
        radioCarrera.setBounds(130, 290, 150, 20);
        IF_Consultas.add(radioCarrera);

        JComboBox<String> comboCarrera4 = new JComboBox<>(carrera);
        comboCarrera4.setBounds(280, 290, 150, 20);
        IF_Consultas.add(comboCarrera4);

        JButton botonBusqueda4 = new JButton();
        botonBusqueda4.setBounds(530, 135, 100, 35);
        botonBusqueda4.setIcon(new ImageIcon("./assets/lupa.png"));
        IF_Consultas.add(botonBusqueda4);

        JButton btnCancelar4 = new JButton("CANCELAR");
        btnCancelar4.setBounds(530, 260, 100, 40);
        IF_Consultas.add(btnCancelar4);

        JButton btnBorrar4 = new JButton("BORRAR");
        btnBorrar4.setBounds(530, 200, 100, 40);
        IF_Consultas.add(btnBorrar4);

        JTable table4 = new JTable(model);
        JScrollPane scrollPane4=  new JScrollPane(table4);
        scrollPane4.setBounds(100,320,480,100);
        IF_Consultas.add(scrollPane4);

        desktopPane.add(IF_Consultas);
        add(desktopPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInicio();
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Component c=(Component) e.getSource();
        if(c==itemAltas) {
            IF_Altas.setVisible(true);
            IF_Bajas.setVisible(false);
            IF_Cambios.setVisible(false);
            IF_Consultas.setVisible(false);
        }else if(c==itemBajas){
            IF_Bajas.setVisible(true);
            IF_Altas.setVisible(false);
            IF_Cambios.setVisible(false);
            IF_Consultas.setVisible(false);
        } else if (c==itemCambios) {
            IF_Bajas.setVisible(false);
            IF_Altas.setVisible(false);
            IF_Cambios.setVisible(true);
            IF_Consultas.setVisible(false);
        } else if (c==itemConsultas) {
            IF_Bajas.setVisible(false);
            IF_Altas.setVisible(false);
            IF_Cambios.setVisible(false);
            IF_Consultas.setVisible(true);
        }else if (c==btnAgregar){

            AlumnoDAO alumnoDAO =  new AlumnoDAO();
            Alumno a1= new Alumno (tf_numControl.getText(),tfNombre.getText(),tfAp.getText(),tfAm.getText(),
                    (byte) Integer.parseInt(String.valueOf((comboEdad.getSelectedIndex())+1)),  (byte) Integer.parseInt(String.valueOf((comboSemestre.getSelectedIndex())+1)),
                    comboCarrera.getItemAt(comboCarrera.getSelectedIndex()));
            System.out.println(alumnoDAO.agregarAlumno(a1));
        } else if (c==btnEliminar2) {
            AlumnoDAO alumnoDAO =  new AlumnoDAO();
            System.out.println(alumnoDAO.eliminarAlumno(tfNumControl2.getText()));

        } else if (c== btnGuadarC) {
            AlumnoDAO alumnoDAO =  new AlumnoDAO();
            Alumno a1= new Alumno (tfNumControl3.getText(),tfNombre3.getText(),tfAp3.getText(),tfAm3.getText(),
                    (byte) Integer.parseInt(String.valueOf((comboEdad3.getSelectedIndex())+1)), Byte.parseByte(spinner2.getValue().toString()),
                    comboCarrera3.getItemAt(comboCarrera3.getSelectedIndex()));
            System.out.println(alumnoDAO.agregarAlumno(a1));
        }
    }
}
