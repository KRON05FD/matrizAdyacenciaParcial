
import java.util.Arrays;

// Clase Matriz de adyacencia
class MatrizDeAdyacencia {

    private int[][] matriz; //Se declara la matriz para almacenar las aristas

    public MatrizDeAdyacencia(int numNodos) {
        matriz = new int[numNodos][numNodos]; //Este es el constructor que inicializara con los nodos definidos
    }

    //Aqui se agregan las aristas en entre cada nodo
    public void agregarArista(int nodoOrigen, int nodoDestino) {
        matriz[nodoOrigen][nodoDestino] = 1;
    }

    //Muestras los nodos en la consola
    public void mostrarNodos() {
        System.out.println("Nodos:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Muestra las aristas en la consola
    public void mostrarAristas() {
        System.out.println("Aristas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    System.out.println("( " + i + ", " + j + ")");
                }
            }
        }
    }
}

// Clase principal
public class Grafo {

    public static void main(String[] args) {
        MatrizDeAdyacencia grafo = new MatrizDeAdyacencia(5);

        // Se definen las aristas
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 4);

        // Se llama el metodo que mostrara los nodos
        grafo.mostrarNodos();

        // Se llama el metodo que mostrara las aristas
        grafo.mostrarAristas();
    }
}
