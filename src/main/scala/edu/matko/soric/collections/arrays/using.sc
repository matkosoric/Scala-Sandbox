// increase every value by one
val years = Array [Int](2003, 2007, 2011, 2015, 2019)
val yearsIncreasedByOne = years map (_ + 1)

// access second element
years(1)

// access non-existing element
//years(300)                        // causes ArrayIndexOutOfBoundsException

// element can not be simply added
//years(5) = 3                       // causes ArrayIndexOutOfBoundsException

// reversing order
years.reverse

// number of elements in array
years.length
years.size

// filtering an array
val places = Array[String]("Zagreb", "Zadar", "Veli Iž")
val placesFiltered = places filter (_ != "Veli Iž")

val sequenceOfYears: Seq[Int] = years
