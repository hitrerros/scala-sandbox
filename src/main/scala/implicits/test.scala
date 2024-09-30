package implicits
import implicits.PrintableInstances.given_Printable_String
import implicits.PrintableInstances.given_Printable_Int
import implicits.PrintableInstances.given_Printable_Cat
import implicits.PrintableObject.printer
import PrintableSyntax._

import cat.Cat

@main def HelloWorld(args: String*): Unit =
  printer("d")
  printer(1)
  printer(Cat("cat",2,"yellow"))

  Cat("Garfield", 38, "ginger and black").print