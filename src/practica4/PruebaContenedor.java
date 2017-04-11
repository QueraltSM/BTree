package practica4;

import java.io.IOException;


public class PruebaContenedor {
    public static void main(String[] args) throws IOException, Exception{

        ContenedorDeEnteros a = new ContenedorDeEnteros();
        int[] b;

        System.out.println("El contenedor a tiene " + a.cardinal() + " elementos.");
        for (int i = 0; i < 10; i++) {
            a.insertar(i);
            a.buscar(i);
        }

        b = a.elementos();

        for (int i = 0; i < a.cardinal(); i++) System.out.println(b[i]);
        a.vaciar();
        for (int i = 0; i < 100; i++) {
            a.insertar(i);
            a.extraer(i);
        }


        boolean control;
        //-----------------------------------------------------------------------------------------------------
        //Probando: Constructor
        ContenedorDeEnteros lista = new ContenedorDeEnteros();
        ContenedorDeEnteros listavacia = new ContenedorDeEnteros();
        ContenedorDeEnteros listaUnElemento = new ContenedorDeEnteros();
        listaUnElemento.insertar(1);

        //-----------------------------------------------------------------------------------------------------
        // Probando: insertar()

        // Insertando elementos en lista vacía
        for (int i = 0; i < 10; i++) {
            lista.insertar(i);
        }

        if (lista.cardinal() != 10) {
            System.out.println("Fallo en el metodo insertar()");
        }

        // Insertando elementos repetidos
        control = lista.insertar(1);
        if (control) {
            System.out.println("Fallo en el metodo insertar(), elemento repetido ");
        }

        ///-----------------------------------------------------------------------------------------------------
        // Probando: extraer()
        // Eliminar un elemento de una lista

        control = lista.extraer(1);
        if (control == false) {
            System.out.println("Fallo en el metodo Extraer() ");

        }


        //Eliminar elemento no contenido
        control = lista.extraer(11);
        if (control == true) {
            System.out.println("Fallo en el metodo Extraer() ");


        }
        //Eliminar un elemento de una lista vacia
        control = listavacia.extraer(1);
        if (control == true) {
            System.out.println("Fallo en el metodo Extraer() ");

        }

        //Eliminar primer elemento
        int[] vectorControl = {0, 2, 3, 4, 5, 6, 7, 8};
        lista.extraer(9);
        int[] v = lista.elementos();
        control = java.util.Arrays.equals(vectorControl, v);

        if (control == false) {
            System.out.println("Fallo en el metodo Extraer(), al eliminar el primer elemento ");
        }

        //Eliminar último elemento
        int[] vectorControl2 = {2, 3, 4, 5, 6, 7, 8};
        lista.extraer(0);
        v = lista.elementos();
        control = java.util.Arrays.equals(vectorControl2, v);

        if (control == false) {
            System.out.println("Fallo en el metodo Extraer(), al eliminar el último elemento ");

        }
    }

}
