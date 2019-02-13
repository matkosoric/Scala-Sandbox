// trait in Scala is similar to interface in Java

trait Life {
  def feeding(): Unit
}



class Animal() extends Life {
  override def feeding(): Unit = print("...eating plants or other animals...")
}

class Plant () extends Life {
  override def feeding(): Unit = print("...collecting sunshine...")
}


val cat = new Animal()
cat.feeding()

val oak = new Plant()
oak.feeding()