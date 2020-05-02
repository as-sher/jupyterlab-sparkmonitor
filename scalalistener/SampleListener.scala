class SampleListener (conf: SparkConf) extends SparkListener {

  override def onApplicationStart(appStarted: SparkListenerApplicationStart): Unit = {
    print("application started")
  }


}