/**
Proyecto Puntos2D
Clase plano, es una interfáz gráfica que hereda de la clase JPanel, en esta clase se genera el plano donde se gráfica, igualmente cuenta con los métodos para graficar la metrica euclidiana y la métrica Manhattan
1/10/22
@authorCruzPinedaFernando
 **/
package Metrica;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class plano extends JPanel{
    Punto2D p1,p2;
    public plano(Punto2D p, Punto2D pp) {
        init();
	p1 = p;
	p2 = pp;
    }
    public void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    @Override
     public void paintComponent( Graphics g ) {
            super.paintComponent(g);
            g.setColor(Color.red);
            g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
	    g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
	    double coordenadax1=coord_x((double)p1.getX());
	    double coordenaday1=coord_y((double)p1.getY());
	    double coordenadax2=coord_x((double)p2.getX());
	    double coordenaday2=coord_y((double)p2.getY());
	    System.out.println(coordenadax1 + " "+ coordenaday1);
	    System.out.println(coordenadax2 + " " + coordenaday2);
	    Graphics2D g2d = (Graphics2D)g;
	    g2d.setColor(Color.black);
	    g2d.drawOval((int)coordenadax1,(int)coordenaday1,6,6);
	    g2d.drawOval((int)coordenadax2,(int)coordenaday2,6,6);
	    
     }
     public void paintEucli(Graphics g){
     	 g.setColor(Color.green);
	 double coordenadax1=coord_x((double)p1.getX());
	 double coordenaday1=coord_y((double)p1.getY());
	 double coordenadax2=coord_x((double)p2.getX());
	 double coordenaday2=coord_y((double)p2.getY());
	 System.out.println(coordenadax1 + " "+ coordenaday1);
	 System.out.println(coordenadax2 + " " + coordenaday2);
	 g.drawLine((int)coordenadax1,(int) coordenaday1,(int) coordenadax2,(int)coordenaday2);
     }

    public void paintMan(Graphics g){
	g.setColor(Color.orange);
	double coordenadax1=coord_x((double)p1.getX());
	double coordenaday1=coord_y((double)p1.getY());
	double coordenadax2=coord_x((double)p2.getX());
	double coordenaday2=coord_y((double)p2.getY());
	System.out.println(coordenadax1 + " "+ coordenaday1);
	System.out.println(coordenadax2 + " " + coordenaday2);
	g.drawLine((int)coordenadax1,(int) coordenaday1,(int) coordenadax2,(int)coordenaday1);
	g.setColor(Color.blue);
	g.drawLine((int)coordenadax2,(int) coordenaday1,(int) coordenadax2,(int)coordenaday2);
    }

    private double coord_x(double x) {
	double escala = (this.getWidth()/2*x)/30;
	double real_x = escala+this.getWidth()/2;
	return real_x;
    }

    private double coord_y(double y){
	double escala = (this.getHeight()/2*y)/30;
	double real_y = -escala+this.getHeight()/2;
	return (real_y);
     }
}
