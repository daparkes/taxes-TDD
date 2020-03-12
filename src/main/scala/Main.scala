object Main extends App {

  val taxCalc = new TaxCalculator
  taxCalc.calculateTax(50000, Array(1000, 10000, 40000), Array(0.1, 0.2, 0.3))

}
