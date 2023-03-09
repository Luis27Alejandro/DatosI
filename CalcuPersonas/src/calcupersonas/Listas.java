package calcupersonas;

/**
 * Esta clase es el molde de los objetos Listas
 * @author Luis
 */
public class Listas {
    //Atributos de las listas
    private Nodo head;
    private int size;

    /**
     * Crea una clase de largo 0
    */
    public Listas(){
        head = null;
        size = 0;
    }

    /**
     * Esta es un método que nos permite buscar a una persona en la lista
     * @param name
     * @return la persona que se estaba buscando
     */
    public Personas buscar(String name){
        //Este es el Nodo auxiliar que ayuda a recorrer la lista
        Nodo aux = this.head;

        while(aux.getInfo().getName() != name){
            aux = aux.getNext();
        }
        return aux.getInfo();
    }

    /**
     * Este es un método que permite agregar a las personas a la lista
     * @param nodo
     */
    public void agregar(Nodo nodo){
        //Nodo auxiliar que ayuda a colocar el nuevo nodo en la última posición
        Nodo aux;

        if(this.head == null){
            this.head = nodo;
        }
        else{
            aux = this.head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nodo);
        }
        this.size++;
    }

    /**
     * Este método elimina a las persona selecionada de la lista
     * @param nodo
     */
    public void eliminar(Nodo nodo){
        Nodo aux;

        if(this.head == null){

        }

    }

    /**
     * Este método se encarga de dar el largo de la lista
     * @return el largo de la lista
     */
    public int getSize(){
        return this.size;
    }


}
