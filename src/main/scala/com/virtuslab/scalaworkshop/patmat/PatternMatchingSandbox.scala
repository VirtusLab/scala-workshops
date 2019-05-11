package com.virtuslab.scalaworkshop.patmat

object PatternMatchingSandbox {

  case class Weight(number: Int, unit: String)

  // TODO you're parsing a file which contains following kinds of lines
  // 1. <number> <unit>
  // 2. <unit> <number>
  // 3. lines in other format which are not important
  // collect all weights
  def collectWeights(lines: Seq[String]): Seq[Weight] = {
    ???
  }
}
