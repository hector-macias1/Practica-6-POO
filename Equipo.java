import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    String nombre;
    String division;
    String entrenador;
    int torneos;
    int ganados;
    int perdidos;

    int sumatotal;

    //variables para usar la clase "Jugador"
    String nombreJ;
    String posicionJ;
    int uniformeJ;
    int anotadosJ;
    float estaturaJ;

    //Instancias
    Jugador jugador = new Jugador();
    Scanner sc = new Scanner(System.in);

    //Arraylist de jugadores del Equipo
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Equipo(String nombre, String division, String entrenador, int torneos, int ganados, int perdidos) {
        this.nombre = nombre;
        this.division = division;
        this.entrenador = entrenador;
        this.torneos = torneos;
        this.ganados = ganados;
        this.perdidos = perdidos;
    }

    public Equipo() {
    }

    //Metodo para llenar un equipo de jugadores
    public void LlenarEquipo() {
        for(int i = 0; i < 10; i++) {
            //Captura de datos
            System.out.println("\nIngrese el nombre del Jugador: ");
            nombreJ = sc.nextLine();
            System.out.println("Ingrese la posicion del jugador: ");
            posicionJ = sc.nextLine();
            System.out.println("Ingrese el numero del jugador: ");
            uniformeJ = sc.nextInt();
            System.out.println("Ingrese la estatura del jugador: (mts)");
            estaturaJ = sc.nextFloat();
            sc.nextLine();

            //Captura del constructor de Jugador
            jugador = new Jugador(uniformeJ, nombreJ, posicionJ, estaturaJ, 0);
            
            //Agregar al arraylist
            jugadores.add(jugador);
        }
    }

    public void ImprimirJugadores() {
        String string = "";
        for(int i = 0; i < jugadores.size(); i++){
            string += "\nJugador " + (i+1);
            string += "Nombre: "+jugadores.get(i).getNombre();
            string += "Numero de uniforme: "+jugadores.get(i).getUniforme();
        }
    }

    //Numero de jugadores registrados
    public int Registrados() {
        return jugadores.size();
    }

    //Numero total de puntos
    public int PuntosTotales() {
        jugador = jugadores.get(0);
        for(int i = 1; i <= jugadores.size(); i++){
            jugador = jugadores.get(i-1);
            sumatotal = (sumatotal + jugador.getAnotados());
        }
        return sumatotal;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////////
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    /////////////////////////////////////////
    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    /////////////////////////////////////////
    public int getTorneos() {
        return torneos;
    }

    public void setTorneos(int torneos) {
        this.torneos = torneos;
    }

    /////////////////////////////////////////
    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    /////////////////////////////////////////
    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }
    
}