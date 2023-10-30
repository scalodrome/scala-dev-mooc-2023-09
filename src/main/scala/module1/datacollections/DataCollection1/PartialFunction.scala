package module1.datacollections.DataCollection1

object Collect{

  val parseRange: PartialFunction[Any, Int] ={
    case x: Int if x>10 => x+1
  }

  def main(args: Array[String]): Unit ={
    List(15, 3, "dfsdfg").collect(parseRange).foreach(println)

  }

}


