import java.io.{BufferedReader, FileNotFoundException, IOException}
import java.nio.charset.Charset
import java.nio.file.{Files, Paths}
import scala.collection.mutable.ListBuffer

object ReadCsv {
  def main(args: Array[String]): Unit = {
    // 반환용 리스트
    val brands = new ListBuffer[String]()
    var br: BufferedReader = null

    try {
      br = Files.newBufferedReader(Paths.get("/Users/junha/Desktop/LookMonster/BrandRankingCrawling-scala/src/svgFile/brandirectory-ranking-data-apparel-2023.csv"), Charset.forName("UTF-8"))
      var line: String = null

      while ({line = br.readLine(); line} != null) {
        // CSV 행을 저장하는 문자열
        val array: Array[String] = line.split(",")
        // Brand 열의 데이터만 가져옴 (인덱스 0)
        val brand: String = array(0)
        brands += brand
      }

      // Brand 리스트 출력
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
