sealed trait EjemploCompanionObject
case class D  extends EjemploCompanionObject

object D {
  def apply: D = {
    println("D")
    new D()
  }
}
