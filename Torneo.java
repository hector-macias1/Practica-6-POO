import java.util.ArrayList;
import java.util.Scanner;

public class Torneo {
    String nombre;
    String region;
    int equipos;
    int jugados;
    int pendientes;

    //Variables para trabajar con "Equipo"
    String nombreE;
    String divisionE;
    String entrenadorE;
    int torneosE;
    int ganadosE;
    int perdidosE;

    //Instancias
    Equipo equipo = new Equipo();
    Scanner sc = new Scanner(System.in);

    //Arraylist de Equipos
    ArrayList<Equipo> equipos_participantes = new ArrayList<Equipo>();


    public Torneo(String nombre, String region, int equipos, int jugados, int pendientes) {
        this.nombre = nombre;
        this.region = region;
        this.equipos = equipos;
        this.jugados = jugados;
        this.pendientes = pendientes;
    }

    public Torneo() {
    }

    public void LlenarTorneo() {
        System.out.println("\nIngrese El nombre del Torneo: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la region del torneo: ");
        region = sc.nextLine();
        
        equipos = equipos_participantes.size();
        jugados = 0;
        pendientes = 0;
    }

    public void LlenarTorneoE() {
        for(int i = 0; i < 5; i++) {
            System.out.println("\nIngrese el nombre del equipo: ");
            nombreE = sc.nextLine();
            System.out.println("Ingrese la division del equipo: ");
            divisionE = sc.nextLine();
            System.out.println("Ingrese el nombre del entrenador: ");
            entrenadorE = sc.nextLine();
        
            equipo = new Equipo(nombreE, divisionE, entrenadorE, 0, 0, 0);

            equipos_participantes.add(equipo);
        }
    }

    public void Imprimir() {
        System.out.println("\nNombre del torneo: " + nombre);
        System.out.println("Region: " + region);
        System.out.println("Equipos participantes: " + equipos_participantes.size());
        System.out.println("Partidos jugados: " + jugados);
        System.out.println("Partidos pendientes: " + pendientes);

        String string = "";
        for(int i = 0; i < equipos_participantes.size(); i++){
            string += "\nEquipo " + (i+1);
            string += "Nombre: "+equipos_participantes.get(i).getNombre();
            string += "Division: "+equipos_participantes.get(i).getDivision();
        }
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //////////////////////////////////////////////
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    //////////////////////////////////////////////
    public int getEquipos() {
        return equipos;
    }

    public void setEquipos(int equipos) {
        this.equipos = equipos;
    }

    //////////////////////////////////////////////
    public int getJugados() {
        return jugados;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }

    //////////////////////////////////////////////
    public int getPendientes() {
        return pendientes;
    }

    public void setPendientes(int pendientes) {
        this.pendientes = pendientes;
    }  
    
}