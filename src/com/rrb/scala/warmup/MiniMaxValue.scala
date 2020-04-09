package com.rrb.scala.warmup

import scala.io.StdIn

object MiniMaxValue extends App {

  // Complete the miniMaxSum function below.
  def miniMaxSum(arr: Array[Int]) {
    val arrlen = arr.length
    val minValue = arr.min
    val maxValue = arr.max
    var totalSum = 0L
    for (n <- 0 until arrlen) {
      totalSum += arr(n)
    }

    println((totalSum - maxValue) + " " + (totalSum - minValue))
  }


  val arr = StdIn.readLine.split(" ").map(_.trim.toInt)
  miniMaxSum(arr)
}
