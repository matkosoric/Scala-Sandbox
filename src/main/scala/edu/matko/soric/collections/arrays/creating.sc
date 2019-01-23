
// create an array of booleans
Array(true, false, true, false, false)

// create an array of integers, with explicitly stating the type
Array [Int](2003, 2007, 2011, 2015, 2019)

// create an array of doubles
Array(1.0, 2.0, 3.0, 4.0)

// create an array of characters
val name = Array('m','a','t', 'k', 'o')

// create an array of strings
Array[String]("Zagreb", "Zadar", "Veli Iž")


// this will work because character can be implicitly casted to
// a numerical value for the ascii code
Array[Short]('m','a','t', 'k', 'o')
Array[Float]('m','a','t', 'k', 'o')
//Array[Boolean] ('m','a','t', 'k', 'o')    // does not compile, type mismatch


