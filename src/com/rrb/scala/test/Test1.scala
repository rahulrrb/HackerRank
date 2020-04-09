package com.rrb.scala.test

import scala.io.StdIn

object Test1 extends App {
  val s = StdIn.readLine
  println(s.replaceAll("[A-Z]", ""))

}
