package com.rrb.scala.warmup

import scala.io.StdIn

object TimeConversion extends App {

  //Complete the timeConversion function below.
  def timeConversion(s: String): String = {
    var timeValue = ""
    if (s.takeRight(2) == "AM" && s.take(2) == "12") {
      timeValue += "00"
    } else if (s.takeRight(2) == "PM" && s.take(2) != "12") {
      timeValue += (s.take(2).toInt + 12).toString
    } else {
      timeValue += s.take(2)
    }

    timeValue += s.drop(2).dropRight(2)
    return timeValue
  }


  val s = StdIn.readLine
  val result = timeConversion(s)
  println(result)


}
