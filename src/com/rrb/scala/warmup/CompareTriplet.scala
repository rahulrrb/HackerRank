package com.rrb.scala.warmup

import java.io.PrintWriter

import scala.io.StdIn

object CompareTriplet extends App {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    var score: Array[Int] = Array(0, 0)

    for (n <- 0 until a.length) {
      if (a(n) > b(n))
        score(0) += 1
      else if (b(n) > a(n))
        score(1) += 1

    }

    return score
  }

  val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
  val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
  val result = compareTriplets(a, b)

  println(result.mkString(" "))


}
