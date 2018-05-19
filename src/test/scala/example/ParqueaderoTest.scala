package example

import java.util.Calendar

import example.Parqueadero.{CalculadoraDeTarifas, Moto}
import org.scalatest.{FlatSpec, Matchers}

class ParqueaderoTest extends FlatSpec with Matchers{
  "calcular tarifa carro bajo cilindraje" should "calcular el precio del carro" in{
    val fecha = Calendar.getInstance().getTime()
    val moto = new Moto("scv123",fecha,fecha,2000,false)
    CalculadoraDeTarifas.calcular(moto,5)should be(2500)
  }
}
