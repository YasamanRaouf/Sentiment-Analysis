// === File: PreprocessingPipeline.scala ===
package preprocessing

import org.apache.spark.sql.{DataFrame, SparkSession}

object PreprocessingPipeline {
  def run(spark: SparkSession, inputPath: String, outputPath: String): DataFrame = {
    val rawDF = DataLoader.loadRawData(spark, inputPath)
    val cleanedDF = TextCleaner.cleanText(rawDF, "text")
    cleanedDF.write.mode("overwrite").json(outputPath)
    cleanedDF
  }
}

