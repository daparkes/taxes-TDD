class TaxCalculator {

  def calculateTax(income: Int, incomeCaps: Array[Int], marginTaxRate: Array[Int]): Int = {
    var stillTaxableIncome = income
    var totalTax = 0
    for ( i <-incomeCaps.length - 1 to 0 by -1) {
      var j = i
      var thisIncomeCap = incomeCaps(j)
      var thisTaxRate = marginTaxRate(j)
      while (thisIncomeCap > stillTaxableIncome) {
        j -= 1
        thisIncomeCap = incomeCaps(j)
        thisTaxRate = marginTaxRate(j)
      }
      println((stillTaxableIncome - thisIncomeCap))
      totalTax += (stillTaxableIncome - thisIncomeCap) / thisTaxRate
    }
    totalTax
//    (income-incomeCaps(0)) / marginTaxRate(0)
  }

}
