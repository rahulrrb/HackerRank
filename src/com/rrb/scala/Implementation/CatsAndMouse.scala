package com.rrb.scala.Implementation

object CatsAndMouse extends App {

  // Complete the catAndMouse function below.
  def catAndMouse(x: Int, y: Int, z: Int): String = {
    val a = Math.abs(x - z)
    val b = Math.abs(y - z)
    if(a<b)
      return "Cat A"
    else if(a>b)
      return "Cat B"
    else
      return "Mouse C"
  }


  val stdin = scala.io.StdIn
  val q = stdin.readLine.trim.toInt

  for (qItr <- 1 to q) {
    val xyz = stdin.readLine.split(" ")
    val x = xyz(0).trim.toInt
    val y = xyz(1).trim.toInt
    val z = xyz(2).trim.toInt
    val result = catAndMouse(x, y, z)
    println(result)
  }
}
