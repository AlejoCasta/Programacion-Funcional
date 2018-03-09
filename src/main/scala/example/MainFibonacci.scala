package example

import scala.annotation.tailrec

object MainFactorial {
  println(Factorial.factorial(9))
  object Factorial {
    def factorial(x:Int):Int={
      @tailrec
      def facloop(acumulado:Int,n:Int):Int={
        if(n == 0)acumulado
        else facloop(n*acumulado,n-1)
      }
      facloop(1,x)
    }

    def fibonacci(x:Int):List[Int]={
      @tailrec
      def fibonacciLoop(tamano:Int,pos:Int,posAnt:Int,lista:List[Int]):List[Int]={
        if(tamano == 0)lista
        else fibonacciLoop(tamano-1,pos+posAnt,pos,List(pos))
      }
      fibonacciLoop(x,1,0,List())
    }
  }
}
