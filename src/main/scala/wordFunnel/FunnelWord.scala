package wordFunnel

import scala.collection.mutable.ListBuffer
import scala.io.Source

class FunnelWord {
  def readFile: Iterator[String] = {
    val bufferedSource = Source.fromFile("enable1.txt")
    bufferedSource.getLines
  }

//  def funnelWord(startingWord: String): Int = {
//    val words = readFile
//    var tempWord = startingWord
//    var count = 0
//    while (tempWord.length > 0) {
//      var wordSB = new StringBuilder(tempWord)
//      wordSB = wordSB.deleteCharAt(i)
//      println(wordSB.toString)
//      for (word <- words) {
//        if (word == wordSB.toString) {
//          println(word)
//          count += 1
//        }
//      }
//      tempWord = wordSB.toString
//    }



//    count
//  }

  def determineIfWord(word: String): Boolean = {
    val words = readFile
    var isWord = false
    for (line <- words) {
      if (line == word) {
        isWord = true
      }
    }
    isWord
  }

  def findFunnelList(startingWord: String): List[String] = {
    val words = readFile
    var tempListBuffer = new ListBuffer[String]
    var wordSB = new StringBuilder(startingWord)
    for (i <- 0 until startingWord.length) {
      var wordInList = false
      words foreach(word =>  {
        if (word == wordSB.deleteCharAt(i).toString) {
          tempListBuffer += wordSB.deleteCharAt(i).toString
        }
      })
    }
    println(tempListBuffer)
    tempListBuffer.toList
  }
}
