package kawaii.method.ifstatement

object Main {

  def main(args: Array[String]): Unit = {

    val n = args(0).toInt

    val s = if (n > 0) {
      "あり"
    } else {
      "なし"
    }

  }

}