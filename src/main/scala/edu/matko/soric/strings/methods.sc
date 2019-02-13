var funnyAnecdote:String = "A census taker once tried to test me. " +
  "I ate his liver with some fava beans and a nice Chianti."

// get character ar certain index
funnyAnecdote.charAt(3)

// chars() method treats string as a stream of ASCII codes
funnyAnecdote.chars()
funnyAnecdote.chars().toArray
funnyAnecdote.chars().max()
funnyAnecdote.chars().min()
funnyAnecdote.chars().sorted().toArray()
funnyAnecdote.chars().summaryStatistics()

// getBytes() also returns ASCII codes, but as an array of byte codes
funnyAnecdote.getBytes()

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

// indexOf() finds first occurrence of a specified character or its ASCII code
print("indexOf()")
funnyAnecdote.indexOf(65)
funnyAnecdote.indexOf('t')
funnyAnecdote.indexOf('W')      // non-existing characters return -1


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
funnyAnecdote.endsWith("Chianti.")
funnyAnecdote.endsWith("Cabernet sauvignon.")

// equalsIgnoreCase() method compares two strings, while neglecting the spelling
"Chianti".equalsIgnoreCase("CHIANTI")
"ChIaNti".equalsIgnoreCase("cHIANTi")

// intern() method returns a string representation from JVM's string pool intended to save space
funnyAnecdote.intern()
// if there is no matching string in the string pool, new string is added to the pool, and returned
"Pinot noir".intern()

// isEmpty() method checks is there anything in the string
funnyAnecdote.isEmpty()
"".isEmpty()

// lastIndexOf() method returns index of a first character in a last matching string
funnyAnecdote.lastIndexOf("v")

print("Length of this funny anecdote is: " + funnyAnecdote.length())

// metches() method is used for regex search through a string
funnyAnecdote.matches(".*liver.*")
funnyAnecdote.matches(".*liver$")

// offsetByCodePoints() returns an index of a character, with offset distance from provided initial character index
funnyAnecdote.offsetByCodePoints(5, 3)
funnyAnecdote.offsetByCodePoints(5, -3)


