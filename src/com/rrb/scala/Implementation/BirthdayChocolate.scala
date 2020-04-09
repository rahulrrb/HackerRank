package com.rrb.scala.Implementation

import scala.io.StdIn

object BirthdayChocolate extends App {

  // Complete the birthday function below.
  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    var countValue = 0;
    var sumValue = 0
    for (i <- 0 until (s.length)) {
      sumValue += s(i)
      println(m-1+" "+s(i))
      if (i >= m - 1) {
        if (sumValue % d == 0)
          countValue += 1
        sumValue -= s(i - (m - 1))
        println(s(i - (m - 1)))
      }
    }
    return countValue

  }


  val n = StdIn.readLine.trim.toInt
  val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
  val dm = StdIn.readLine.replaceAll("\\s+$", "").split(" ")
  val d = dm(0).toInt
  val m = dm(1).toInt
  val result = birthday(s, d, m)

  println(" fgdhd"+result)


}
