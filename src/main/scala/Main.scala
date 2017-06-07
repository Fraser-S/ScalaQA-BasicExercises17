/**
  * Created by Fraser on 06/06/2017.
  */

import java.util.TimeZone

object Main {
  def main(args : Array[String]) : Unit = {
    println( //print the array
      TimeZone.getAvailableIDs.//get time zone id's
      filter(_.length>1). //filter out all the size 1 arrays
      map(t => t.split('/') last). //map the results and split('/')last removes everything before the '/' of each element
      grouped(10). //group results into groups of 10's
      map(t => t(0)). //map the first element in each group
      mkString(", ") //needed for displaying
    )//end of print statement
  }
}
