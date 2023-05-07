
object AnalisisExploratorio extends App {

  // ejercicio-1:
  // Popula la variable dataset con el resultado de la función loadDataset de Utilidades.
  // Ten en cuenta que se carga el csv completo, incluyendo las cabeceras, asegúrate de omitirlas (la primera fila)
  val dataset = ???

  // Implementa la función
  // ejercicio-2:
  // Número total de registros en el dataset.
  def totalDeRegistros(c: Seq[Contribuyente]): Int = ???


  // Implementa la función
  // ejercicio-3:
  // Calcular la media de edad de todos los contribuyentes
  def calculaEdadMedia(c: Seq[Contribuyente]): Double = ???

  // Implementa la función
  // ejercicio-4:
  // Calcular la media de edad de todos los contribuyentes que nunca se han casado.
  // hint: marital-status = Never-Married
  def calculaEdadMediaNeverMarried(c: Seq[Contribuyente]): Double = ???

  // Implementa la función
  // ejercicio-5:
  // Descubrir de cuántos países distintos provienen los contribuyentes
  def paisesOrigenUnicos(c: Seq[Contribuyente]): Seq[String] = ???

  // Implementa la función
  // ejercicio-6:
  // De todos los contribuyentes, ¿cómo se distribuye por género?. Devuelve el porcentaje de hombres
  // y el de mujeres, en ese orden, (porcentajeDeHombres, porcentajeDeMujeres)
  def distribucionPorGeneros(c: Seq[Contribuyente]): (Double, Double) = ???

  // Implementa la función
  // ejercicio-7:
  // Encuentra el tipo de trabajo (workclass) mejor remunerado. El trabajo mejor remunerado es aquel trabajo donde el
  // porcentaje de los contribuyentes que perciben ingresos (income) superiores a ">50K" es mayor que los contribuyentes
  // cuyos ingresos son "<50K".
  def trabajoMejorRemunerado(c: Seq[Contribuyente]): String = ???

  // Implementa la función
  // ejercicio-8:
  // Cuál es la media de años de educación (education-num) de aquellos contribuyentes cuyo país de origen no es
  // United-States
  def aniosEstudiosMedio(c: Seq[Contribuyente]): Double = ???


  //  println(s" -> Dataset tiene un total de registros: ${totalDeRegistros(c = dataset)}")
  //  println(s" -> En el dataset, los contribuyentes tienen una edad media: ${calculaEdadMedia(c = dataset)}")
  //  println(s" -> En el dataset, los contribuyentes tienen una edad media (sin contar aquellos con age = 0): ${calculaEdadMediaNoZeros(c = dataset)}")
  //  println(s" -> Los contribuyentes proviende de distintos países como: ${paisesOrigenUnicos(c = dataset).mkString(",")}")
  //  println(s" -> Los contribuyentes se distribuyen en (hombres - mujeres): ${distribucionPorGeneros(c = dataset)}")
  //  println(s" -> El tipo de trabajo mejor remunerado en el dataset es: ${trabajoMejorRemunerado(c = dataset)}")
  //  println(s" -> La media de años de estudio de los contribuyenes de origen distinto a United States es: ${aniosEstudiosMedio(c = dataset)}")


  // ejercicio-11
  // llama a la función imprimeContribuyentes pasándole los primeros 5 contribuyentes del dataset.

}
