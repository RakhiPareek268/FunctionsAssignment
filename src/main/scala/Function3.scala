trait Function3 {
  def higherOrderFunction(f: (Int => Int), num : Int):Int
}
object fun3 {
  def func(i:Int):Int=i
  val hof: Function3 = new Function3 {
    def higherOrderFunction(f: Int => Int, num: Int): Int = f(num)
  }
}
object main extends App {
    val obj=fun3
    print(obj.hof.higherOrderFunction(obj.func,8))
}

