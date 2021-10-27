trait Function2{
  def sumOfList(list: List[Int]):Int
}
object fun2 {
  //val xs: Function2[List[Int]] = new Function2[List[Int]] {
  val xs: Function2 = new Function2 {
    def sumOfList(list: List[Int]): Int = {
      val temp = List(1,2,7)
      val result = temp.sum
      result
    }
  }
}

//object main{
//  def main(args: Array[String]): Unit = {
//    val obj= fun2
//    print(obj.xs.sumOfList(List()))
//  }
//}

