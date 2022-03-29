package color

object CollectOperate {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(12, 34, 22, 44)

    //对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperate(array:Array[Int],op:Int=>Int):Array[Int]={
      for(elem <- array) yield op(elem)
    }
    //定义一个加一操作
    def addOne(elem:Int):Int={
      elem+1
    }

    val arr: Array[Int] = arrayOperate(array, addOne)

    println(arr.mkString(","))

    //使用匿名函数传入
    val arr1: Array[Int] = arrayOperate(array, _ * 2)
    println(arr1.mkString(","))
  }
}
