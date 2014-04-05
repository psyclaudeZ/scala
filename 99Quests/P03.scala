package ninety.nine.scala.project

object P03 {
  def nth[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, e :: _) => e 
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, _) => throw new NoSuchElementException
  }
}