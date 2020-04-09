package com.rrb.scala.warmup

import scala.io.StdIn

object DiagonalDifferences extends App {

  /*
       * Complete the 'diagonalDifference' function below.
       *
       * The function is expected to return an INTEGER.
       * The function accepts 2D_INTEGER_ARRAY arr as parameter.
       */

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here
    val n = arr.length
    val diagonalRes = (0 until n).map(line => arr(line)(line) - arr(line)(n - 1 - line)).sum
    return math.abs(diagonalRes)

  }

  //another method
  def diagonalDifference2(arr: Array[Array[Int]]): Int = {
    // Write your code here
    val arrlen = arr.length
    var first = 0
    var last = 0
    for (n <- 0 until arrlen) {
      first += arr(n)(n)
      last += arr(n)(arrlen - n - 1)
    }

    return math.abs(first - last)

  }


  val n = StdIn.readLine.trim.toInt
  val arr = Array.ofDim[Int](n, n)
  for (i <- 0 until n) {
    arr(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
  }
  val result = diagonalDifference2(arr)
  println(result)

  val result2 = diagonalDifference(arr)
  println(result2)



}
