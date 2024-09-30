package implicits

object PrintableObject :

 def format[A](input: A)(using printable: Printable[A]) : String = 
   printable.format(input)
 
 def printer[A](input: A)(using printable: Printable[A]) : Unit =
   println(printable.format(input))