package lib

import cats.instances.int._
import cats.instances.string._ // for Show
import cats.Show

object CatInstances :

 val showInt: Show[Int] = Show.apply[Int]
 val showString: Show[String] = Show.apply[String]
