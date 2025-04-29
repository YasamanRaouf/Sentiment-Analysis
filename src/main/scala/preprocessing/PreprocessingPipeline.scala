// === File: PreprocessingPipeline.scala ===
package preprocessing

import org.apache.spark.sql.{DataFrame, SparkSession}

object PreprocessingPipeline {
  def run(spark: SparkSession): DataFrame = {
    val rawDF = DataLoader.loadReviewData(spark)
    val cleanedDF = TextCleaner.cleanText(rawDF, "text")
    cleanedDF.write.mode("overwrite").json("data/processed/cleaned_reviews.json")
    cleanedDF
  }
}
