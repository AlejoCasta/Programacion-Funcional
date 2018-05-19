package example

import com.sun.net.httpserver.Authenticator.Success

import scala.util.Try
import scala.util.Success

trait Monad[F[_]]{
  def pure[A]: A => F[A]

  def flatMap[A , B](fa: F[A])(f: A => F[B]): F[B]
}

object Monad{
  def apply[F[_]: Monad]: Monad[F] = implicitly[Monad[F]]
}

object MonadInstances{
  implicit def optionMonad = new Monad[Option] {
    def pure[A]: A => Option[A] = Option.apply
    def flatMap[A , B](fa: Option[A])(f:A => Option[B]): Option[B] = fa flatMap f
  }

  type either[A] = Either[String,A]

  implicit def eitherMonad[L] = new Monad[either] {
    def pure[A]: A => either[A] = Right.apply
    def flatMap[A,B](fa:either[A])(f: A => either[B]):either[B] = fa flatMap f
  }

  /*implicit def tryMonad = new Monad[Try] {
    def pure[A]: A => Try[A] = Success.apply


    def flatMap[A,B](fa:Try[A])(f:A => Try[B]): Try[B] = fa flatMap f
  }*/
}

trait laws{
  def f[A,F[_]]: A=>F[A]
  def g[A,F[_]]: A=>F[A]

  def leftIdentity[A,F[_]:Monad](x:A)(f:A => F[A]):Boolean = {
    Monad[F].flatMap(Monad[F].pure(x))(f) == f(x)
  }

  def rightIdentity[A,F[_]: Monad](x:A):Boolean = {
    Monad[F].flatMap(Monad[F].pure(x))(Monad[F].pure) == Monad[F].pure(x)
  }

  def associativity[A,F[_]: Monad](x:A)(f:A => F[A])(g: A => F[A]): Boolean = {
    val m = Monad[F]
    val ap = m.pure(x)
    m.flatMap(ap)(a => m.flatMap(m.pure(a))(g)) == m.flatMap(m.flatMap(ap)(f))(g)
  }
}

//El try no es una monada porque no cumple la ley de identidad a la izquierda
//cuando no lanza excepcioness

