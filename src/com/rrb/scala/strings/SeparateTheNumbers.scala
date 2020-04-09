package com.rrb.scala.strings

import scala.io.StdIn
import scala.util.control.Breaks._

object SeparateTheNumbers extends App {

  // Complete the separateNumbers function below.
  def separateNumbers(s: String) {
    val strLen = s.length

    for (n <- 0 until (strLen)) {
      var results = false
      var firstValue = -1L
      for (i <- 1 until (strLen / 2)) {
        var x = s.substring(0, i).toLong
        firstValue = x
        var str = x.toString
        while (str.length < strLen) {
          str += (1 + x).toString
        }
        if (str.equals(s)) {
          results = true
          break;
        }
      }
      if (results) println("YES")
      else println("NO")
    }

  }

  val q = StdIn.readLine.trim.toInt
  for (qItr <- 1 to q) {
    val s = StdIn.readLine
    separateNumbers(s)
  }

}
