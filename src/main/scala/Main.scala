/**
  * Created by Fraser on 06/06/2017.
  */

import java.util.TimeZone

object Main {
  def main(args : Array[String]) : Unit = {
    println(TimeZone.getAvailableIDs.filter(_.size > 1).map(t => t.split('/') last).grouped(10).map(t => t(0)).mkString(", "));
  }
}
