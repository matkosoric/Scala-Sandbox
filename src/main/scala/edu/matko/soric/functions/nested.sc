import scala.collection.immutable.ListMap
// nested function is a function inside another function

// in this case, I will create one function that will sort Jack Nicholson's movies
// by release year, and then calculate the number of characters in the most recent
// movie title
val jackNicholsonMovies = Map("One Flew Over the Cuckoo's Nest" -> 1975,
                              "Five Easy Pieces"-> 1970,
                              "Chinatown" -> 1974,
                              "Carnal Knowledge"-> 1971,
                              "The Shining" -> 1980,
                              "The Last Detail"-> 1973)

def sortAndCalculateCharacters (movies :Map[String, Int]) = {

    def calculateCharacters (title :String) = title.length

    val sorted = ListMap(movies.toSeq.sortWith(_._2 > _._2):_*).zipWithIndex.toList

    val numberOfCharactersInMostRecentTitle = calculateCharacters(sorted.head._1._1)

    numberOfCharactersInMostRecentTitle

}

println("The number of characters in the most recent movie is: " + sortAndCalculateCharacters(jackNicholsonMovies)
)

