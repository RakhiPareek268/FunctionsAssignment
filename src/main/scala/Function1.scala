trait Function1[-A, +B] {
  def add(x: Int,y:Int):Int
  //def sumOfList(list: List[Int]):List[Int]
}
object fun {
  val addition: Function1[Int, Int] = new Function1[Int,Int] {
    def add(x: Int, y:Int): Int={
      val temp=x+y
      temp
      //addition.add(2,3)
    }
  }
}

//object main{
//  def main(args: Array[String]): Unit = {
//    val obj= fun
//    print(obj.addition.add(9,3))
//  }
//}

