package com.rrb.scala.warmup

import scala.io.StdIn

object BirthdayCakeCandles extends App {

  // Complete the birthdayCakeCandles function below.
  def birthdayCakeCandles(ar: Array[Int]): Int = {
    val maxValue = ar.max
    var countValue = 0
    for (n <- 0 until (ar.length)) {
      if (maxValue == ar(n))
        countValue += 1
    }
    return countValue

  }


  val arCount = StdIn.readLine.trim.toInt

  val ar = StdIn.readLine.split(" ").map(_.trim.toInt)
  val result = birthdayCakeCandles(ar)
  println(result)

}
