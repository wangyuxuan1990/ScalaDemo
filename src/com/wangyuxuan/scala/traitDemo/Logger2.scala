package com.wangyuxuan.scala.traitDemo

/**
 * @author wangyuxuan
 * @date 2020/1/7 10:21 下午
 * @description 继承多个trait
 */
trait Logger2 {
  // 抽象方法
  def log(msg: String)
}

trait MessageSender {
  // 抽象方法
  def send(msg: String)
}

class ConsoleLogger2 extends Logger2 with MessageSender {
  override def log(msg: String): Unit = println(msg)

  override def send(msg: String): Unit = println(s"发送消息:${msg}")
}

object LoggerTrait2 {
  def main(args: Array[String]): Unit = {
    val logger = new ConsoleLogger2
    logger.log("控制台日志: 这是一条Log")
    logger.send("你好！")
  }
}