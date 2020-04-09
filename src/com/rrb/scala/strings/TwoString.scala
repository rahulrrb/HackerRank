package com.rrb.scala.strings

import scala.io.StdIn

object TwoString extends App {

  // Complete the twoStrings function below.
  def twoStrings(s1: String, s2: String): String = {
    val str1 = s1.toLowerCase
    val str2 = s2.toLowerCase
    println(str1.toSet)
    println(str2.toSet)

    if ((str1.toSet & str2.toSet).size >= 1)
      return "YES"
    else
      return "NO"

    // return s1 + " " + s2

  }


  val q = StdIn.readLine.trim.toInt
  for (qItr <- 1 to q) {
    val s1 = StdIn.readLine
    val s2 = StdIn.readLine
    val result = twoStrings(s1, s2)
    println(result)
  }
}
