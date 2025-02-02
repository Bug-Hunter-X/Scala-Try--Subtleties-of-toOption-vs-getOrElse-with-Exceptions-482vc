# Scala Try: Subtleties of toOption vs getOrElse with Exceptions

This example demonstrates the behavior of Scala's `Try` monad when dealing with exceptions, specifically the nuances between `toOption` and `getOrElse`.

The `bug.scala` file shows a scenario where dividing by zero is handled using both approaches. `toOption` returns `None` in case of an exception, while `getOrElse` returns a default value (0 in this case).  This highlights how choosing between these methods impacts error handling.

The `bugSolution.scala` file (if needed) could offer alternative, more robust error handling strategies beyond `Try` such as pattern matching with a `Try` value or using a custom exception handling function.