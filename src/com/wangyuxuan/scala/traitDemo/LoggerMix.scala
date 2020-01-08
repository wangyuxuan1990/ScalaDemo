package com.wangyuxuan.scala.traitDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 9:32
 * @description 实例对象混入trait
 */
trait LoggerMix {
  def log(msg: String) = println(msg)
}

class UserService

object FixedInClass {
  def main(args: Array[String]): Unit = {
    // 使用with关键字直接将特质混入到对象中
    val userService = new UserService with LoggerMix
    userService.log("你好")
  }
}