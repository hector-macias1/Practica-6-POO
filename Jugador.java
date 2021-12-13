public class Jugador {
    String nombre;
    String posicion;
    int uniforme;
    int anotados;
    float estatura;

    public Jugador(int uniforme, String nombre, String posicion, float estatura, int anotados) {
        this.uniforme = uniforme;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
        this.anotados = anotados;
    }

    public Jugador() {
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////////
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /////////////////////////////////////////
    public int getUniforme() {
        return uniforme;
    }

    public void setUniforme(int uniforme) {
        this.uniforme = uniforme;
    }

    /////////////////////////////////////////
    public int getAnotados() {
        return anotados;
    }

    public void setAnotados(int anotados) {
        this.anotados = anotados;
    }

    /////////////////////////////////////////
    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
}