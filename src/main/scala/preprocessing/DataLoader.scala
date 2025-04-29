// === File: DataLoader.scala ===
package preprocessing

import org.apache.spark.sql.{DataFrame, SparkSession}

object DataLoader {
  def loadRawData(spark: SparkSession, path: String): DataFrame = {
    spark.read
      .option("multiLine", true)
      .option("mode", "PERMISSIVE")
      .json(path)
  }
}

