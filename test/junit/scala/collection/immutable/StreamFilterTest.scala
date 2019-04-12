object StreamFilterTest extends App {
  val str = Stream.iterate(1)(_ + 1).filter(_ > 10000000).headOption
  println(str)
}
