package implicits

trait Printable[A] :
  def format(value: A): String

