package edu.matko.soric.loops

object whileLoop {

  def main(args: Array[String]) {

/*
     while block will loop through itself until a condition stated at the beginning becomes false
     just like in Java, there is a possibility of zero times going through the block,
     in case a condition evaluates to false at the moment of getting to while keyword
*/

    print("Please enter several different strings, or type 'quit' for exiting the program:")

    var lst = List[String]()
    var input = scala.io.StdIn.readLine()
    while (input != "quit") {
      lst = input :: lst
      input = scala.io.StdIn.readLine()
    }
    print("Elements of a list you created are: ")
    lst.foreach(element => println(element))

  }

}
