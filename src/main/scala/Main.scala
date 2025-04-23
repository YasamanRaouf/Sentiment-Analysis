import org.apache.spark.sql.functions._
import org.apache.spark.ml.PipelineModel

object Main {

  def main(args: Array[String]): Unit = {
    val spark = Utils.createSparkSession("Sentiment Analysis App")

    // Load dataset (فرض بر اینه که یک CSV با ستون‌های "text" و "label" داریم)
    val data = spark.read.option("header", "true").csv("data/processed/cleaned_data.csv")

    // Preprocess text
    val cleanedData = Preprocessing.cleanText(data)

    // Cast label to Double
    val finalData = cleanedData.withColumn("label", col("label").cast("Double"))

    // Build and train model
    val pipeline = SentimentModel.buildPipeline()
    val model = pipeline.fit(finalData)

    // Save the model
    model.write.overwrite().save("output/models/sentiment_model")

    // Predict on the same data (for demo)
    val predictions = model.transform(finalData)

    // Show results
    predictions.select("text", "cleaned_text", "label", "prediction").show(10)

    spark.stop()
  }

}
