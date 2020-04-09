package com.rrb.scala.Implementation

object BreakingTheRecords extends App {


  // Complete the breakingRecords function below.
  def breakingRecords(scores: Array[Int]): Array[Int] = {
    var maxScore = scores(0)
    var minScore = scores(0)
    var maxCount = 0
    var minCount = 0
    for (n <- scores) {
      if (n > maxScore) {
        maxScore = n
        maxCount += 1
      }
      if (n < minScore) {
        minScore = n
        minCount += 1
      }
    }
    return Array(maxCount, minCount)
  }


  val stdin = scala.io.StdIn
  val n = stdin.readLine.trim.toInt
  val scores = stdin.readLine.split(" ").map(_.trim.toInt)
  val result = breakingRecords(scores)
  println(result.mkString(" "))
}
