package com.wangyuxuan.scala.traitDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 10:14 下午
 * @description 继承单个trait
 */
trait Logger1 {
  // 抽象方法
  def log(msg: String)
}

class ConsoleLogger1 extends Logger1 {
  override def log(msg: String): Unit = println(msg)
}

object LoggerTrait1 {
  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger1
    logger.log("控制台日志: 这是一条Log")
  }
}
