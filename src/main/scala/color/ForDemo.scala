package color
import scala.collection.immutable

object ForDemo {
  def main(args: Array[String]): Unit = {
    //1.范围遍历
    for (i <- 1 to 10) {
      println(s"${i}.hello world!!!")
    }

    // 不包含边界
    for (i <- 1 until 10) {
      println(s"${i}. hello world")
    }

    //2.集合遍历
    for (i <- Array(12, 13, 24)) {
      println(i)
    }
    for (i <- List(12, 13, 24)) {
      println(i)
    }
    for (i <- Set(12, 13, 24)) {
      println(i)
    }

    //3.循环守卫
    println("+++++++++++++++++++++++++")
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    //4.循步长
    println("=================")
    for (i <- 10 to 1 reverse) {
      println(i)
    }

    //5.循环嵌套
    println("--------------------------------")
    for (i <- 1 to 4; j <- 1 to 5) {
      println(s"i=${i},j=${j}")
    }


    //6.99乘法表
    println("---------------------------------")
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${j * i} \t")
      if (j == i) println()
    }

    //7.引入变量
    println("-------------------------------------")
    for (i <- 1 to 10 by 2; j = i - 1) {
      println(s"i=${i},j=${j}")
    }

    //8.九层妖塔
    println("-----------------------------------")
    for (i <- 1 to 9; stars = 2 * i - 1; spaces = 9 - i) {
      println(" " * spaces + "*" * stars)
    }
    //9.循环返回值
    println("---------------------------------------")
    val b: immutable.IndexedSeq[Int] = for (i <- 1 to 9) yield i * i
    println(b)
  }
}
