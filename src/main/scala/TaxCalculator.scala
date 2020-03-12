class TaxCalculator {

  def calculateTax(income: Int, incomeCaps: Array[Int], marginTaxRate: Array[Int]): Int = {
    var totalTax = 0
    for ( i <- 1 until incomeCaps.length) {
      if (income >= incomeCaps(i)) {
        totalTax += (incomeCaps(i) - incomeCaps( i- 1)) / marginTaxRate(i - 1)
      }
    }
    if (income > incomeCaps(incomeCaps.length - 1)) {
      totalTax += (income - incomeCaps(incomeCaps.length - 1)) / (100 / marginTaxRate(marginTaxRate.length - 1))
    }
    totalTax
  }

}
