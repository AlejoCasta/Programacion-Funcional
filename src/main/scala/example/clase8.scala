/*
package example
import scala.concurrent.{Await, Future}


class clase8 {
  val event = Future(1)
  val event2 = Future[Int]{
    Thread.sleep(scala.util.Random.nextInt(50))
    throw  new Exception(" Error ")
  }recover {
    case ex => s"El error es ${ex.getMessage}"
  }
  val event3 =
  println("Principal")

  //ejemplo de una operacion que en un futuro puede fallar
  /*val result = Await.result(event, 2.seconds)
  println("Away")
  println(result)
  // todos los futuros tienen unos tiempos distintos para ejecutarse
  val int1 = Future(1)
  val int2 = Future(2)
  val int3 = Future(3)

  val result = for{
    a <- int1
    b <- int2
    c <- int3
  }yield a+b+c
  val _ = Thread.sleep(200)
  println(result)*/
}
*/
