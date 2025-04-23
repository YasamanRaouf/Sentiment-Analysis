import org.apache.spark.sql.SparkSession

object Utils {

  // Creates a SparkSession
  def createSparkSession(appName: String = "Sentiment Analysis"): SparkSession = {
    SparkSession.builder()
      .appName(appName)
      .master("local[*]")
      .getOrCreate()
  }

}
