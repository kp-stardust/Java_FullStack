
import java.util.Scanner;

/**
 *
 * @author Karina Villegas
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner tecladoNum = new Scanner(System.in); //objeto Scanner para enteros
        Scanner tecladoCad = new Scanner(System.in); //objeto Scanner para cadenas
        String dato;
        int edad;
        
        //crea objeto para guardar datos de usuario (utiliza el constructor por defecto)
        Usuario usuario1 = new Usuario();
        
        //carga datos
        System.out.println("Ingresar nombre");
        dato = tecladoCad.nextLine();
        usuario1.setNombre(dato);
        System.out.println("Ingresar Apellido");
        dato = tecladoCad.nextLine();
        usuario1.setApellido(dato);
        System.out.println("Ingresar Edad");
        edad = tecladoNum.nextInt();
        usuario1.setEdad(edad);
        System.out.println("Ingresar hobbie");
        dato = tecladoCad.nextLine();
        usuario1.setHobbie(dato);
        System.out.println("Ingresar editor preferido");
        dato = tecladoCad.nextLine();
        usuario1.setEditorPreferido(dato);
        System.out.println("Ingresar sistema operativo");
        dato = tecladoCad.nextLine();
        usuario1.setSistemaOperativo(dato);
        
        
        //imprime todos los valores ingresados por el usuario
        System.out.println(usuario1.toString());
        
        //carga datos individualmente
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Maria");
        usuario2.setApellido("Fernandez");
        usuario2.setSistemaOperativo("Mac");
        
        //otra forma de obtener los datos ingresados (todos o algunos)
        System.out.println("Nombre: "+ usuario2.getNombre() + ". Apellido: " + usuario2.getApellido() + ". Edad:" + usuario2.getEdad()
                    + ". Sistema operativo: " + usuario2.getSistemaOperativo());
        
    }
    
}
