// === File: DataLoader.scala ===
package preprocessing

import org.apache.spark.sql.{DataFrame, SparkSession}

object DataLoader {
  def loadReviewData(spark: SparkSession): DataFrame = {
    spark.read
      .option("multiLine", true)
      .option("mode", "PERMISSIVE")
      .json("data/raw/yelp_academic_dataset_review.json")
  }
}