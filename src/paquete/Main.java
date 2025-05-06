package paquete;

public class Main {
    public static void main(String[] args) {

        Oviparo tortuga = new Oviparo();

        System.out.println("------OVIPARO------");

        tortuga.setNombre("Tortuga marina");
        tortuga.setEspecie("Cheloniidae");
        tortuga.setAlimentacion("Omnívora");
        tortuga.setHabitat("Océano");
        tortuga.setTamanio("Grande");
        tortuga.setEsperanzaVida(80);

        tortuga.setNumeroHuevos(100);
        tortuga.setTpoHuevo("Cáscara blanda");
        tortuga.setTiempoIncubacion(60);
        tortuga.setTemperaturaIncubacion(29.5f);
        tortuga.setCuidadoHuevos("No cuida los huevos");
        tortuga.setDesarrolloPostNatal("Independiente al nacer");

        tortuga.infoOviparo();

        System.out.println("\nHERRERA CATRO JAVIER ALEXIS\n" +
                "TRM31\n" +
                "24310130");

        Viviparo perro = new Viviparo();

        System.out.println("\n------VIVIPARO------");

        perro.setNombre("Perro");
        perro.setEspecie("Canis lupus familiaris");
        perro.setAlimentacion("Omnívoro");
        perro.setHabitat("Doméstico");
        perro.setTamanio("Mediano");
        perro.setEsperanzaVida(13);

        perro.setTpoNacimiento("Vivo y completo");
        perro.setGestacion(63);
        perro.setNumCrias(6);
        perro.setMaduresSexual(8);
        perro.setCuidadoPostNatal("Lactancia y protección");
        perro.setLongevidad(13);

        perro.infoViviparo();

        System.out.println("\nLAISHA NAYELLI MARTINEZ VIDAÑA\n" +
                "TRM31\n" +
                "24310258");





    }
}
