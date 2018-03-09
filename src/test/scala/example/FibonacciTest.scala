package example

import org.scalatest.{FlatSpec, Matchers}

class FibonacciTest extends FlatSpec with Matchers{

  "Fibonnaci Main" should "return fibonnaci" in{
    MainFactorial.Factorial.factorial(3) should be(6)
  }
}
