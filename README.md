Este programa está diseñado para modelar y gestionar perfiles de clientes de un cine asegurando la integridad de sus datos mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos) y métodos de validación internos basados en la edad y membresía, utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase ClienteCine: Declara atributos privados (nombre, edad y tieneMembresiaVip) para proteger el estado interno del cliente frente a modificaciones externas no controladas.

Implementa el método de validación esAptoParaFuncionMayores(): Evalúa de manera interna y encapsulada si la edad del cliente cumple con el requisito reglamentario (por ejemplo, ser mayor o igual a 18 años).

Protege el setter de la edad: Incluye restricciones defensivas para evitar que se asignen edades negativas o valores incoherentes, manteniendo la coherencia del objeto.

Ejecuta la prueba en el main: Instancia distintos perfiles de clientes (menores y mayores de edad, con y sin membresía VIP), consulta sus restricciones y elegibilidad a través de métodos públicos y muestra los resultados detallados por consola.
