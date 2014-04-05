package ninety.nine.scala.project

object P05 {
  def reverse[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case e :: tail => reverse(tail) ++ List(e)
  }
}