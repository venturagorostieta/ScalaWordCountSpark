package com.scala.example.wordcount

import org.apache.spark._
import org.apache.spark.SparkContext

object WordCounter {
  
   def main(args: Array[String]) = {

    val conf = new SparkConf().setAppName("WordCount").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val textFile = sc.textFile("hdfs://sandbox-hdp.hortonworks.com:8020/tmp/examples/spark/alice29.txt")
    val counts = textFile.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    counts.saveAsTextFile("hdfs://sandbox-hdp.hortonworks.com:8020/tmp/examples/spark/wordcountResultScala")

  }
}