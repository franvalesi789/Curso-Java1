import javax.swing.*;

public class FormularioUno extends JFrame{

  public FormularioUno(){
    setLayout(null);
  }

  public static void main(String args[]){
    FormularioUno formulario1 = new FormularioUno();
    formulario1.setBounds(0,0,400,550);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
    formulario1.setResizable(false);
  }
}