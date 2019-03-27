
// Higher order functions take other functions as parameters or return a function as a result.

// classical map function accepts other functions as parameter
val originalPrices = Seq(10, 40, 80)
val tax20percent = (price: Int) => price * 1.2
val newPrice = originalPrices.map(tax20percent)

// in a shorter form, this could be done like this
val newPrice2 = originalPrices.map(price => price * 1.2)
// or even shorter
val newPrice3 = originalPrices.map(_ * 1.2)



// methods can also be passed as arguments

case class dog (name: String) {
  def barking() = name + " barks"
}

val rex = dog("Rex")
rex.barking()

val whoIsBarkingAtMailman = (whoIsBarking: String) => whoIsBarking + " at the mailman."

whoIsBarkingAtMailman(rex.barking())


// in this example I am using custom findWallaces function on a
// list of Pulp Fiction characters to find Mia and Marsellus
val pulpFiction =  List("Vincent Vega", "Jules Winnfield", "Mia Wallace",
"Winston Wolfe", "Ringo/Pumpkin", "Yolanda/Honey Bunny", "Fabienne",
"Marsellus Wallace", "Lance", "Jody", "Captain Koons", "Butch Coolidge")

val findWallaces = (name: String) => name.contains("Wallace")
pulpFiction.count(findWallaces)


