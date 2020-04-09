package com.rrb.scala.warmup

import scala.io.StdIn

object AveryBigSum extends App {

  // Complete the aVeryBigSum function below.
  /* def aVeryBigSum(arCount: Int, ar: Array[Long]): Long = {
     var sumValue: Long = 0
     for (n <- 0 to arCount - 1) {
       sumValue += ar(n)
     }
     return sumValue
   }*/

  def aVeryBigSum1(ar: Array[Long]): Long = {
    var sumValue: Long = 0
    val arlength = ar.length
    for (n <- 0 to arlength - 1) {
      sumValue += ar(n)
    }
    return sumValue
  }

  val arCount = StdIn.readLine.trim.toInt
  val ar = StdIn.readLine.split(" ").map(_.trim.toLong)
  /*val result = aVeryBigSum(arCount, ar)
  println(result)*/
  val result = aVeryBigSum1(ar)
  println(result)

}
