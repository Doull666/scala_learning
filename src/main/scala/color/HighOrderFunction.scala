package color

object HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    //1.函数作为值进行传递
    val f1 = f(_)
    println(f1(2))

    //2.函数作为参数进行传递
    // 定义二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 2, 3))

    //3.函数作为函数返回值返回
    def f5() = {
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      f6(_)
    }

    println(f5()(6))
  }
}
