package com.wangyuxuan.scala.traitDemo

import java.text.SimpleDateFormat
import java.util.Date

/**
 * @author wangyuxuan
 * @date 2020/1/8 9:24
 * @description 定义具体字段和抽象字段
 */
trait LoggerEx {
  // 具体字段
  val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm")
  val INFO = "信息:" + sdf.format(new Date)
  // 抽象字段
  val TYPE: String

  // 抽象方法
  def log(msg: String)
}

class ConsoleLoggerEx extends LoggerEx {
  // 实现抽象字段
  override val TYPE: String = "控制台"

  // 实现抽象方法
  override def log(msg: String): Unit = println(s"$TYPE$INFO $msg")
}

object FieldInTrait {
  def main(args: Array[String]): Unit = {
    val loggerEx = new ConsoleLoggerEx
    loggerEx.log("这是一条消息")
  }
}