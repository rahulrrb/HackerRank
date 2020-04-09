package com.rrb.scala.Implementation

import scala.io.StdIn

object Kangaroo extends App {

  // Complete the kangaroo function below.
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    if (v1 == v2) return "NO"
    else if (v1 > v2) {
      if ((Math.abs(v2 - v1) != 0) && (x2 - x1) % (Math.abs(v2 - v1)) == 0) return "YES"
      else return "NO"
    }
    else if (v1 < v2) {
      return "NO"
    }
    else
      return "YES"
  }


  val x1V1X2V2 = StdIn.readLine.split(" ")
  val x1 = x1V1X2V2(0).trim.toInt
  val v1 = x1V1X2V2(1).trim.toInt
  val x2 = x1V1X2V2(2).trim.toInt
  val v2 = x1V1X2V2(3).trim.toInt
  val result = kangaroo(x1, v1, x2, v2)
  println(result)


}
