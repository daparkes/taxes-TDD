package taxCalculator

import org.scalatest._

class TaxCalculatorSpec extends FlatSpec {

  val taxCalc = new TaxCalculator

  "Inputting 0 as income with first set of test arrays" should "return 0" in {
    assert(taxCalc.calculateTax(0, Array(1000, 10000, 20000), Array(10,0.2,0.25)) == 0)
  }

  "Inputting 0 as income with second set of test arrays" should "return 0" in {
    assert(taxCalc.calculateTax(0, Array(5000, 10000, 15000), Array(0.1,0.25,0.5)) == 0)
  }

  "Inputting 0 as income with third set of test arrays" should "return 0" in {
    assert(taxCalc.calculateTax(0, Array(1000, 10000, 20000, 30000, 40000), Array(0.1,0.2,0.3,0.4,0.5)) == 0)
  }

  "Inputting 2000 with simple arrays" should "return 100" in {
    assert(taxCalc.calculateTax(2000, Array(1000), Array(0.1)) == 100)
  }

  "Inputting 5000 with arrays of more than 1 value" should "return 500" in {
    assert(taxCalc.calculateTax(5000, Array(1000, 4000), Array(0.1, 0.2)) == 500)
  }

  "Inputting 50000 with longer arrays" should "return 9900" in {
    assert(taxCalc.calculateTax(50000, Array(1000, 10000, 40000), Array(0.1, 0.2, 0.3)) == 9900)
  }

  "Inputting 1000000 with longer arrays" should "return 9900" in {
    assert(taxCalc.calculateTax(1000000, Array(1000, 10000, 40000, 60000, 70000, 500000, 700000), Array(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7)) == 561900)
  }


  "Inputting 0.1 with simple arrays" should "return 3000" in {
    assert(taxCalc.overallTaxRateFindIncome(0.1, Array(1000,2000),Array(0.1,0.2)) == "The income you are looking for is 3000")
  }
}
