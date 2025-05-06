package paquete;

public class Animal {

    int esperanzaVida;
    String nombre, especie,  alimentacion, habitat, tamanio;

    public Animal(){

    }
    public Animal(int esperanzaVida, String nombre, String especie, String alimentacion, String habitat, String tamanio){
        this.esperanzaVida = esperanzaVida;
        this.nombre = nombre;
        this.especie = especie;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void infoAnimal(){
        System.out.println("Esperanza de vida: " + getEsperanzaVida());
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Especia perteneciente: " + getEspecie());
        System.out.println("Alimentacion: " + getAlimentacion());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Tamaño: " + getTamanio());
    }
}
