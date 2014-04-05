package ninety.nine.scala.project

object P02 {
  def oneButLast[A](ls: List[A]): A = ls match {
    case e :: _ :: Nil => e
    case _ :: tail => oneButLast(tail)
    case _ => throw new NoSuchElementException
  }
  
  def main(args: Array[String]) {
    try {
      println(oneButLast(List("asdf", 12, 33)));
      println(oneButLast(List("asdf", 33)));
      println(oneButLast(List(1)))
      println(oneButLast(List()))
    } catch {
      case e: NoSuchElementException => println("NONONO")
    }
  }
}