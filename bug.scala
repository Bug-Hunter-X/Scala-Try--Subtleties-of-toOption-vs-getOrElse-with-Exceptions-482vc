```scala
import scala.util.Try

class MyClass(val value: Int) {
  def getValue: Int = value
}

object Main extends App {
  val myClass = new MyClass(10)
  val result = Try(myClass.getValue / 0).toOption
  println(result) // Output: None

  val anotherResult = Try(myClass.getValue / 0).getOrElse(0)
  println(anotherResult) // Output: 0
}
```