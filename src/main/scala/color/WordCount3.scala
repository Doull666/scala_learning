package color

object WordCount3 {
  def main(args: Array[String]): Unit = {
    //准备需要进行统计的数据
    val list = List(("Hello Scala Spark World ", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    //对数据进行扁平化
    val flatList: List[(String, Int)] = list.flatMap {
      t => {
        val arr: Array[String] = t._1.split(" ")
        arr.map((_, t._2))
      }
    }


    //将扁平化后的相同数据进行分组
    val map: Map[String, List[(String, Int)]] = flatList.groupBy(_._1)


    /*//将分组后的数据进行相加
    val map1: Map[String, List[Int]] = map.mapValues(_.map(_._2))

    val map2: Map[String, Int] = map1.map(t => (t._1, t._2.sum))

    val topThree: List[(String, Int)] = map2.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)

    println(topThree)*/


  }
}
