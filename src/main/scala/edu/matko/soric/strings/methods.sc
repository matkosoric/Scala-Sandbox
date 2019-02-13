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

// toCharArray() method returns characters as they are
funnyAnecdote.toCharArray()

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

// startsWith() method return boolean depending on the match between argument and string prefix
print ("startsWith() method:")
funnyAnecdote.startsWith("A census taker")
funnyAnecdote.startsWith("I ate his liver")

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
print("empty strings:")
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

// regionMatches() compares two strings for matching substrings, with provided offset in the first string,
// followed by the second string, its offset, and number of characters to compare
print("comparing  \"census taker\" substring:")
funnyAnecdote.regionMatches(2, "census taker is someone who collects census data by visiting individual homes. ", 0, 12)
funnyAnecdote.regionMatches(3, "census taker is someone who collects census data by visiting individual homes. ", 0, 12)

// replace() method simply replaces occurrence of a specified string
funnyAnecdote.replace("Chianti", "Sauvignon blanc")
funnyAnecdote.replace('a', 'q')

// replaceAll() method is intended to be used with regex
funnyAnecdote.replaceAll(" t", " w")
// replaceFirst() replaces only first occurrence of a pattern
funnyAnecdote.replaceFirst(" t", " w")

// split() method breaks string into an array of substring by the provided breaking point
funnyAnecdote.split("\\.")
funnyAnecdote.split(" ")

// subSequence returns
funnyAnecdote.subSequence(54,64)


// substring() method returns part of the original string, starting from provided index
// second argument is optional. without it, end of the original string is also the end of the returning string
funnyAnecdote.substring(54)
funnyAnecdote.substring(64, 74)

// toUpperCase() method returns original string in uppercase
funnyAnecdote.toUpperCase()

// toLowerCase() method returns original string in lowercase
funnyAnecdote.toLowerCase()

// trim() method returns original string without leading or trailing whitespaces
"    a nice Chianti     ".trim()