class TaxCalculator {

  def calculateTax(income: Int, incomeCaps: Array[Int], marginTaxRate: Array[Int]): Int = {
    (income-incomeCaps(0)) / marginTaxRate(0)
  }

}
