package mylib

import spinal.core._
import spinal.lib._

//Hardware definition
class Counter extends Component {
  val io = new Bundle {
    val cond0 = in  Bool()
    val cond1 = in  Bool()
    val flag  = out Bool()
    val state = out UInt(8 bits)
  }
  val counter = Reg(UInt(8 bits)) init(0)

  when(io.cond0){
    counter := counter + 1
  }

  io.state := counter
  io.flag  := (counter === 0) | io.cond1
}

//Generate the Counter's Verilog using the custom configuration.
object CounterVerilog extends App {
    MySpinalConfig.generate(new Counter)
}