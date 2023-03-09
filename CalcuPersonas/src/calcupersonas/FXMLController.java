/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calcupersonas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class es la clase que se encarga de modificar los datos ingresados
 *
 * @author Luis
 */
public class FXMLController implements Initializable {

    @FXML
    // Botón que agrega a las personas a la lista
    private Button Agregar;

    @FXML
    // Botón que suma las edades de las personas
    private Button suma;

    @FXML
    // Botón que resta las edades de las personas
    private Button resta;

    @FXML
    // Botón que multiplica las edades de las personas
    private Button mult;

    @FXML
    // Botón que divide las edades de las personas
    private Button divi;

    @FXML
    // DropDownLis de las provincias
    private ChoiceBox<String> provincia;

    @FXML
    // DropDownLis para escoger la persona 1
    private ChoiceBox<String> persona1;

    @FXML
    // DropDownLis para escoger la persona 2
    private ChoiceBox<String> persona2;

    @FXML
    // Espacio para colocar el Nombre de la persona
    private TextField nombre;

    @FXML
    // Espacio para colocar la Edad de la persona
    private TextField edad;

    @FXML
    // Espacio en donde se muestran los Resultados y los Errores
    private Label resultado;

    // Se crea la lista a donde se van a añadir las personas
    Listas lista = new Listas();

    /**
     * Este método se encarga de inicializar el view (interface)  con el que se va a comunicar
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        provincia.getItems().setAll("San Jose","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limón");
    }


    /**
     * Este método se encarga de que al tocar el botón de agregar, la información que está
     * en los campos de información de la persona se asocie a una persona y esta a un nodo
     * para después añadirla a la lista
     * @param event
     */
    @FXML
    private void AgregarPersona(ActionEvent event) {

        // Valida que solo puedan agregarse 4 personas
        if(lista.getSize() <= 3){

            // Convierte la edad a un int
            try{

                // Valida que se seleccione una provincia
                if(provincia.getValue() != null){

                    // Valida que se escribiera un nombre
                    if(nombre.getText().length() != 0){

                        // Valida que la edad no sea menor o igual a 0
                        if(Integer.parseInt(edad.getText()) > 0){

                            // Crea el objeto personas
                            Personas personas = new Personas(nombre.getText(),Integer.parseInt(edad.getText()),provincia.getValue());

                            // Se agrega la persona a la lista ya creada
                            lista.agregar(new Nodo(personas));

                            // Se pone el nombre de la persona en el DropDownList 1
                            persona1.getItems().add(personas.getName());

                            // Se pone el nombre de la persona en el DropDownList 2
                            persona2.getItems().add(personas.getName());

                        }
                        else{

                            resultado.setText("Por favor ingrese una edad válida");
                        }
                    }
                    else{

                        resultado.setText("Falta poner el nombre");
                    }
                }
                else{

                    resultado.setText("Falta elegir una provincia");
                }
            }
            catch(NumberFormatException a){

                resultado.setText("La edad tiene que ser un número");
            }
        }
        else{

            resultado.setText("Solo se pueden agragar 4 personas");
        }
        // Limpia los textos de edad y nombre después de añadir a la persona
        nombre.setText("");
        edad.setText("");
    }


    @FXML
    private void EliminarPersona(ActionEvent event) {

    }


    /**
     * Este método se encarga de sumar las edades de las dos personas
     * @param event
     */
    @FXML
    private void Suma(ActionEvent event) {

        if(persona1 != null) {

            int a = lista.buscar(persona1.getValue()).getEdad();
            int b = lista.buscar(persona2.getValue()).getEdad();
            int r = (a + b);
            String respuesta = Integer.toString(r);
            resultado.setText(respuesta);
        }
        else{
            resultado.setText("Debe seleccionar otra persona");
        }

    }

    /**
     * Este método se encarga de restar las edades de las dos personas
     * @param event
     */
    @FXML
    private void Resta(ActionEvent event) {

        if(persona1 != null) {
            int a = lista.buscar(persona1.getValue()).getEdad();
            int b = lista.buscar(persona2.getValue()).getEdad();
            int r = (a - b);
            String respuesta = Integer.toString(r);
            resultado.setText(respuesta);
        }
        else{
            resultado.setText("Debe seleccionar otra persona");
        }
    }

    /**
     * Este método se encarga de multiplicar las edades de las dos personas
     * @param event
     */
    @FXML
    private void Multipicacion(ActionEvent event) {
        if(persona1 != null) {
            int a = lista.buscar(persona1.getValue()).getEdad();
            int b = lista.buscar(persona2.getValue()).getEdad();
            int r = (a * b);
            String respuesta = Integer.toString(r);
            resultado.setText(respuesta);
        }
        else{
            resultado.setText("Debe seleccionar otra persona");
        }
    }

    /**
     * Este método se encarga de dividir las edades de las dos personas
     * @param event
     */
    @FXML
    private void Division(ActionEvent event) {
        if(persona1 != null) {
            float a = lista.buscar(persona1.getValue()).getEdad();
            float b = lista.buscar(persona2.getValue()).getEdad();
            double r = (a / b);
            String respuesta = Double.toString(r);
            resultado.setText(respuesta);

        }
        else{
            resultado.setText("Debe seleccionar otra persona");
        }
    }
    
}
