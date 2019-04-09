import scala.collection.SortedSet

// sortedSet
var tarantino = SortedSet("Reservoir Dogs", "Pulp Fiction", "Django Unchained", "Inglourious Basterds", "The Hateful Eight", "Death Proof")

tarantino += "Jackie Brown"
println(tarantino)

tarantino ++= SortedSet[String]("Kill Bill 1.", "Kill Bill 2.")
println(tarantino)




