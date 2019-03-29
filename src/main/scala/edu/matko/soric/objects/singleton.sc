
// An object is a class that has exactly one instance.

// Benjamin was the name of the last known Tasmanian tiger, what is called endling in biology

object Benjamin {
  def hunting(prey: String): Unit = println(s"I am hunting for $prey.")
}

Benjamin.hunting("birds")
Benjamin.hunting("wombats")
