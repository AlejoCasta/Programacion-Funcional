package example

import scala.{ specialized => sp }

object ejercicioClase6DeMayo extends App{
  trait Semigroup[A] extends Any with Serializable {
    def combine (x:A,y:A):A
  }

  object Semigroup {
    def apply[F:Semigroup] = implicitly[Semigroup[F]]
  }

  trait SemigroupInstances{
    implicit def intSG = new Semigroup[Int] {
      def combine(x: Int, y: Int): Int = x + y
    }
  }

  implicit def optSG[A:Semigroup] = new Semigroup[Option[A]]{
    def combine(x:Option[A],y:Option[A]): Option[A] = (x,y) match {
      case (Some(a),Some(b)) => Option(Semigroup[A].combine(a,b))
      case (a @ Some(_), _) => a
      case (_, b @ Some(_)) => b
      case _ => None
    }
  }

  trait SemigroupSyntax{
    implicit class SemigroupSyntax[A](a:A){
      def combine(b:A)(implicit s:Semigroup[A]): A = s.combine(a,b)
    }
  }

  object SemigroupOps extends SemigroupSyntax with SemigroupInstances

  import SemigroupOps._
  println(1 combine 1)
  val one:Option[Int]  = Some(1)
  val none: Option[Int] = None

  println(one combine none)
  println(none combine one)
  println(one combine one)

}
