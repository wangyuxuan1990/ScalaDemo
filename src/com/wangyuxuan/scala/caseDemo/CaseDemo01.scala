package com.wangyuxuan.scala.caseDemo

import scala.util.Random

/**
 * @author wangyuxuan
 * @date 2020/1/8 9:42
 * @description 匹配字符串
 */
object CaseDemo01 extends App {
  // 定义一个数组
  val arr = Array("hadoop", "zookeeper", "spark", "storm")
  // 随机取数组中的一位，使用Random.nextInt
  val name: String = arr(Random.nextInt(arr.length))
  println(name)

  name match {
    case "hadoop" => println("大数据分布式存储和计算框架...")
    case "zookeeper" => println("大数据分布式协调服务框架...")
    case "spark" => println("大数据分布式内存计算框架...")
    // 表示以上情况都不满足才会走最后一个
    case _ => println("我不认识你")
  }
}
