object Main extends App {

  val taxCalc = new TaxCalculator
  taxCalc.calculateTax(5000, Array(1000, 4000), Array(10, 20))

}
