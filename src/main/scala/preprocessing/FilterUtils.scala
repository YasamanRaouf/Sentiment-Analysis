// === File: FilterUtils.scala ===
package processing

import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame

object FilterUtils {
  def filterShortReviews(df: DataFrame, minLength: Int = 30): DataFrame = {
    df.filter(length(col("clean_text")) > minLength)
  }
}

