import implicits.PrintableInstances.{given_Printable_Date, given_Printable_Int, given_Printable_MyCat, given_Printable_String}
import implicits.PrintableObject.printer
import model.MyCat
import implicits.PrintableSyntax.PrintableOps
import lib.CatInstances.showInt

import java.util.Date

@main def HelloWorld(args: String*): Unit =
  printer("d")
  printer(1)
  printer(MyCat("model",2,"yellow"))

  MyCat("Garfield", 38, "ginger and black").print
  new Date().print

  val intAsString: String =
    showInt.show(34)
