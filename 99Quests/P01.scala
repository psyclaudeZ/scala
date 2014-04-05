package ninety.nine.scala.project

object P01 {
  def last[A](l: List[A]) : A = l match {
    case e :: Nil => e
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
  
  def main(args: Array[String]) {
    try {
      println(last(List(1, 3, 4, 5)))
      println(last(List(1, 3)))
      println(last(List(9)))
      println(last(List()))
    } catch {
      case e: NoSuchElementException =>
      	println("Empty list.")
    }
  }
}