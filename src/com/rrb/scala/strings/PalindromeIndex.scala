package com.rrb.scala.strings

import scala.collection.immutable.Range
import scala.io.StdIn

object PalindromeIndex extends App {

  def isPalindrome(s: String): Boolean = {
    val strLen = s.length
    for (n <- 0 until (strLen / 2)) {
      if (s(n) != s(strLen - n - 1))
        return false
    }
    return true
  }

  // Complete the palindromeIndex function below.
  def palindromeIndex(s: String): Int = {
    val strLen = s.length
    for (n <- 0 until ((strLen + 1) / 2)) {
      if (s(n) != s(strLen - n - 1)) {
        if (isPalindrome(s.slice(0, n) + s.slice(n + 1, strLen)))
          return n
        else return (strLen - n - 1)
      }
    }

    return -1
  }

  val q = StdIn.readLine.trim.toInt
  for (qItr <- 1 to q) {
    val s = StdIn.readLine
    val result = palindromeIndex(s)
    println(result)
  }

}
