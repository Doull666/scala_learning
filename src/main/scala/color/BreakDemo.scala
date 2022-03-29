package color

import scala.util.control.Breaks

object BreakDemo {
  def main(args: Array[String]): Unit = {
    //使用Scala中的Breaks类的break方法，实现异常的抛出与捕捉
    Breaks.breakable(
      for (i <- 1 to 5 ){
        if(i==3){
          Breaks.break()
        }
        println(i)
      }
    )
  }
}
