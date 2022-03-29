package color

object WordCount2 {
  def main(args: Array[String]): Unit = {
    //准备需要进行统计的数据
    val list = List(("Hello Scala Spark World ", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    //对于原始数据进行转换
    val mapList: List[String] = list.map(t => (t._1.trim + " ") * t._2)

    //对mapList进行扁平化操作
    val flatList: List[String] = mapList.flatMap(_.split(" "))

    //对扁平化后的数据进行格式变化
    val groupMap: Map[String, Int] = flatList.groupBy(word => word).map(t => (t._1, t._2.length))

    //对格式变化后的数据倒叙取前三
    val result: List[(String, Int)] = groupMap.toList.sortWith((t1, t2) => t1._2 > t2._2).take(3)

    println(result)


  }
}
