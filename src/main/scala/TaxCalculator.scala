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
    if (income > incomeCaps.last) {
      totalTax += (income - incomeCaps(incomeCaps.length - 1)) * marginTaxRate.last
      println((income - incomeCaps(incomeCaps.length - 1)) * marginTaxRate.last)

    }
    totalTax.toInt
  }

  def overallTaxRateFindIncome(overAllTaxRate: Double, incomeCaps: Array[Int], marginTaxRate: Array[Double]): String = {
    var returnString = ""
    var income = 0.0
    if(overAllTaxRate > marginTaxRate.last) {
      returnString = "There is no such income"
    } else {
      var solutionNotFound = (overAllTaxRate * income == calculateTax(income.toInt, incomeCaps, marginTaxRate).toDouble)
      while (solutionNotFound) {
        income += 1
        solutionNotFound = overAllTaxRate * income == calculateTax(income.toInt, incomeCaps, marginTaxRate).toDouble
      }
      returnString = s"The income you are looking for is $income"
    }
    returnString
  }



}
