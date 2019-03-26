
// Higher order functions take other functions as parameters or return a function as a result.

val originalPrices = Seq(10, 40, 80)
val tax20percent = (x: Int) => x * 1.2
val newPrice = originalPrices.map(tax20percent)