package com.rrb.scala.strings

import scala.io.StdIn
import scala.math.max

object StrongPassword extends App {
  // Complete the minimumNumber function below.
  def minimumNumber(n: Int, password: String): Int = {
    // Return the minimum number of characters to make the password strong

    var countValue = 0
    println(password.matches("(.*(\\d).*)"))
    println(password.matches("(.*(\\W).*)"))
    println(password.matches("(.*[A-Z]).*"))
    println(password.matches("(.*[a-z]).*"))

    if (password.matches("(.*(\\d).*)") == false) countValue += 1
    if (password.matches("(.*[A-Z]).*") == false) countValue += 1
    if (password.matches("(.*[a-z]).*") == false) countValue += 1
    if (password.matches("(.*(\\W).*)") == false) countValue += 1

    println(countValue)
    return max(countValue, 6 - n)


  }


  val n = StdIn.readLine.trim.toInt
  val password = StdIn.readLine
  val answer = minimumNumber(n, password)
  println(answer)


}
