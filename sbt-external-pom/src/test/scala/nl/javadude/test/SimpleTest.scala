package nl.javadude.test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers


class SimpleTest extends FlatSpec with ShouldMatchers {

  "A string" should "have correct length" in {
    "foo".length() should equal(3)
  }
}