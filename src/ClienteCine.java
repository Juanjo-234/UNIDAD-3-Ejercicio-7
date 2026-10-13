public class ClienteCine {
    private String nombre;
    private int edad;
    private boolean tieneMembresiaVip;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public ClienteCine(String nombre, int edad, boolean tieneMembresiaVip){
        this.nombre = nombre;
       setEdad(edad);
        this.tieneMembresiaVip = tieneMembresiaVip;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("La edad ingresada no es valida");
        }
    }

    public boolean esAptoParaFuncionMayores() {
        return this.edad >= 18;
    }
}
