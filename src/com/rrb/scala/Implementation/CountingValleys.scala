package com.rrb.scala.Implementation

object CountingValleys extends App {


  // Complete the countingValleys function below.
  def countingValleys(n: Int, s: String): Int = {
    var valley = 0
    var seaLevel = 0
    for (i <- 0 until (s.length)) {
      if (s(i) == 'D') {
        seaLevel -= 1
      } else {
        seaLevel += 1
      }
      if (seaLevel == 0 && s(i) == 'U') {
        valley += 1
      }
    }
    return valley
  }

  val stdin = scala.io.StdIn
  val n = stdin.readLine.trim.toInt
  val s = stdin.readLine
  val result = countingValleys(n, s)
  println(result)
}
