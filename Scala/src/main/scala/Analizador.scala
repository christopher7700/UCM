
trait Analizador extends App {

  // Implementa la función en el objeto que extienda este trait.
  // ejercicio-10
  // Al extender Analizador, pedirá que se implemente la función abstracta imprimeContribuyentes,
  // la cual hará uso de la función imprimeDatos del companion object definido en el ejercicio 9.
  def imprimeContribuyentes(c: Seq[Contribuyente]): Unit
}
