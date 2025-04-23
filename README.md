# 🧠 Sentiment Analysis on Big Social Media Data using Apache Spark and Scala

## 📌 Project Overview

This project focuses on large-scale sentiment analysis on user-generated text data from social media platforms (e.g., Twitter, Reddit, Yelp). We utilize **Apache Spark** with **Scala** to perform distributed processing and Natural Language Processing (NLP) at scale.

## 🎯 Objectives

- Efficient processing of large-scale text data using Apache Spark (RDD, DataFrame, Spark SQL)
- Text cleaning, feature extraction (TF-IDF, Word2Vec)
- Train and evaluate ML models (e.g., Logistic Regression, Naive Bayes, Random Forest)
- Use Spark NLP for preprocessing
- Analyze performance and scalability of distributed computing

## 🧱 Project Structure

📦 sentiment-analysis-spark
├── 📁 data/                    # Directory for raw and processed datasets
│   ├── raw/                   # Raw Yelp dataset (or Twitter, Reddit)
│   └── processed/             # Cleaned and preprocessed text data
├── 📁 notebooks/              # Jupyter / Zeppelin notebooks (if any used for exploration)
├── 📁 src/                    # Scala source code
│   └── main/
│       └── scala/
│           ├── preprocessing/   # Text preprocessing modules (tokenizing, cleaning, etc.)
│           ├── sentiment/      # Sentiment analysis logic and model training
│           └── utils/          # Helper functions/utilities
├── 📁 models/                 # Saved ML models (TF-IDF, Word2Vec, trained models)
├── 📁 output/                 # Results like predictions, evaluation metrics
├── 📁 reports/                # Final reports, performance comparison, visuals
├── 📄 README.md               # Project description and setup
├── 📄 .gitignore              # Git ignore file
├── 📄 LICENSE                 # Apache 2.0 License
└── 📄 build.sbt               # SBT build configuration file



##  ⚙️ Technologies Used

Technology | Description
Scala | Programming language used to implement Spark logic
Apache Spark | Distributed data processing framework
Spark MLlib | Machine learning at scale
Spark NLP | NLP library built on top of Spark
Spark SQL | SQL-based processing for structured data
HDFS / S3 | Storage layer for large datasets
Matplotlib / Seaborn | Data visualization (via Python notebooks)

##  🚀 How to Run
Clone the repo:

bash
Copy
Edit
git clone https://github.com/yourusername/sentiment-analysis-spark-scala.git
Navigate to project folder:

bash
Copy
Edit
cd sentiment-analysis-spark-scala
Build the project using sbt:

bash
Copy
Edit
sbt compile
Submit to Spark cluster or run locally:

bash
Copy
Edit
spark-submit-- class sentiment.Main target/scala-2.12/sentiment-analysis_2.12-1.0.jar
📈 Expected Outputs
Preprocessed datasets (cleaned text)

Trained sentiment analysis model

Accuracy, Precision, Recall, and F1-score for each model

Performance comparison between different ML algorithms

Visualizations of results and analysis

📄 License
This project is licensed under the Apache License 2.0.  
Please look at the [LICENSE](./LICENSE) file for more details.

✨ Authors
## ✨ Authors

**Aida Lashgary**  
MSc in Software Engineering  
GitHub: [@Lashgary](https://github.com/Lashgary)

**Yasaman Raouf Moghaddam**  
MSc in Software Engineering  
GitHub: [@YasamanRaouf](https://github.com/YasamanRaouf)

**Melika Sadoghi**  
MSc in Software Engineering 
GitHub: [@melikasadoghi](https://github.com/melikasadoghi)

