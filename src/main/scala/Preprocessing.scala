import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame

object Preprocessing {

  // Function to clean the text
  def cleanText(df: DataFrame): DataFrame = {
    val toLower = udf((text: String) => text.toLowerCase())
    val removePunctuation = udf((text: String) => text.replaceAll("[^a-zA-Z\\s]", ""))
    val removeExtraSpaces = udf((text: String) => text.replaceAll("\\s+", " ").trim)

    df.withColumn("cleaned_text", removeExtraSpaces(removePunctuation(toLower(col("text")))))
  }

}
