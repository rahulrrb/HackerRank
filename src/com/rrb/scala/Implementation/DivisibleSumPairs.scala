package com.rrb.scala.Implementation

import scala.io.StdIn

object DivisibleSumPairs extends App {
  // Complete the divisibleSumPairs function below.
  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    var countValue = 0;
    for (i <- 0 until (ar.length)) {
      for (j <- 0 until (ar.length)) {

        if (i < j && ((ar(i) + ar(j))% k == 0))
          countValue += 1
      }
    }
    return countValue
  }


  val nk = StdIn.readLine.split(" ")
  val n = nk(0).trim.toInt
  val k = nk(1).trim.toInt
  val ar = StdIn.readLine.split(" ").map(_.trim.toInt)
  val result = divisibleSumPairs(n, k, ar)

  println(result)

}
