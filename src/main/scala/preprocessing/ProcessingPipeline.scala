// === File: ProcessingPipeline.scala ===
package preprocessing

import org.apache.spark.sql.{DataFrame, SparkSession}

object ProcessingPipeline {
  def run(spark: SparkSession): DataFrame = {
    val df = spark.read.json("data/processed/cleaned_reviews.json")
    val filteredDF = FilterUtils.filterShortReviews(df)
    DataExploration.summarize(filteredDF)
    filteredDF.write.mode("overwrite").json("data/processed/filtered_reviews.json")
    filteredDF
  }
}
