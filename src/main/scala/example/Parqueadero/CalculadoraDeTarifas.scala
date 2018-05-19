package example.Parqueadero

object CalculadoraDeTarifas {
  def calcular(vehiculo:Vehiculo,numeroDeHoras:Double): AnyVal ={
    vehiculo match {
      case Carro(_,_,_,cilindraje,mensualidad) => {
        if(!mensualidad){
          (numeroDeHoras*2000)
          if(cilindraje > 2000) (numeroDeHoras*2000)+2000
        }
      }

      case Moto(_,_,_,cilindraje,mensualidad) => if(!mensualidad) (numeroDeHoras*500)
    }
  }
}
