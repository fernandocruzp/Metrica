/**
Proyecto Puntos2D
Clase Vista, es la interfaz gráfica principal del programa
Con este programa puedes hacer diferentes operaciones con un par de puntos en el plano de R^2, puedes insertar valores númericos en un rangos de 1.4x10^-45 a 3.4028235x10^38 para las coordenadas (x,y), sin embargo para poder graficar los puntos el rango es de -30 a 30 para ambas coordenadas
1/10/22
@author CruzPinedaFernando
 **/

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame implements ActionListener{
    private JTextField punto1X, punto2X, punto1Y,punto2Y;
    private JButton norma,distE,distT,prodP,area,graf;
    private JLabel titulo,texto,nombre,p1x,p1y,p2x,p2y,mensaje; 
    private JFrame venta;

    public Vista(){
        configurarVentana();
        iniciarComponentes();
    }

    private void configurarVentana(){
        setTitle(" Operaciones con puntos ");
        setSize(800,500);
	Color color1 = new Color(61,186,244);
	Color color2 = new Color(14,231,246);
        getContentPane().setBackground(color2);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    private void iniciarComponentes(){
        titulo = new JLabel("Operaciones con puntos");
        titulo.setBounds(310,10,450,50);
        add(titulo);

	mensaje = new JLabel("Introduce un par de puntos p1, p2, con sus coordenadas (x,y) en un intervalo de (-30,30)");
        mensaje.setBounds(30,30,800,70);
        add(mensaje);
	
        texto = new JLabel("");
        texto.setBounds(30,270,800,20);
        add(texto);
        nombre = new JLabel("CRUZ PINEDA FERNANDO");
        nombre.setBounds(480,420,200,20);
        add(nombre);

	p1x = new JLabel("P1 x");
        p1x.setBounds(310,100,30,20);
        add(p1x);
        p1y = new JLabel("P1 y");
        p1y.setBounds(400,100,30,20);
        add(p1y);
	p2x = new JLabel("P2 x");
        p2x.setBounds(310,140,30,20);
        add(p2x);
        p2y = new JLabel("P2 y");
        p2y.setBounds(400,140,30,20);
        add(p2y);
	
        punto1X= new JTextField();
        punto1X.setBounds(340,100,50,20);
        punto1X.setEnabled(true);
        add(punto1X);

	punto1Y= new JTextField();
        punto1Y.setBounds(430,100,50,20);
        punto1Y.setEnabled(true);
	add(punto1Y);
	
        punto2X = new JTextField();
        punto2X.setBounds(340,140,50,20);
        punto2X.setEnabled(true);
        add(punto2X);

	punto2Y = new JTextField();
        punto2Y.setBounds(430,140,50,20);
        punto2Y.setEnabled(true);
	add(punto2Y);
	
        norma = new JButton("Norma");
        norma.setBounds(10,200,120,20);
        add(norma);
        norma.addActionListener(this);
        
        distE =new JButton("Distancia euclidiana");
        distE.setBounds(160,200,180,20);
        add(distE);
        distE.addActionListener(this);
       
	distT = new JButton("Distancia Manhattan");
        distT.setBounds(370,200,200,20);
        add(distT);
	distT.addActionListener(this);
        
        prodP =new JButton("Producto Punto");
        prodP.setBounds(610,200,180,20);
        add(prodP);
        prodP.addActionListener(this);

	area =new JButton("Área");
        area.setBounds(340,250,120,20);
        add(area);
	area.addActionListener(this);

	graf =new JButton("Ver gráfica");
        graf.setBounds(340,310,120,20);
        add(graf);
	graf.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
	Punto2D p1,p2;
	if(punto1X.getText().toString().equals("") || punto1Y.getText().toString().equals("") || punto2X.getText().toString().equals("") || punto2Y.getText().toString().equals("")){
	    p1 = new Punto2D();
	    p2 = new Punto2D(5,5);
	    punto1X.setText("0");
	    punto2X.setText("5");
	    punto1Y.setText("0");
	    punto2Y.setText("5");
	}
	else{
	    float x1= Float.parseFloat(punto1X.getText().toString());
	    float y1 = Float.parseFloat(punto1Y.getText().toString());
	    float x2 = Float.parseFloat(punto2X.getText().toString());
	    float y2 = Float.parseFloat(punto2Y.getText().toString());
	    p1 = new Punto2D(x1,y1);
	    p2= new Punto2D(x2,y2);
	}	
	if (accion.equals("Norma")){
	    String texto1= "La norma de : "+ p1 +" es: "+ OperacionesConPuntos2D.norma(p1) + " y  la norma de " + p2+ " es " +OperacionesConPuntos2D.norma(p2);
	    texto.setText(texto1);
	}
	else if(accion.equals("Distancia euclidiana")){
	    String texto1= "La distancia euclidiana es: " + OperacionesConPuntos2D.metricaEuclidiana(p1,p2);
	    texto.setText(texto1);
	}
	else if(accion.equals("Distancia Manhattan")){
	    String texto1= "La distancia de Manhattan es: " + OperacionesConPuntos2D.metricaTaxista(p1,p2);
	    texto.setText(texto1);
	}
	else if(accion.equals("Producto Punto")){
	    String texto1= "El producto punto es: " + OperacionesConPuntos2D.dotProduct(p1,p2);
	    texto.setText(texto1);
	}
	else if(accion.equals("Área")){
	    String texto1= "El area es: " + OperacionesConPuntos2D.area(p1,p2);
	    texto.setText(texto1);
	}
	else{
	    dispose();
	    Ventana laotra = new Ventana(p1,p2);
	    laotra.setVisible(true);
	}
    }
    
}
