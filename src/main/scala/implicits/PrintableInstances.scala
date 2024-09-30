package implicits

import cat.Cat

object PrintableInstances:

  given Printable[String] with
    def format(input: String): String = input

  given Printable[Int] with
    def format(input: Int): String = input.toString

  given Printable[Cat] with
    def format(input: Cat): String = s"${input.name} is ${input.age} years old and its color ${input.color}"

