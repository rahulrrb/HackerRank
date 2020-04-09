package com.rrb.scala.Implementation

import scala.io.StdIn

object PickingNumbers extends App {
  def pickingNumbers(a: Array[Int]): Int = {
    // Write your code here
    a.sorted
    var arr = new Array[Int](a.length)
    var count = new Array[Int](a.length)

    for (i <- 0 until (a.length)) {
      arr(i) += a(i)
      for (j <- i + 1 until (a.length)) {
        if (Math.abs(a(i) - a(j)) == 0 || Math.abs(a(i) - a(j)) == 1) {
          arr(j) += a(j)
        }
      }
      count(i) = arr.length
    }
    count.sorted
    return count(count.length - 1)
  }


  val n = StdIn.readLine.trim.toInt
  val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
  val result = pickingNumbers(a)
  println(result)

}
