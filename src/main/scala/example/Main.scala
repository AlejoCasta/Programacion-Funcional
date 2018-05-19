package example

object Main {
  def main(args: Array[String]): Unit = {
    val bisiesto = new Bisiesto()
    println(bisiesto.esBisiesto(2016))
  }
}
