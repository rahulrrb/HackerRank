package com.rrb.scala.strings

import scala.io.StdIn

object SuperReducedString extends App {


  // Complete the superReducedString function below.
  def superReducedString(s: String): String = {
    var str = s
    var n = 1
    while (n < (str.length)) {
      if ((str.charAt(n)).toString == (str.charAt(n - 1)).toString) {
        str = str.substring(0, n - 1) + str.substring(n + 1);
        n = 0;
      }
      n = n + 1
    }

    if (str.length == 0) return "Empty String"
    else return str

  }


  val s = StdIn.readLine
  val result = superReducedString(s)
  println(result)

}
