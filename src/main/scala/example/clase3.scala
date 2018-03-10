import scala.annotation.tailrec

def suma(a:Int ,b:Int):Int= a+b                 //> suma: (a: Int, b: Int)Int
suma(254800,78114)

/*def fact(x:Int): Int ={
  def factLoop(n:Int , acumulado:Int): Int ={
    if(n <= 0) acumulado else factLoop(n-1, n*acumulado)
  }
  factLoop(x,1)
}

fact(10)*/

def mcd (n:Int,n2:Int):Int={
  @tailrec
  def mcd2(num:Int ,num2:Int): Int ={
    if(num2==0)num
    else mcd2(num2,num%num2)
  }
  mcd2(n,n2)
}
mcd(6,6)
