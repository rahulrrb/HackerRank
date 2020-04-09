package com.rrb.scala.warmup

import scala.io.StdIn

object StaircaseProblem extends App {

  // Complete the staircase function below.
  def staircase(n: Int) {
    for (i <- 1 to n) {
      println(" " * (n - i) + "#" * i)
    }

  }


  val n = StdIn.readLine.trim.toInt
  staircase(n)

}
