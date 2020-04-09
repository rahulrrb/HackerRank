package com.rrb.scala.Implementation

import scala.util.control.Breaks._

object FindDigits extends App {


  // Complete the findDigits function below.
  def findDigits(n: Int): Int = {
    var countValue = 0
    var flag = n

    while (flag > 0) {
      if (flag % 10 != 0 && n % (flag % 10) == 0)
        countValue += 1
      flag = flag / 10;
    }
    return countValue
  }


  val stdin = scala.io.StdIn
  val t = stdin.readLine.trim.toInt
  for (tItr <- 1 to t) {
    val n = stdin.readLine.trim.toInt
    val result = findDigits(n)
    println(result)
  }
}