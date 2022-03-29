package tantan01

class Person(job: String, age: Int) {
  def printInfomation(): Unit = {
    println("job:" + job + ",age:" + age)
  }
}

object Person {
  val company: String = "huawei"

  def main(args: Array[String]): Unit = {
    var age=0
    age=20

    val name="daf"


    val tt = new Person("writer", 22)
    val ll = new Person("llll", 32)

    tt.printInfomation()
    ll.printInfomation()

  }
}
