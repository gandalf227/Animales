package paquete;

public class Viviparo extends Animal {

    int gestacion, numCrias, longevidad, maduresSexual;
    String cuidadoPostNatal, tpoNacimiento;

    public Viviparo(){

    }

    public Viviparo(int esperanzaVida, String nombre, String especie, String alimentacion, String habitat, String tamanio,
                    int gestacion, int numCrias, int longevidad, int maduresSexual, String cuidadoPostNatal,
                    String tpoNacimiento){

        super(esperanzaVida, nombre, especie, alimentacion, habitat, tamanio);

        this.gestacion = gestacion;
        this.numCrias = numCrias;
        this.longevidad = longevidad;
        this.maduresSexual = maduresSexual;
        this.cuidadoPostNatal = cuidadoPostNatal;
        this.tpoNacimiento = tpoNacimiento;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    public int getNumCrias() {
        return numCrias;
    }

    public void setNumCrias(int numCrias) {
        this.numCrias = numCrias;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public int getMaduresSexual() {
        return maduresSexual;
    }

    public void setMaduresSexual(int maduresSexual) {
        this.maduresSexual = maduresSexual;
    }

    public String getCuidadoPostNatal() {
        return cuidadoPostNatal;
    }

    public void setCuidadoPostNatal(String cuidadoPostNatal) {
        this.cuidadoPostNatal = cuidadoPostNatal;
    }

    public String getTpoNacimiento() {
        return tpoNacimiento;
    }

    public void setTpoNacimiento(String tpoNacimiento) {
        this.tpoNacimiento = tpoNacimiento;
    }

    public void infoViviparo(){
        System.out.println("------INFORMACIÓN GENERAL DEL ANIMAL------");
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Especie perteneciente: " + getEspecie());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Esperanza de vida: " + getEsperanzaVida() + " años");

        System.out.println("------CARACTERÍSTICAS REPRODUCTIVAS------");
        System.out.println("Tipo de nacimiento: " + getTpoNacimiento());
        System.out.println("Tiempo de gestación: " + getGestacion() + " días");
        System.out.println("Número de crías: " + getNumCrias());
        System.out.println("Madurez sexual: " + getMaduresSexual() + " meses");
        System.out.println("Cuidado postnatal: " + getCuidadoPostNatal());
        System.out.println("Longevidad: " + getLongevidad() + " años");
    }


}
