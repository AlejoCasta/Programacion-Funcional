// solo va a construir esta entidades si y solo si el objeto tiene sentido

/*trait MensajeError{val error : String}
trait Estado
trait Cifrado extends Estado
trait Plano extends Estado
case class Mensaje(texto:String,sha:Int)
object Mensaje{
  def apply (texto:String, sha:Int):Either[MensajeError, Mensaje[Plano]] = {
    if(validarSha(sha)) Right(new Mensaje[Plano](texto,sha))
    else Left(new MensajeError {
      val error = "Revise como creo el mensaje caballo"
    })
  }
  private def validarSha(i: Int):Boolean = true
}
def cifrar (m: Mensaje[Plano]): Mensaje[Cifrado] = {
  new Mensaje[Cifrado](m.texto,m.sha)
}
Mensaje("Hola",2)*/


/*
val s: Option[Int] = Option(2)
val d: Option[Int] = Option(3)

val r = s.flatMap(x => d.map(z => x+z)) //hace lo mismo que el for

for {
  ss <- s
  dd <- d
  a = ss+dd
}yield a*/



/*
Try[Int](throw new Exception("Error"))
Success(1)
Failure(new Exception)*/
/*val ll : Either[String, Int] = Left("Error")
for {
  l0 <- Left("Izquierda del for")
  r <- Right(1)
  r1 <- Right(2)
  l <- ll
} yield r+r1+l*/