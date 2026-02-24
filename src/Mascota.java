public class Mascota {
    private String Nombre;
    private String Especie;
    private int Edad;
    private double Peso;
    private boolean Vacuna;

    public Mascota () {

    }
    public Mascota(String nombre, String especie, int edad, double peso, boolean vacuna) {
        Nombre = nombre;
        Especie = especie;
        Edad = edad;
        Peso = peso;
        Vacuna = vacuna = false;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public int getEdad() {
        return Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public boolean isVacuna() {
        return Vacuna;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public void setVacuna(boolean vacuna) {
        Vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "Nombre='" + Nombre + '\'' +
                ", Especie='" + Especie + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                ", Vacuna=" + Vacuna +
                '}';
    }

}


