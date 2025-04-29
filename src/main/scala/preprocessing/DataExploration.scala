// === File: DataExploration.scala ===
package processing

import org.apache.spark.sql.DataFrame

object DataExploration {
  def summarize(df: DataFrame): Unit = {
    df.selectExpr("length(clean_text) as text_length")
      .describe()
      .show(truncate = false)
  }
}

