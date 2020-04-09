package com.rrb.scala.warmup

import scala.io.StdIn

object PlusMinus extends App {

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]) {
    val arrlen = arr.length
    var positiveValue = 0.0
    var negativeValue = 0.0
    var zeroValue = 0.0
    for (n <- 0 until arrlen) {
      if (arr(n) > 0)
        positiveValue += 1
      else if (arr(n) < 0)
        negativeValue += 1
      else if (arr(n) == 0)
        zeroValue += 1
    }
    val positiveRes: Double = positiveValue / arrlen
    val negativeRes: Double = negativeValue / arrlen
    val zeroRes: Double = zeroValue / arrlen
    println(f"$positiveRes%.6f")
    println(f"$negativeRes%.6f")
    println(f"$zeroRes%.6f")

  }


  val n = StdIn.readLine.trim.toInt
  val arr = StdIn.readLine.split(" ").map(_.trim.toInt)
  plusMinus(arr)
}
