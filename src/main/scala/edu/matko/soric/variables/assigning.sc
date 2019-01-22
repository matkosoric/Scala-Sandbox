// variable without values are possible only as a part of the class

//val favoriteMovie: String           // does not compile
//val siblings: Int                   // does not compile
//val averageSleepingHours: Float     // does not compile
//val pregnant: Boolean               // does not compile

class WeirdPersonalDetails (
val favoriteMovie :String,
val siblings :Int,
val averageSleepingHour :Float,
val pregnant :Boolean) {}


// initializing variables
val name :String = "Matko"
var surname :String = "Sorić"

// val is immutable
//name = "John"   // does not compile

// var is mutable
surname = "Wayne"


// simultaneous assignments
val (city :String, yearOfBirth :Int) = Pair("Berlin", 1995)
print(city)
print(yearOfBirth)

