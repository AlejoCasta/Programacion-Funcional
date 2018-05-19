package example

import org.scalatest.{FlatSpec, Matchers}

class SumaDeMultiplosTest extends FlatSpec with Matchers{

  "Suma multiplos" should "return 30" in{
    val multTest = new SumaDeMultiplos()
    multTest.sumarMultiplos(5,5,20) should be(30)
  }
}
