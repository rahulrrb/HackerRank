package com.rrb.scala.strings

import scala.io.StdIn

object StringConstruction extends App {

  // Complete the stringConstruction function below.
  def stringConstruction(s: String): Int = {
    return s.chars().distinct().count().toInt
  }


  val q = StdIn.readLine.trim.toInt
  for (qItr <- 1 to q) {
    val s = StdIn.readLine
    val result = stringConstruction(s)
    println(result)

  }
}
