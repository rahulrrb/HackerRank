package com.rrb.scala.test

object Test2 extends App {

  var res = new Array[Int](10)
  for (i <- 0 until (10)) {
    //println(i)
    res(i)+=i
  }
  println(res.mkString("\n"))
}
