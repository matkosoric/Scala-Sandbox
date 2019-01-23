// ranges of values
"Byte minimal value: " + Byte.MinValue
"Byte maximal value: " + Byte.MaxValue

"Short minimal value: " + Short.MinValue
"Short maximal value: " + Short.MaxValue

"Integer minimal value: " + Int.MinValue
"Integer maximal value: " + Int.MaxValue

"Long minimal value: " + Long.MinValue
"Long maximal value: " + Long.MaxValue

"Float minimal value: " + Float.MinValue
"Float maximal value: " + Float.MaxValue

"Double minimal value: " + Double.MinValue
"Double maximal value: " + Double.MaxValue

"Char minimal value: " + Char.MinValue.toHexString
"Char maximal value: " + Char.MaxValue.toHexString

// several values without variables
1
999999999
4.4
982734.23764F
false
true
'h'
'*'
"shakespeare"


// values with variables
val age1 :Byte = 35
val age2 = 34                              // type inference casts value to Int
//val leaguesUnderTheSea1 :Byte = 20000    // out of scope for Byte type
val leaguesUnderTheSea2 :Short = 20000
val speedOfLight :Int = 299792458

// double or float type can be explicitly defined with f or d at he end of value
val temperature1 = 3.3F
val temperature2 :Float = 3.3f
val temperature3 = 3.3D
val temperature4 = 3.3d
val temperature5 = 3.3                                                          // implicit Float
val temperature6 = 3.39827349872389498273429398723947929237498237992374982      // notice the limit in output
val temperature7 = 3.39827349872389498273429398723947929237498237992374982F     // notice the limit in output

// various ways of assigning value for a letter a
val alpha1 = 'a'
val alpha2 = '\u0041'
val alpha3 :Char = 97
//val alpha4 :Char = 97233    // does not compile, out of scope

// multiline string
val richard3intro = """Now is the winter of our discontent
                      Made glorious summer by this sun of York;
                      And all the clouds that lour'd upon our house
                      In the deep bosom of the ocean buried."""



3.5.toInt
3.5.toLong
3.5.toByte
3.5.toDegrees
3.5.toRadians