
// scala List is a ordered collections of elements of certain type

// here are several ways of creating a list

val days = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

val daysShort = "Mon" :: "Tue" :: "Wed" :: "Thu" :: "Fri" :: "Sat" :: "Sun" :: Nil

val dayNumbers = List(1,2,3,4,5,6,7)

val yearIndex = List.range(0, 365)

List.tabulate(10)(a => a*5)


daysShort.head
yearIndex.length

dayNumbers.init                 // takes all elements except the last one
dayNumbers.tail                 // takes all elements except the first one
dayNumbers.find(a => a>4)

days(1)
days.take(3)
days.takeRight(3)
days.filter(_.startsWith("S"))
days.drop(2)
days.reverse
days.slice(4,6)
days.map(day => day.length)
days.flatMap(day => List(day, day.charAt(0)))