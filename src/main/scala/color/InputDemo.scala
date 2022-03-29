package color

import scala.io.StdIn

object InputDemo {
  def main(args: Array[String]): Unit = {
    //输入姓名
    println("请输入姓名：")
    val name: String = StdIn.readLine()

    //输入年龄
    println("请输入年龄：")
    val age: Short = StdIn.readShort()

    //输入薪水
    println("请输入薪水：")
    val salary: Double = StdIn.readDouble()

    printf(s"name=$name,age=$age,salary=$salary")


  }
}
