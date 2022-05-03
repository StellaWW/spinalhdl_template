// package mylib

import spinal.core._
import spinal.lib._
import spinal.lib.soc.pinsec._

// //Generate the Pinsec_test's Verilog
// object Pinsec_testVerilog extends App {
//   SpinalVerilog(new Pinsec(500 MHz))
// }

//Generate the Pinsec_test's Verilog using the custom configuration in MyTopLevel.
// object Pinsec_testVerilog extends App {
//   MySpinalConfig.generate(new Pinsec(500 MHz))
// }
object Pinsec_testVerilog extends App {
  SpinalVerilog(new Pinsec(500 MHz))
}