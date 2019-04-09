
// Scala tuples have a fixed number of elements, each element having its own type
// this is a tuple of seven elements

val hawking = ("Stephen", "William", "Hawking", 1942, 2018, "Properties of Expanding Universes", 1966)

// tuples are types that go from Tuple2, Type3, Type4, etc. to Tuple22
// in this case, we have a Tuple7 type
println(hawking.getClass)

// elements in a tuple can be accessed by index
println(hawking._1)
println(hawking._3)
println(hawking._7)

// tuple can be broken to building elements with pattern matching
val (firstName, middleName, lastName, birthYear, deathYear, thesisTitle, thesisYear ) = hawking
println("First name: " + firstName)
println("Thesis: " + thesisTitle)


// token -> creates 2-tuple
val life = 1942 -> 2018
println(life.getClass)

// however, several -> do not create a multi-element tuple, but tuples within tuples
val years = 1942 -> 2018 -> 1966
println(years)
println(years.getClass)

// tuples can be passed to a function like this

def printPersonInformation (name: (String, String, String), years: (Int, Int)): Unit = {
  println("Full name: " + name)
  println("Life span: " + years)
}

printPersonInformation(("Stephen", "William", "Hawking"), (1942, 2018))