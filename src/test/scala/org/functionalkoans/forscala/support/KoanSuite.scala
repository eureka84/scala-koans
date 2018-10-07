package org.functionalkoans.forscala.support

import org.scalatest.exceptions.TestPendingException
import org.scalatest.{FunSuite, Matchers}
import org.scalatest.matchers.Matcher

trait KoanSuite extends FunSuite with Matchers {

  def koan(name : String)(fun: => Unit) { test(name.stripMargin('|'))(fun) }

  def  __ : Matcher[Any] = {
    throw new TestPendingException
  }

  protected class ___ extends Exception {
    override def toString = "___"
  }

}
