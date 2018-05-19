package example.Parqueadero

import java.util.Date

sealed trait Vehiculo{
  def placa:String
  def horaIngreso: Date
  def horaSalida: Date
  def cilindraje: Int
  def mensualidad: Boolean
}
case class Carro(placa:String, horaIngreso:Date,horaSalida:Date,
                 cilindraje:Int, mensualidad:Boolean) extends Vehiculo

case class Moto(placa:String, horaIngreso:Date,horaSalida:Date,
                cilindraje:Int, mensualidad:Boolean) extends Vehiculo

object Carro{
  def apply(placa: String,horaIngreso:Date,horaSalida:Date,
            cilindraje:Int, mensualidad:Boolean): Option[Carro] = {
    if(placa != 6) {
      None
    }
    else{
      Some(new Carro(placa,horaIngreso,horaSalida,cilindraje,mensualidad))
    }
  }
}

object Moto{
  def apply(placa: String,horaIngreso:Date,horaSalida:Date,
            cilindraje:Int, mensualidad:Boolean): Option[Moto] = {
    if(placa != 6) {
      None
    }
    else{
      Some(new Moto(placa,horaIngreso,horaSalida,cilindraje,mensualidad))
    }
  }
}