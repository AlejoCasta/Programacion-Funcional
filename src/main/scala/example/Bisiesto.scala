package example

class Bisiesto {
  def esBisiesto(anio:Int):Boolean = {
    if(anio % 4 == 0) true
    else false
  }
}
