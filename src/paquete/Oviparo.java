package paquete;

public class Oviparo extends Animal {

    int numeroHuevos, tiempoIncubacion;
    float temperaturaIncubacion;
    String tpoHuevo, cuidadoHuevos, desarrolloPostNatal;

    public Oviparo(){

    }

    public Oviparo(int esperanzaVida, String nombre, String especie, String alimentacion, String habitat, String tamanio,
                   int numeroHuevos, int tiempoIncubacion, float temperaturaIncubacion, String tpoHuevo,
                   String cuidadoHuevos, String desarrolloPostNatal){

        super(esperanzaVida, nombre, especie, alimentacion, habitat, tamanio);

        this.numeroHuevos = numeroHuevos;
        this.tiempoIncubacion = tiempoIncubacion;
        this.temperaturaIncubacion = temperaturaIncubacion;
        this.tpoHuevo = tpoHuevo;
        this.cuidadoHuevos = cuidadoHuevos;
        this.desarrolloPostNatal = desarrolloPostNatal;
    }

    public int getTiempoIncubacion() {
        return tiempoIncubacion;
    }

    public void setTiempoIncubacion(int tiempoIncubacion) {
        this.tiempoIncubacion = tiempoIncubacion;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    public float getTemperaturaIncubacion() {
        return temperaturaIncubacion;
    }

    public void setTemperaturaIncubacion(float temperaturaIncubacion) {
        this.temperaturaIncubacion = temperaturaIncubacion;
    }

    public String getTpoHuevo() {
        return tpoHuevo;
    }

    public void setTpoHuevo(String tpoHuevo) {
        this.tpoHuevo = tpoHuevo;
    }

    public String getCuidadoHuevos() {
        return cuidadoHuevos;
    }

    public void setCuidadoHuevos(String cuidadoHuevos) {
        this.cuidadoHuevos = cuidadoHuevos;
    }

    public String getDesarrolloPostNatal() {
        return desarrolloPostNatal;
    }

    public void setDesarrolloPostNatal(String desarrolloPostNatal) {
        this.desarrolloPostNatal = desarrolloPostNatal;
    }

    public void infoOviparo(){
        System.out.println("------INFORMACION GENERAL DEL ANIMAL------");
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Especie perteneciente: " + getEspecie());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Esperanza de vida: " + getEsperanzaVida() + " años");

        System.out.println("------CARACTERISTICAS REPRODUCTIVAS------");
        System.out.println("Cantidad de huevos que pone: " + getNumeroHuevos());
        System.out.println("Tipo de huevo: " + getTpoHuevo());
        System.out.println("Tiempo que tarda en incubar los huevos: " + getTiempoIncubacion() + " días");
        System.out.println("Temperatura de incubación: " + getTemperaturaIncubacion() + " °C");
        System.out.println("Cuidado de los huevos: " + getCuidadoHuevos());
        System.out.println("Desarrollo postnatal: " + getDesarrolloPostNatal());
    }
}
