/**
Proyecto Puntos2D
Clase Ventana, es la interfaz gráfica que contiene al plano donde se gráfican las métricas y los puntos dados por el usuario, hereda de ña clase JFrame e implemeta el evento ActionListener.
1/10/22
@authorCruzPinedaFernando
 **/
package Metrica;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener{
    public static plano plano;
    private JButton eucli,man,regresar;
    private Punto2D p1,p2;
    public Ventana(Punto2D p, Punto2D pp){
	p1 = p;
	p2 = pp;
	configurarVentana();
	iniciarComponentes();
    }

    public void configurarVentana(){
	setTitle(" Operaciones con puntos ");
        setBounds(300, 300, 510, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	System.out.println(p1.getX());
	plano = new plano(p1,p2);
	add(plano,BorderLayout.CENTER);
    }

    public void iniciarComponentes(){
	eucli = new JButton("Euclidiana");
	eucli.addActionListener(this);
	add(eucli,BorderLayout.SOUTH);
	man = new JButton("Manhattan");
	man.addActionListener(this);
	//	man.setBounds(400,780,400,20);
	add(man,BorderLayout.NORTH);
	regresar = new JButton("Regresar");
	regresar.addActionListener(this);
	add(regresar,BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	 String accion = e.getActionCommand();
	 System.out.println(accion);
	 if(accion.equals("Euclidiana")){
	     System.out.println("sdafagdfd");
	     plano.paintEucli(plano.getGraphics());
	 }
	 else if(accion.equals("Manhattan")){
	     plano.paintMan(plano.getGraphics());
	 }
	 else{
	     dispose();
	     Vista vista= new Vista();
	     vista.setVisible(true);
	 }
    }


}
