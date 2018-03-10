/*package clase

sealed trait Billetes
case class Dollar (value: Double) extends Billetes
case class Euro (value: Double) extends Billetes
case class Yen (value: Double) extends Billetes

object calculadorDeMoneda{
  def toCOP(ayudaDeToCOP(b:Billetes, trms: List[(Billetes, Double)]):Double=>Double): Double = {
    b match {
      case usd @ Dollar(v) => v * trms.find{
        case (usd, trm) => true
      }.get._2    //find en listas busca el tipo que quiero encontrar dentro de la lista
    }
  }

  def ayudaDeToCOP(b:Billetes,v:Double,trms : List[(Billetes, Double)]): Double =s{
    v*trms.find {
        case (b, trm) => true
      }.get._2
  }


}*/