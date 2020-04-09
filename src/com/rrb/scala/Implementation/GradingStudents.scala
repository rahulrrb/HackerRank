package com.rrb.scala.Implementation

import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

object GradingStudents extends App {

  /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    val arrLen = grades.length
    var res = new Array[Int](arrLen)
    var i = 0
    for (n <- 0 until (arrLen)) {
      i = grades(n)
      if (i >= 38 && (i % 5 >= 3)) {
        i += (5 - i % 5)
      }
      res(n) += i
    }
    return res
  }


  val gradesCount = StdIn.readLine.trim.toInt
  val grades = Array.ofDim[Int](gradesCount)
  for (i <- 0 until gradesCount) {
    val gradesItem = StdIn.readLine.trim.toInt
    grades(i) = gradesItem
  }
  val result = gradingStudents(grades)
  println("Res is " + result.mkString("\n"))
}
