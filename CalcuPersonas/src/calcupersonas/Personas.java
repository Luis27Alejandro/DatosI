package calcupersonas;

/**
 * Esta clase es el molde de los objetos Personas
 * @author Luis
 */
public class Personas {
    //Atributos del objeto Personas

    private String name;
    private int edad;
    private String provincia;

    /**
     * Este método se encarga de crear los objetos con los parametros que le damos
     * @param name
     * @param edad
     * @param provincia
     */
    public Personas(String name, int edad, String provincia){
        this.name = name;
        this.edad = edad;
        this.provincia = provincia;
    }

    /**
     * Este método se encarga de asociar el nombre a una persona
     * @param name
     */
    public void SetName(String name){
        this.name = name;
    }

    /**
     * Este método se encarga de asociar la edad a una persona
     * @param edad
     */
    public void setEdad(int edad ){
        this.edad = edad;
    }

    /**
     * Este método se encarga de asociar la provincia a una persona
     * @param provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Este método nos permite obtener el nombre asocioado a una persona
     * @return nombre de la persona
     */
    public String getName(){
        return this.name;
    }

    /**
     * Este método nos permite obtener la edad asocioada a una persona
     * @return edad de la persona
     */
    public int getEdad(){
        return this.edad;
    }

    /**
     * Este método nos permite obtener la provincia asocioada a una persona
     * @return provincia de la persona
     */
    public String getProvincia(){
        return this.provincia;
    }

}
