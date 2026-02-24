
void main() {
    Scanner teclado = new Scanner(System.in) ;
    Mascota M1 = new Mascota();
    System.out.println("NOMBRA A TU MASCOTA: ");
    M1.setNombre(teclado.next());
    System.out.println("INGRESE LA ESPECIE DE SU MASCOTA: ");
    M1.setEspecie(teclado.next());
    System.out.println("INGRESE LA EDAD DE SU MASCOTA: ");
    M1.setEdad(teclado.next());
    System.out.println("¿CUAL ES EL PESO DE SU MASCOTA? ");
    M1.setPeso(teclado.next());

    }