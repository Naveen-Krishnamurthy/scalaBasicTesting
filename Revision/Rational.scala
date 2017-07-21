class Rational(n: Int, d: Int) {
    val numer: Int = n
    val denom: Int = d
    def add(that: Rational): Rational =
      new Rational(numer * that.denom.+(that.numer * denom),
                   denom * that.denom)
    def sub(that: Rational): Rational =
      new Rational(numer * that.denom - that.numer * denom,
                   denom * that.denom)
    def mul(that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)
    def div(that: Rational): Rational =
      new Rational(numer * that.denom, denom * that.numer)
}

object testRational {
  def main(args: Array[String]): Unit = {
    val tesrRational:Rational=new Rational(3,4)
    print(testRational)
  }
}


object testForloop {
  def main(args: Array[String]): Unit = {
    val testlist: List = [1,2,3,4,5,6]
    println(testlist)

    for(item <- testlist) {
      println(item)
    }
  }
}