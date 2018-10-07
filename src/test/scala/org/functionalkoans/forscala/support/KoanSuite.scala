package org.functionalkoans.forscala.support

import org.scalatest._

trait KoanSuite extends FunSuite with Matchers {

  def koan(name : String)(fun: => Unit) { test(name.stripMargin('|'))(fun) }

}
