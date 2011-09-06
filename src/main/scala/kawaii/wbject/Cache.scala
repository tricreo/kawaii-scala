package kawaii.wbject

object Cache {

  private var map = Map.empty[Int, String]

  def add(value: String) = map += (value.## -> value)

  def remove(value: String) = map -= (value.##)

}