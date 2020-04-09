package com.rrb.scala.Implementation

object AppleAndOrange extends App {

  // Complete the countApplesAndOranges function below.
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    var appleCount = 0
    var orangeCount = 0
    for (app <- apples) {
      if (s <= (a + app) && (a + app) <= t)
        appleCount += 1
    }
    for (org <- oranges) {
      if (s <= (b + org) && (b + org) <= t)
        orangeCount += 1
    }

    println(appleCount)
    println(orangeCount)
  }


  val stdin = scala.io.StdIn
  val st = stdin.readLine.split(" ")
  val s = st(0).trim.toInt
  val t = st(1).trim.toInt
  val ab = stdin.readLine.split(" ")
  val a = ab(0).trim.toInt
  val b = ab(1).trim.toInt
  val mn = stdin.readLine.split(" ")
  val m = mn(0).trim.toInt
  val n = mn(1).trim.toInt
  val apples = stdin.readLine.split(" ").map(_.trim.toInt)
  val oranges = stdin.readLine.split(" ").map(_.trim.toInt)
  countApplesAndOranges(s, t, a, b, apples, oranges)


}
