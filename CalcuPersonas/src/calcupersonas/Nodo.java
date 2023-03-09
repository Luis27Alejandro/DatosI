package calcupersonas;

/**
 * Esta es una clase que se el molde de los objetos Nodo
 * @author Luis
 */
public class Nodo {
    //Atributos del Nodo
    private Nodo next;
    private Personas info;

    /**
     * Este método se encarga de crear los objetos Nodo con la información
     * de los objetos persona
     * @param personas
     */
    public Nodo(Personas personas){
        this.info = personas;
        this.next = null;
    }

    /**
     * Este método se encarga de modificar lo que el nodo está apuntando
     * @param nodo
     */
    public void setNext(Nodo nodo){
        this.next = nodo;
    }

    /**
     * Este método brinda la dirección del Nodo siguinte
     * @return siguiente Nodo
     */
    public Nodo getNext(){
        return this.next;
    }

    /**
     * Este método brinda la información del Nodo
     * @return información del Nodo
     */
    public Personas getInfo(){
        return this.info;
    }


}
