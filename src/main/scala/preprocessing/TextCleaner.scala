// === File: TextCleaner.scala ===
package preprocessing

import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame

object TextCleaner {
  def cleanText(df: DataFrame, textCol: String): DataFrame = {
    val cleanUDF = udf((text: String) => {
      if (text != null) {
        text.toLowerCase
          .replaceAll("https?://\\S+", "")       // remove URLs
          .replaceAll("[^a-zA-Z\s]", "")          // remove special chars
          .replaceAll("\\s+", " ").trim            // normalize spaces
      } else ""
    })
    df.withColumn("clean_text", cleanUDF(col(textCol)))
  }
}