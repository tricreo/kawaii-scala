package kawaii.method.matchstatement

object Main {

  def main(args: Array[String]): Unit = {

    args(0) match {
      case "abc" => println("text")
      case _ => println("default")
    }

  }

}