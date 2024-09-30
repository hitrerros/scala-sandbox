package implicits

object PrintableSyntax:

 // https://docs.scala-lang.org/overviews/core/implicit-classes.html

 implicit class PrintableOps[A](value: A):
    def format(implicit p: Printable[A]): String =
      p.format(value)

    def print(implicit p: Printable[A]): Unit =
      println(format(p))


