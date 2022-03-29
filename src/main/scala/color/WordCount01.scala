package color

/**
 * 单词计数：将集合中出现的相同的单词，进行计数，取计数排名前三的结果
 */
object WordCount01 {
  def main(args: Array[String]): Unit = {
    //定义初始需要统计的短语
    val list = List("hello world", "hello scala", "hello java","java learning")

    //将数据扁平化
    val flatList: List[String] = list.flatMap(_.split(" "))

    //对list集合中的数据进行分组
    val groupMap: Map[String, List[String]] = flatList.groupBy(word => word)

    //对分组后的数据进行计数
    val map: Map[String, Int] = groupMap.map(tuple => (tuple._1, tuple._2.length))

    //对计数的数据取前三
//    val headThreeList: List[(String, Int)] = map.toList.sortWith(_._2 > _._2).take(3)

    val topThreeList: List[(String, Int)] = map.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    println(topThreeList)


  }
}
