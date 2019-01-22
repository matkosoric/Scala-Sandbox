// anonymous functions do not have a name
// in the workbook they are represented with input and output types

(a :Int) => a + 1

(numberToSquare :Int) => numberToSquare*numberToSquare

(latitude :Double, longitude : Double) => "(" + latitude + "," + longitude + ")"

() => { System.getProperty("os.version") }

