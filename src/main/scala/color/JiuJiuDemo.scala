package color

class JiuJiuDemo {

  //打印九九乘法表
  def jiujiu(): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(j + "*" + i + "=" + (i * j) + "\t")
      }
      println()
    }
  }

}

object  JiuJiuDemo{
  def main(args: Array[String]): Unit = {
    println("打印99乘法表")
    val demo = new JiuJiuDemo
    demo.jiujiu()
  }
}