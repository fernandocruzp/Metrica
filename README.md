# Metrica
Cruz Pineda Fernando
423076479

El programa cuenta con 6 clases:
Punto2D: Esta clase es para crear el objeto Punto2D tiene como atributos x , y que representan las coordenadas del punto, tiene un par de constructores, el primero es un constructor por default que genera un punto en (0,0), el otro constructor que recibe como parametros las coordenadas (x,y), igualmente cuenta con sus respectivos getters y setters y el método toString().

OperacionesConPuntos2D: clase con los métodos para calcular la norma, la metricaEuclidiana, metricaTaxista, productoPunto y el area.

Vista : Esta clase extiende a la clase JFrame de java.swing e implementa a ActionListener, es la interfaz gráfica del programa, a partir de ella el usuario puede introducir las coordenadas de nuestros puntos.

Ventana: Clase que extiende a la clase JFrame de java.swing e implementa a ActionListener,crea una instancia del objeto plano que graficará los puntos y las métricas euclidiana y manhattan.

plano : La clase plano extiende de JPanel e implementa el métodos de java.awt.Graohics para pintar el plano cartesiano, igualmente cuenta con los métodos paintMan y paintEucli para graficar las respectivas métricas.

UsoPunto: Clase con el método main, crea la instancia del objeto vista y permite que el usuario vea la interfaz gráfica.
