// def keyword is followd by a function name, list of parameters in the parenthesis
// followed by a return type, equals sign and finally a body of a function
// last statement in a function body is return value


def squareThisNUmber(x:Double):Double = x*x
squareThisNUmber(5)
squareThisNUmber(11)


def divideTheseNumbers(firstNumber: Int, secondNumber :Int): Double = firstNumber / secondNumber
divideTheseNumbers(100, 5)


def getAsciiCode (character :Char):Byte  = character.toByte
getAsciiCode('a')
getAsciiCode('A')


def countCharactersInString (character :Char, text :String): Int = {
  var counter = 0
  text.foreach(c => if (c == character) counter+=1)
  counter
}

countCharactersInString('o', "Matko Sorić")
countCharactersInString('t', "The world is the totality of facts, not of things.")

