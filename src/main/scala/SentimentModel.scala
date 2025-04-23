import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.{HashingTF, IDF, Tokenizer}

object SentimentModel {

  // Builds the ML pipeline
  def buildPipeline(): Pipeline = {
    val tokenizer = new Tokenizer()
      .setInputCol("cleaned_text")
      .setOutputCol("words")

    val hashingTF = new HashingTF()
      .setInputCol("words")
      .setOutputCol("rawFeatures")
      .setNumFeatures(10000)

    val idf = new IDF()
      .setInputCol("rawFeatures")
      .setOutputCol("features")

    val lr = new LogisticRegression()
      .setLabelCol("label")
      .setFeaturesCol("features")

    new Pipeline().setStages(Array(tokenizer, hashingTF, idf, lr))
  }

}
