var funnyAnecdote:String = "A census taker once tried to test me. " +
  "I ate his liver with some fava beans and a nice Chianti."

// get chraracter ar certain index
funnyAnecdote.charAt(3)

// chars() method treats string as a stream of ASCII codes
funnyAnecdote.chars().toArray()
funnyAnecdote.chars().max()
funnyAnecdote.chars().min()
funnyAnecdote.chars().sorted().toArray()
funnyAnecdote.chars().summaryStatistics()

// codePointAt returns ASCII code for specified index
funnyAnecdote.codePointAt(0)
funnyAnecdote.codePointAt(10)

// codePointBefore() method return a code just before specified index
funnyAnecdote.codePointBefore(1)
//funnyAnecdote.codePointBefore(0)    // throws StringIndexOutOfBoundsException

// get a number of characters between two indexes
funnyAnecdote.codePointCount(3, 10)

// codePoints() method returns a stream of ASCII codes
funnyAnecdote.codePoints().limit(10).toArray()    // limit

// compareTo() method compares the length of strings
funnyAnecdote.compareTo("Soylent Green is people!")
funnyAnecdote.compareTo("A census taker once tried to test me. I ate his liver with some fava beans and a nice Chianti.")
funnyAnecdote.compareToIgnoreCase("A census taker once tried to test me. I ate his liver with some fava beans and a nice Chianti.")

// concat() merges two strings, just like plus operator
"A census taker once tried to test me. ".concat("I ate his liver with some fava beans and a nice Chianti.")
"A census taker once tried to test me. " + "I ate his liver with some fava beans and a nice Chianti."

// contains() method checks for argument presence and returns boolean
funnyAnecdote.contains("Chianti")
funnyAnecdote.contains("Cabernet sauvignon")

// ends () method checks sufix of a string for argument
funnyAnecdote.contains("Chianti.")
funnyAnecdote.contains("Cabernet sauvignon.")