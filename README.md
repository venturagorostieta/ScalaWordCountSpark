# ScalaWordCountSpark
Example Word counter using scala and spark 2.3  on Hortonworks


Example for run jar:

spark-submit \
  --class "com.scala.example.wordcount.WordCounter" \
  --master local[*] \
 /tmp/spark/scala/scala-0.0.1-SNAPSHOT.jar 
