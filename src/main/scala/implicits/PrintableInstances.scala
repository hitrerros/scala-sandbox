package implicits

import model.MyCat

import java.util.Date

object PrintableInstances:

  given Printable[String] with
    def format(input: String): String = input

  given Printable[Int] with
    def format(input: Int): String = input.toString

  given Printable[MyCat] with
    def format(input: MyCat): String = s"${input.name} is ${input.age} years old and its color ${input.color}"

  given Printable[java.util.Date] with
    def format(input: Date): String = input.toString
