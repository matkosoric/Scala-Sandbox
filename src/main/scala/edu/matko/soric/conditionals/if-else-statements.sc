// the simplest if statement
if (1 < 2) print ("One is smaller than two")
if (1 > 2) print ("One is greater than two")


// if-else statement
val age = 30
if (age < 21)
  print ("Sale to and consumption by persons under 18 years of age is prohibited.")
else
  print ("Enjoy your bottles of vodka, sir!")


// multiple if-else statements
// program will execute until first true condition
val trainAvailable :Boolean = false
val carAvailable :Boolean = false
val boatAvailable :Boolean = true
val horseAvailable :Boolean = false

if (trainAvailable)
  print("Traveling by train...")
else if (carAvailable)
  print("Traveling by car...")
else if (boatAvailable)
  print("Traveling by boat...")
else if (horseAvailable)
  print("Traveling by horse...")


// nested if statements
// all conditions have to be satisfied to reach the most inner block

