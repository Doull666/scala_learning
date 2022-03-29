package color

object DemoString {
  def main(args: Array[String]): Unit = {
    //（1）字符串通过+号拼接
    val name: String = "clover"
    val age: Int = 16
    println(age + "岁的" + name + "在自我学习")

    println(name * 3)

    //(2)使用printf用法，通过%传值
    printf("%d岁的%s在自我学习", age, name)
    println()
    //(3)字符串模板（插值字符串），通过$获取变量值
    println(s"${age}岁的${name}在自我学习")
    val num: Double = 2.345
    println(f"The num is ${num}%2.1f")
    println(raw"The num is ${num}%2.2f")

    //三引号标识字符串，保持多行字符串原格式输出
    val sql: String =
      s"""
         |select
         | from
         |student
         | where name=${name}
         | and age>${age}
         |""".stripMargin
    println(sql)
  }
}
