package color

object TestCharType {
  def main(args: Array[String]): Unit = {
    val name: String = "jinlian"
    val age: Int = 18

    println(name + " " + age)
    printf("name:%s age=%d\n", name, age)

    val str=
      """
        |select
        | eid,
        | name
        |from
        | std_enterprise
        |""".stripMargin
    println(str)

    //如果需要对变量进行运算，那么可以加${}
    val s1 =
      s"""
         |select
         | name,
         | age
         |from user
         |where name="$name" and age=${age + 2}
 """.stripMargin
    println(s1)
  }

}
