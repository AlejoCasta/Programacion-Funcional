/*case class Persona(nombre:String,edad:Int)
implicit def sumarEdad: Persona=>Int=_.edad

def suma(sumando1:Int)(implicit sumando2:Int): Int = sumando1 + sumando2;

def suma(sumando1:String,sumando2:String): String = sumando1+sumando2;

implicit val siete: Int = "18";
implicit def toStr : Int => String = _.toString
implicit def toInt : String => Int = java.lang.Integer.valueOf(_)

val s = suma("H",_:String);
s("OLA")

suma(2)

suma("H",5)*/


/*
implicit class StringOps(s:String){
  def esMayor(s2:String): Boolean = s.length >= s2.length
}

"Hola" esMayor "Mundo"*/

//patron type class
case class Persona(nombre:String, edad:Int, patrimonio:Int)

object personaJuridica {

}

trait sumable[T]{
  def sumar(a:T , b:T):T
  def zero: T
}

object SumableOps{
  implicit object IntSumable extends sumable[Int]{
    def sumar(a:Int, b:Int): Int = a+b
    def zero: Int = 0
  }

  implicit object StringSumable extends sumable[String]{
    def sumar(a: String, b:String): String = a+b
    def zero: String = ""
  }

  implicit object PersonaSumable extends sumable[Persona]{
    def sumar(a:Persona,b:Persona): Persona = Persona("",0,a.patrimonio+b.patrimonio)
    def zero: Persona=Persona("",0,0)
  }
}
import SumableOps._
def sumar[T:sumable](a:T,b:T)(implicit s:sumable[T]): T = s.sumar(a,b)
sumar(1,2)
sumar("1","2")
val persona1 = Persona("",0,9)
val persona2 =  Persona("",0,9)
sumar(persona1,persona1)s