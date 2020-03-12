import org.scalatest._

class TaxCalculatorSpec extends FlatSpec {

  val taxCalc = new TaxCalculator

  "Inputting 0 as income with first set of test arrays" should "return 0" in {
    assert(taxCalc.calculateTax(0, Array(1000, 10000, 20000), Array(10,20,25)) == 0)
  }

  "Inputting 0 as income with second set of test arrays" should "return 0" in {
    assert(taxCalc.calculateTax(0, Array(5000, 10000, 15000), Array(10,25,50)) == 0)
  }

  "Inputting 0 as income with third set of test arrays" should "return 0" in {
    assert(taxCalc.calculateTax(0, Array(1000, 10000, 20000, 30000, 40000), Array(10,20,30,40,50)) == 0)
  }

  "Inputting 2000 with simple arrays" should "return 100" in {
    assert(taxCalc.calculateTax(2000, Array(1000), Array(10)) == 100)
  }

  "Inputting 5000 with arrays of more than 1 value" should "return 500" in {
    assert(taxCalc.calculateTax(5000, Array(1000, 4000), Array(10, 20)) == 500)
  }
}
