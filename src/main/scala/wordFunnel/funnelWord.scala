package wordFunnel

import scala.io.Source

object funnelWord {
  def readFile: Iterator[String] = {
    val bufferedSource = Source.fromFile("enable1.txt")
    bufferedSource.getLines
  }

  def funnelWord(startingWord: String): Int = {
    val words = readFile
    var tempWord = startingWord
    var count = 0
    for (i <- 0 until tempWord.length) {
      var wordSB = new StringBuilder(tempWord)
      wordSB = wordSB.deleteCharAt(i)
      println(wordSB.toString)
      for (word <- words) {
        if (word == wordSB.toString) {
          println(word)
          count += 1
          tempWord = wordSB.toString
        }
      }
    }
    count
  }
}
