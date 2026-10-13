//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
ClienteCine cliente1 = new ClienteCine("JUAN PEREZ", 18, true);
ClienteCine cliente2  = new ClienteCine("JOSE GONZALES", 17, false);

System.out.println("========================================================================================================");
System.out.println("Nombre del cliente: " + cliente1.getNombre());
System.out.println("Edad del cliente: " + cliente1.getEdad());
    boolean esApto = cliente1.esAptoParaFuncionMayores();
    System.out.println(" - ¿Es apto para función para mayores?: " + (esApto ? "Sí (Acceso permitido)" : "No (Menor de edad)"));
System.out.println("========================================================================================================");

    System.out.println("Nombre del cliente: " + cliente2.getNombre());
    System.out.println("Edad del cliente: " + cliente2.getEdad());
    esApto = cliente2.esAptoParaFuncionMayores();
   System.out.println(" - ¿Es apto para función para mayores?: " + (esApto ? "Sí (Acceso permitido)" : "No (Menor de edad)"));
}
