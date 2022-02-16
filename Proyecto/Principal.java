import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miDesarrolladores, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombreAdministrador = "";

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255,255,255));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(255,255,255));
    mb.add(menuAcercaDe);

    menuColorFondo = new JMenu("Color de fondo");
    menuColorFondo.setBackground(new Color(255,0,0));
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(255,0,0));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono", 1, 14));
    miRojo.setForeground(new Color(255,0,0));
    menuColorFondo.add(miRojo);
    miRojo.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1, 14));
    miNegro.setForeground(new Color(255,0,0));
    menuColorFondo.add(miNegro);
    miNegro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1, 14));
    miMorado.setForeground(new Color(255,0,0));
    menuColorFondo.add(miMorado);
    miMorado.addActionListener(this);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(255,0,0));
    menuOpciones.add(miNuevo);
    miNuevo.addActionListener(this);

    miDesarrolladores = new JMenuItem("Desarrolladores");
    miDesarrolladores.setFont(new Font("Andale Mono", 1, 14));
    miDesarrolladores.setForeground(new Color(255,0,0));
    menuAcercaDe.add(miDesarrolladores);
    miDesarrolladores.addActionListener(this);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(255,0,0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,5,250,100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenide " + nombreAdministrador + "!");
    labelBienvenido.setBounds(280,30,300,50);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelBienvenido.setForeground(new Color(255,255,255));
    add(labelBienvenido);

    labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
    labelTitle.setBounds(45,140,900,25);
    labelTitle.setFont(new Font("Andale Mono", 0, 24));
    labelTitle.setForeground(new Color(255,255,255));
    add(labelTitle);


    labelNombre = new JLabel("Nombre completo");
    labelNombre.setBounds(25,188,180,25);
    labelNombre.setFont(new Font("Andale Mono", 1, 12));
    labelNombre.setForeground(new Color(255,255,255));
    add(labelNombre);


    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25,213,150,25);
    txtNombreTrabajador.setBackground(new Color(224,224,224));
    txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtNombreTrabajador.setForeground(new Color(255,0,0));
    add(txtNombreTrabajador);

    labelAPaterno = new JLabel("Apellido");
    labelAPaterno.setBounds(25,248,180,25);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAPaterno.setForeground(new Color(255,255,255));
    add(labelAPaterno);


    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25,273,150,25);
    txtAPaternoTrabajador.setBackground(new Color(224,224,224));
    txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtAPaternoTrabajador.setForeground(new Color(255,0,0));
    add(txtAPaternoTrabajador);

    labelDepartamento = new JLabel("Selecciona el departamento");
    labelDepartamento.setBounds(220,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255,255,255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new Color(224,224,224));
    comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atencion al Cliente");
    comboDepartamento.addItem("Departamento de Logistica");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona la Antiguedad");
    labelAntiguedad.setBounds(220,248,180,25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    labelAntiguedad.setForeground(new Color(255,255,255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,273,220,25);
    comboAntiguedad.setBackground(new Color(224,224,224));
    comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new Color(255,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 anio de servicio");
    comboAntiguedad.addItem("2 a 6 anios de servicio");
    comboAntiguedad.addItem("7 anios o mas de servicio");

    labelResultado = new JLabel("Resultado del calculo");
    labelResultado.setBounds(220,307,180,25);
    labelResultado.setFont(new Font("Andale Mono", 1, 12));
    labelResultado.setForeground(new Color(255,255,255));
    add(labelResultado);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224,224,224));
    textarea1.setFont(new Font("Andale Mono", 1, 11));
    textarea1.setForeground(new Color(255,0,0));
    textarea1.setText("\n    Aqui aparece el resultado del calculo de las vacaciones.");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,333,385,90);
    add(scrollpane1);

    labelFooter = new JLabel("©2022 The Coca-Cola Company | Patente Pendiente diria Homero");
    labelFooter.setBounds(135,445,500,30);
    labelFooter.setFont(new Font("Andale Mono", 1, 12));
    labelFooter.setForeground(new Color(255,255,255));
    add(labelFooter);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == miCalculo){
      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtAPaternoTrabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();
      if (nombreTrabajador.equals("") || AP.equals("") || Departamento.equals("") || Antiguedad.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
      } else {
        if (Departamento.equals("Atencion al Cliente")) {
          if(Antiguedad.equals("1 anio de servicio")){
            textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                              "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                              "\n   recibe 6 dias de vacaciones.");
          }
          if(Antiguedad.equals("2 a 6 anios de servicio")){
            textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                              "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                              "\n   recibe 14 dias de vacaciones.");
          }
          if(Antiguedad.equals("7 anios o mas de servicio")){
            textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                              "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                              "\n   recibe 20 dias de vacaciones.");
          }
        }
        if(Departamento.equals("Departamento de Logistica")){

          if(Antiguedad.equals("1 anio de servicio")){
            textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                              "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                              "\n   recibe 7 dias de vacaciones.");
          }
          if(Antiguedad.equals("2 a 6 anios de servicio")){
            textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                              "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                              "\n   recibe 15 dias de vacaciones.");
          }
          if(Antiguedad.equals("7 anios o mas de servicio")){
            textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                              "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                              "\n   recibe 22 dias de vacaciones.");
          }
        }
          if(Departamento.equals("Departamento de Gerencia")){

            if(Antiguedad.equals("1 anio de servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                                "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                "\n   recibe 10 dias de vacaciones.");
            }
            if(Antiguedad.equals("2 a 6 anios de servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                                "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                "\n   recibe 20 dias de vacaciones.");
            }
            if(Antiguedad.equals("7 anios o mas de servicio")){
              textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + 
                                "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                "\n   recibe 30 dias de vacaciones.");
            }
          }
      }
    }
    if(e.getSource() == miRojo){
      getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == miNegro){
      getContentPane().setBackground(new Color(0,0,0));
    }
    if(e.getSource() == miMorado){
      getContentPane().setBackground(new Color(51,0,51));
    }
    if(e.getSource() == miNuevo){
      txtNombreTrabajador.setText("");
      txtAPaternoTrabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textarea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
    }
    if(e.getSource() == miSalir){
      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(0,0,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if(e.getSource() == miDesarrolladores){
      JOptionPane.showMessageDialog(null, "Desarrollado por Franco Valesi, finalizando el curso de Java Principiante.\n" +
                                          " Agradecimiento especial al amor en mi vida Michelle, por todo su apoyo en este proyecto");
    }
  }

  public static void main(String args[]){
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0,0,640,535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
  }
}