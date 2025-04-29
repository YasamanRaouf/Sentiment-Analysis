# Sentiment Analysis on Large-Scale Social Media Data using Apache Spark and Scala

## Project Overview
This project aims to analyze large-scale user-generated content from social media platforms (such as Twitter, Reddit, or Yelp) to determine user sentiment (positive, negative, or neutral). The analysis is performed using Apache Spark and Scala to ensure efficient distributed data processing.

## Objectives
- Process large-scale textual data with Spark and Scala
- Optimize processing using RDDs, DataFrames, and Spark SQL
- Apply NLP and ML algorithms for sentiment classification
- Evaluate the impact of distributed processing on scalability and execution time

## Project Structure
```
project-root/
├── data/
│   ├── raw/                      # Raw datasets (e.g., Yelp JSON files)
│   └── processed/                # Cleaned and filtered data
├── src/
│   └── main/
│       └── scala/
│           ├── preprocessing/    # Data loading and cleaning
│           │   ├── DataLoader.scala
│           │   ├── TextCleaner.scala
│           │   └── PreprocessingPipeline.scala
│           └── processing/       # Filtering and statistical analysis
│               ├── FilterUtils.scala
│               ├── DataExploration.scala
│               └── ProcessingPipeline.scala
├── README.md
└── build.sbt
```

## Implementation Steps
### Step 1: Data Collection and Preprocessing
- Use the Yelp dataset to collect massive textual data
- Clean data by removing stop words, links, emojis, and special characters
- Tokenize and normalize the text using Spark NLP

### Step 2: Data Processing with Apache Spark
- Load and manipulate data using RDDs and DataFrames
- Apply MapReduce functions to filter irrelevant content
- Perform statistical analysis using Spark SQL

### Step 3: Sentiment Classification with Spark ML
- Feature extraction using TF-IDF and Word2Vec
- Train models such as Logistic Regression, Naïve Bayes, or Random Forest with Spark MLlib
- Evaluate models using metrics like Accuracy and F1-score

### Step 4: Distributed Optimization
- Tune Spark’s parallelism settings for performance
- Apply caching and partitioning strategies to boost speed
- Test and analyze scalability

### Step 5: Results Visualization and Evaluation
- Visualize sentiment analysis results using charts
- Compare the performance of different ML algorithms
- Analyze the effect of data volume on model accuracy and processing time

## Technologies Used
| Technology      | Purpose                                           |
|----------------|---------------------------------------------------|
| Scala           | Programming language                             |
| Apache Spark    | Distributed data processing                      |
| Spark MLlib     | Large-scale machine learning                     |
| Spark NLP       | Natural language processing                      |
| HDFS / S3       | Big data storage                                 |
| Spark SQL       | Text and statistical analysis                    |
| Matplotlib / Seaborn | Visualization of analysis results           |

## Expected Outputs
1. A simple dashboard to display sentiment analysis results
2. Optimized source code and sentiment model for large-scale data
3. Final report including:
   - Project title page
   - Table of contents
   - Abstract and Introduction
   - Explanation of codebase
   - Comparison of ML model results
   - Performance evaluation of distributed vs. traditional methods

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

