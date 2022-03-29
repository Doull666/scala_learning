package tantan01

class Student(name: String, age: Int) {
  def printInfo():Unit={
    println(name+"  "+age+"  "+Student.school)
  }
}

//引入伴生对象
object Student{
  val school:String="atguigu"

  def main(args: Array[String]): Unit
  =
  {
    val lilin = new Student("lilin", 15)
    val juantan = new Student("juantan", 20)
    lilin printInfo()
    juantan printInfo()
  }
}


