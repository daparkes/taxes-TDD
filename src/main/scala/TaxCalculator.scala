class TaxCalculator {

  def calculateTax(income: Int, incomeCaps: Array[Int], marginTaxRate: Array[Int]): Int = {
    var stillTaxableIncome = income
    var totalTax = 0
    for ( i <-incomeCaps.length to 1 by -1) {
      var j = i
      println(i)
      var thisIncomeCap = incomeCaps(j)
      var thisTaxRate = marginTaxRate(j-1)
      while (thisIncomeCap > stillTaxableIncome) {
        if (j>0) {
          j -= 1
          thisIncomeCap = incomeCaps(j)
          thisTaxRate = marginTaxRate(j-1)
        }
      }
      println((stillTaxableIncome - thisIncomeCap))
      totalTax += (stillTaxableIncome - thisIncomeCap) / thisTaxRate
    }
    totalTax
//    (income-incomeCaps(0)) / marginTaxRate(0)
  }

}
