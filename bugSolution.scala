```scala
import scala.util.Try

class MyClass(val value: Int) {
  def getValue: Int = value
}

object Main extends App {
  val myClass = new MyClass(10)
  val result = Try(myClass.getValue / 0).toOption
  println(result) // Output: None
  //Improved Handling
  val safeDivision = Try(myClass.getValue / 0).toOption.getOrElse(0)
  println(safeDivision)//Output 0

  val anotherResult = Try(myClass.getValue / 0).getOrElse(0)
  println(anotherResult) // Output: 0
  //Pattern Matching Example
  Try(myClass.getValue / 0) match {
    case scala.util.Success(value) => println(s"Success: $value")
    case scala.util.Failure(exception) => println(s"Failure: ${exception.getMessage}")
  }
}
```