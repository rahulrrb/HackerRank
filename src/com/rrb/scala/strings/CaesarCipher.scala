package com.rrb.scala.strings

import scala.io.StdIn

object CaesarCipher extends App {

  // Complete the caesarCipher function below.
  def caesarCipher(s: String, k: Int): String = {
    var str = ""
    for (n <- 0 until (s.length)) {
      if (s.charAt(n).toInt >= 65 && s.charAt(n).toInt <= 90) {
        if (s.charAt(n).toInt + (k % 26) <= 90) str = str + (s.charAt(n).toInt + (k % 26)).toChar.toString
        else str = str + (s.charAt(n).toInt + (k % 26) - 90 + 64).toChar.toString
        // str = ((s.charAt(n).toInt - 'a'.toInt + k) % 26 + 'a'.toInt).toChar.toString
      }
      if (s.charAt(n).toInt >= 97 && s.charAt(n).toInt <= 122) {
        if (s.charAt(n).toInt + (k % 26) <= 122) str = str + (s.charAt(n).toInt + (k % 26)).toChar.toString
        else str = str + (s.charAt(n).toInt + (k % 26) - 122 + 96).toChar.toString
        // str = ((s.charAt(n).toInt - 'A'.toInt + k) % 26 + 'A'.toInt).toChar.toString
      }
      if (s.charAt(n).toInt >= 91 && s.charAt(n).toInt <= 96) {
        str += s.charAt(n)
      }
      if (s.charAt(n).toInt <65 || s.charAt(n).toInt >122) {
        str += s.charAt(n)
      }

    }
    return str
  }


  val n = StdIn.readLine.trim.toInt
  val s = StdIn.readLine
  val k = StdIn.readLine.trim.toInt
  val result = caesarCipher(s, k)
  println(result)

}
