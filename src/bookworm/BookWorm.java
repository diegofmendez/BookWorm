package bookworm;

import java.util.ArrayList;
import java.util.Scanner;

public class BookWorm {
    
    private static ArrayList<Libro> libros = new ArrayList();
    private static ArrayList<Usuario> usuarios = new ArrayList();
    
    
    public static void main(String[] args) {
        //libro y usuario preexistente
        libros.add(new Libro("Terraria 2", "Historia"));
        Scanner scanner = new Scanner(System.in);
        
        boolean check = true;
        while(check==true){
            System.out.println("");
            System.out.println("----------------------------------------------------");
            System.out.println("Bienvenido al software de administrador de Bookworm");
            System.out.println("Para registrar un usuario nuevo ingrese 1");     
            System.out.println("Para ver los usuarios registrados ingrese 2");
            System.out.println("Para ingresar un libro nuevo ingrese 3");
            System.out.println("Para ver los libros ingrese 4");
            System.out.println("Para salir ingrese otro numero distinto");
            System.out.println(" ");
            switch(tryInteger(scanner)){
            case 1:
                nuevoUsuario(scanner);
                break;
            case 2:
                verUsuarios();
                break;
            case 3:
                nuevoLibro(scanner);
                break;
            case 4:
                verLibros();
                break;
            default:
                System.out.println(" ");
                System.out.println("Salir");
                check = false;
                break;
            }
        }
        
        
        
        
    }
    
    
    
    public static int tryInteger(Scanner scanner){
        while (true){
            try{
                int numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } catch (Exception e){
                System.out.println("Entrada no válida, ingrese un número entero");
                scanner.nextLine();  // Limpiar el buffer
                return tryInteger(scanner);  // <<--- DEVUELVES aquí
            }
        }    
    }    
    
    
    public static void nuevoUsuario(Scanner scanner){
        String nombre, cedula, genero;
        System.out.println(" ");
        System.out.println("Selecciono ingreso de nuevo usuario");
        System.out.println("Ingrese el nombre:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el número de cedula");
        cedula = Integer.toString(tryInteger(scanner));
        System.out.println("Para elegir el genero favorito del usuario ingrese el número correspondiente(solo puede elegir uno)");
        System.out.println("1: Ciencia");
        System.out.println("2: Literatura");
        System.out.println("3: Ingenieria");
        System.out.println("4: Matematicas");
        System.out.println("otro número: Historia");
        System.out.println(" ");
        switch(tryInteger(scanner)){
            case 1:
                genero="Ciencia";
                break;
            case 2:
                genero="Literatura";
                break;
            case 3:
                genero="Ingenieria";
                break;
            case 4:
                genero="matematicas";
                break;
            default:
                genero="historia";
                break;
        }
        usuarios.add(new Usuario(nombre, cedula, genero));
    }
    public static void verUsuarios(){
        System.out.println("Usuarios registrados");
        System.out.println(" ");
        for(int i=0; i<usuarios.size();i++){
            System.out.println((i+1)+". Nombre: "+usuarios.get(i).getNombre());
            System.out.println("  No. de cedula: "+usuarios.get(i).getCedula());
            System.out.println("  Genero: "+usuarios.get(i).getGenero());         
        }     
    }
    
    
    public static void nuevoLibro(Scanner scanner){
        String nombre, genero;
        System.out.println(" ");
        System.out.println("Selecciono ingreso de nuevo libro");
        System.out.println("Ingrese el nombre:");
        nombre = scanner.nextLine();
        System.out.println("Para elegir el genero ingrese el número correspondiente(solo puede elegir uno)");
        System.out.println("1: Ciencia");
        System.out.println("2: Literatura");
        System.out.println("3: Ingenieria");
        System.out.println("4: Matematicas");
        System.out.println("otro número: Historia");
        System.out.println(" ");
        switch(tryInteger(scanner)){
            case 1:
                genero="Ciencia";
                break;
            case 2:
                genero="Literatura";
                break;
            case 3:
                genero="Ingenieria";
                break;
            case 4:
                genero="matematicas";
                break;
            default:
                genero="historia";
                break;
        }
        libros.add(new Libro(nombre, genero));
    }
    public static void verLibros(){
        System.out.println("Libros disponibles: ");
        System.out.println(" ");
        for(int i=0; i<libros.size();i++){
            System.out.println((i+1)+". Nombre: "+libros.get(i).getNombre());
            System.out.println("  Genero: "+libros.get(i).getGenero());  
        }      
    }
    
    
    
    
    
    

}
