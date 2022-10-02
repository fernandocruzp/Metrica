/**
Proyecto Puntos2D
Clase Punto2D, en esta clase se modela al objeto punto2d, código dado por el profesor Roberto Méndez Méndez
1/10/22
@author Roberto Méndez Méndez
 **/
package Metrica;

public class Punto2D {
    private double x;
    private double y;

    public Punto2D(){
        x = 0.0;
        y = 0.0;
    }

    public Punto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "( " + x + "," + y + " )";
    }
}
