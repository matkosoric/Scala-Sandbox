
// this is valid casting sequence since every following type is larger than the previous
val numberOfFingersByte: Byte = 10

val numberOfFingersShort: Short = numberOfFingersByte

val numberOfFingersInt: Int = numberOfFingersShort

val numberOfFingersLong: Long = numberOfFingersInt

val numberOfFingersFloat: Float = numberOfFingersLong

val numberOfFingersDouble: Double = numberOfFingersFloat

// casting does not work in the opposite direction
//val butcherMikeNumOfFingers: Byte = numberOfFingersFloat - 1    // does not compile
//val butcherJakeNumOfFingers: Int = numberOfFingersLong - 2      // does not compile
//val butcherMaxNumOfFingers: Short = numberOfFingersFloat - 1    // does not compile
//val butcherJohnNumOfFingers: Float = numberOfFingersDouble - 3  // does not compile


// Char type can be casted to

val letterAasChar0 : Char = 'a'
//val letterAinASCIIShort1 : Short = letterAasChar0       // type mismatch
val letterAinASCIIShort2 : Short = letterAasChar0.toShort

val letterAinASCIILong: Long = 65
//val letterAasChar1: Char = letterAinASCIILong          // does not compile

val letterAinASCIIShort: Int = 65
//val letterAasChar2: Char = letterAinASCIIShort          // does not compile