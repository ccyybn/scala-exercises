package io.cy

object LocalFunction {
  def main(args: Array[String]): Unit = {
    val result = compute(List(1, 1, 1), List(2, 2, 2))
    println(result)
  }

  def compute(l1: List[Int], l2: List[Int]) = {
    def sum(list: List[Int]) = list.sum

    sum(l1) + sum(l2)
  }

}
