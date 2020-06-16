package io.cy

object ValFunction {
  def main(args: Array[String]): Unit = {
    var result = compute(List(1, 1, 1), List(2, 2, 2))
    println(result)

    result = compute(list => list.sum, List(1, 1, 1))
    println(result)
  }


  def compute(l1: List[Int], l2: List[Int]) = {
    val sum = (list: List[Int]) => list.sum
    sum(l1) + sum(l2)
  }

  def compute(function: List[Int] => Int, list: List[Int]) = {
    function.apply(list)
  }
}
