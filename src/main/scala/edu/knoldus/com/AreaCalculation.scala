package edu.knoldus.com

class AreaCalculation {

  def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {
    shape match {
      case "Parallelogram" => s"Area of Parallelogram is ${f(first, second)}"
      case "Rectangle" => s"Area of rectangle is ${f(first, second)}"
      case "rhombus" => s"Area of rhombus ${f(first, second)}"
      case _ => "invalid shape"


    }
  }
}

object AreaCalculation{
  def main(args: Array[String]): Unit = {
    val area = new AreaCalculation
    println(area.area(shape = "Parallelogram", first =10,second = 11, (base, height) => base*height))
    println(area.area(shape = "Rectangle", first = 50,second = 40, (length, breadth) => length*breadth))
    println(area.area(shape = "rhombus", first=75, second = 50, (diagonal_one,diagonal_two) => diagonal_one*diagonal_two ))


  }
}
