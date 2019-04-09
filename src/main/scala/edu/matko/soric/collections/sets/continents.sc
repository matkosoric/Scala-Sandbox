// scala Set does not contain duplicate elements

val world = Set("Asia", "Africa", "Antarctica", "North America", "Europe", "South America", "Australia")
val america = Set("North America","South America")
val superContinents = Set("Avalonia", "Laurentia", "Kenorland")
val northHemisphere = Set("North America", "Africa", "Europe", "Asia")

world("Asia")
world contains "Africa"
world("Pangaea")
//world(23)               does not compile, type mismatch
//world contains 'f'      does not compile, type mismatch

// new element can be added with +
// that results with new set
world + "Gondwana"

// existing element can be removed with -
// this also results with new set
world - "Gondwana"

// subsetOf method can be used to check whether a certain set is contained in different set
america.subsetOf(world)
superContinents.subsetOf(world)

// set operations can be performed with methods: intersect, union, and diff
// identical intersect calls
america intersect northHemisphere
america.intersect(northHemisphere)
america & northHemisphere

// identical diff calls
world diff northHemisphere
world.diff(northHemisphere)
world &~ northHemisphere

// identical union calls
america union northHemisphere
america.union(northHemisphere)
america | northHemisphere

// it is also possible to create a mutable set
val southHemisphere = scala.collection.mutable.Set[String]()
southHemisphere += "South America"
southHemisphere.add("Antarctica")
southHemisphere add "Australia"
println(southHemisphere)

southHemisphere.retain(_.startsWith("A"))
println(southHemisphere)

southHemisphere -= "Australia"
println(southHemisphere)

// remove all elements
southHemisphere.clear
println(southHemisphere)
