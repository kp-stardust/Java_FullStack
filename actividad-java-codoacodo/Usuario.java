
/**
 *
 * @author Karina Villegas
 */
public class Usuario {
    
//Atributos    
    
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editorPreferido;
    private String sistemaOperativo;
    
 //Constructor   
public Usuario(String nombre, String apellido, int edad, String hobbie, String editorPreferido, String sistemaOperativo) {
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.hobbie = hobbie;
    this.editorPreferido = editorPreferido;
    this.sistemaOperativo = sistemaOperativo;
      
}
//Constructor por defecto    
public Usuario () {
    nombre = "";
    apellido = "";
    edad = 18;
    hobbie = "";
    editorPreferido = "";
    sistemaOperativo = "Windows";
}

//Setters y Getters (en caso que se quieran obtener o cargar los datos individualmente)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditorPreferido() {
        return editorPreferido;
    }

    public void setEditorPreferido(String editorPreferido) {
        this.editorPreferido = editorPreferido;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre= " + nombre + ", Apellido= " + apellido + ", Edad= " + edad + ", Hobbie= " + hobbie + ", Editor Preferido= " + editorPreferido + ", Sistema Operativo= " + sistemaOperativo + '}';
    }

}

