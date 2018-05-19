package example

class SumaDeMultiplos {
  def sumarMultiplos(n1:Int,n2:Int,base:Int): Int ={
    def multiplos(numero: Int, limite:Int, suma:Int, lista:List[Int]): List[Int]={
      if(suma < limite) multiplos(numero,limite,suma+numero,suma::lista)
      else lista
    }
    def sum(xs: List[Int]): Int ={
      xs match {
        case x:: tail => x+sum(tail)
        case Nil => 0
      }
    }
    val lista = multiplos(n1,base,0,0::Nil)
    sum(lista.distinct)
  }
}
