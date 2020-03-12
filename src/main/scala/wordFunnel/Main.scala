package wordFunnel

import scala.io.Source

object Main extends App {
  val funnel = new FunnelWord
  println(funnel.findFunnelList("princesses"))
}
