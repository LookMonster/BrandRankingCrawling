import java.io.{BufferedReader, FileNotFoundException, IOException}
import java.nio.charset.Charset
import java.nio.file.{Files, Paths}
import scala.collection.mutable.ListBuffer

object ReadCsv {
  def main(args: Array[String]): Unit = {
    val brands = new ListBuffer[String]()
    var br: BufferedReader = null

    try {
      br = Files.newBufferedReader(Paths.get("/Users/junha/Desktop/LookMonster/BrandRankingCrawling-scala/src/svgFile/brandirectory-ranking-data-apparel-2023.csv"), Charset.forName("UTF-8"))
      var line: String = null

      while ({line = br.readLine(); line} != null) {
        val array: Array[String] = line.split(",")
        val brand: String = array(0)
        brands += brand
      }

      for (brand <- brands) {
        println(brand)
      }
    } catch {
      case e: FileNotFoundException =>
        e.printStackTrace()
      case e: IOException =>
        e.printStackTrace()
    } finally {
      try {
        if (br != null) {
          br.close()
        }
      } catch {
        case e: IOException =>
          e.printStackTrace()
      }
    }
  }
}
