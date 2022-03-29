package color

import scala.io.StdIn

object StdInDemo {
  def main(args: Array[String]): Unit = {
    //输入信息
    println("请输入您的名字：")
    val name: String = StdIn.readLine()
    println("请输入年龄：")
    val age: Int = StdIn.readInt()

    println(s"欢迎${age}岁的${name}登录！！！")
  }
}
