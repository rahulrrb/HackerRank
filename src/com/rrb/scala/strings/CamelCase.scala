package com.rrb.scala.strings

import scala.io.StdIn

object CamelCase extends App {

  // Complete the camelcase function below.
  def camelcase(s: String): Int = {
    return (s.length() - s.replaceAll("[A-Z]", "").length() + 1)

  }


  val s = StdIn.readLine
  val result = camelcase(s)
  println(result)

}
