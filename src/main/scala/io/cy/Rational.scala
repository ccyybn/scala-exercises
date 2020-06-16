package io.cy

case class Rational(n: Int, d: Int) {
  require(d != 0)
  var number = n
  var denom = d

  def this(n: Int) = this(n, 1)

  def add(that: Rational) = new Rational(number * that.number + that.denom * denom, denom * that.denom)

  def +(that: Rational) = add(that)

  override def toString: String = number + "/" + denom

  def update(index: String, value: Int) = index match {
    case "number" => number = value
    case "denom" => denom = value
    case _ => throw new IllegalArgumentException()
  }
}


object Rational {
  def main(args: Array[String]): Unit = {
    testAdd()
    testCase()
    testUpdate()
  }

  def testUpdate() = {
    val v = Rational(1, 1)
    v("number") = 2
    v("denom") = 2
    v("a") = 2
    println("testUpdate: " + v)
  }

  def testCase() = {
    val matchVal = Rational(2, 3) match {
      case Rational(n, d) => println("testCase:" + n + '/' + d)
    }
    println(matchVal)
  }

  def testAdd() = {
    val a = Rational(1, 2)
    val b = Rational(1, 3)
    val c = a + b
    println("testAdd: " + c)
  }
}