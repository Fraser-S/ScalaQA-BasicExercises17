/**
  * Created by Fraser on 06/06/2017.
  */

import java.util.TimeZone

object Main {
  def main(args : Array[String]) : Unit = {
    println(java.util.TimeZone.getAvailableIDs.filter(t => t.contains("")).map(t => t.split('/') last).sortWith(_ < _).deep.mkString(", "))
  }
}
