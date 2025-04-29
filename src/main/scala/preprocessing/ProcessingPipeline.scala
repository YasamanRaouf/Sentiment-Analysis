// === File: ProcessingPipeline.scala ===
package processing

import org.apache.spark.sql.{DataFrame, SparkSession}

object ProcessingPipeline {
  def run(spark: SparkSession, inputPath: String, outputPath: String): DataFrame = {
    val df = spark.read.json(inputPath)
    val filteredDF = FilterUtils.filterShortReviews(df)
    DataExploration.summarize(filteredDF)
    filteredDF.write.mode("overwrite").json(outputPath)
    filteredDF
  }
}
