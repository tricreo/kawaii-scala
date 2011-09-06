package kawaii.wbject
import org.junit.Test

class CacheTest {

  @Test
  def testAdd {

    Cache.add("ABC")
    Cache.remove("ABC")

  }

}