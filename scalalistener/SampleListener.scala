package sparkmonitor.listener

import org.apache.spark.scheduler._
import org.apache.spark._
import org.apache.spark.TaskEndReason
import org.apache.spark.JobExecutionStatus
import org.apache.spark.SparkContext

class SampleListener (conf: SparkConf) extends SparkListener {

  override def onApplicationStart(appStarted: SparkListenerApplicationStart): Unit = {
    print("application started")
  }


}