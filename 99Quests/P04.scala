package ninety.nine.scala.project

object P04 {
  def length[A](ls: List[A]): Int = ls match {
    case Nil => 0
    case _ :: tail => length(tail) + 1
    case _ => throw new NoSuchElementException
  }
}