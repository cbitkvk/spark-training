import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.rdd._

object hell {
def main(args:Array[String]) {
val sconf=new SparkConf()
val sc=new SparkContext(sconf)
val n=sc.parallelize(Array(1,2,3))
n.collect()
println(n.count)
}
}
