package com.rrb.scala.warmup

import scala.io.StdIn

object SimpleArraySum extends App {

  /*
      * Complete the simpleArraySum function below.
      */
  def simpleArraySum(ar: Array[Int]): Int = {
    var sumValue = 0
    for (n <- 0 until (ar.length)) {
      sumValue += ar(n)
    }

    return sumValue
  }


  val arCount = StdIn.readLine.trim.toInt
  val ar = StdIn.readLine.split(" ").map(_.trim.toInt)
  val result = simpleArraySum(ar)
  println(result)

}
