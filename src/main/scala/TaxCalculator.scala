class TaxCalculator {

  def calculateTax(income: Int, incomeCaps: Array[Int], marginTaxRate: Array[Double]): Int = {
    var totalTax = 0.0
    for ( i <- 1 until incomeCaps.length) {
      if (income >= incomeCaps(i)) {
        println(s"incomeCaps: $incomeCaps(i)")
        totalTax += (incomeCaps(i) - incomeCaps( i- 1)) * marginTaxRate(i - 1)
        println(s"totalTax: $totalTax")
      }
    }
    if (income > incomeCaps(incomeCaps.length - 1)) {
      totalTax += (income - incomeCaps(incomeCaps.length - 1)) * marginTaxRate(marginTaxRate.length - 1)
      println((income - incomeCaps(incomeCaps.length - 1)) * marginTaxRate(marginTaxRate.length - 1))

    }
    totalTax.toInt
  }



}
