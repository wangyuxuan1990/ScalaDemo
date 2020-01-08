package com.wangyuxuan.scala.caseDemo

import scala.util.Random

/**
 * @author wangyuxuan
 * @date 2020/1/8 11:03
 * @description 样例类和样例对象结合模式使用
 */
case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo06 extends App {
  val arr = Array(CheckTimeOutTask, HeartBeat(10000), SubmitTask("0001", "task-0001"))

  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => println(s"id=$id, name=$name")
    case HeartBeat(time) => println(s"time=$time")
    case CheckTimeOutTask => println("检查超时")
  }
}
