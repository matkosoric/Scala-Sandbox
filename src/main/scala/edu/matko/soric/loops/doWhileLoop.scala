package edu.matko.soric.loops

object doWhileLoop {

  def main(args: Array[String]) {

    var year = 1990

    // this will print every year between 1990 and 2000
    do {
      println("Current year: " + year)
      year = year + 1
    } while ( {
      year <= 2000
    })

    print("\n")
    // this will still print year once, since block is executed at least once,
    // despite the fact that it is intended to print only years smaller than 1980.
    // in this case, while loop would be a proper choice

    do {
      println("Current year: " + year)
      year = year + 1
    } while ( {
      year <= 1980
    })

  }

}
