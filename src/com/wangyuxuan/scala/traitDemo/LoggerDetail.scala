package com.wangyuxuan.scala.traitDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 9:08
 * @description 定义具体的方法
 */
trait LoggerDetail {
  // 在trait中定义具体方法
  def log(msg: String) = println(msg)
}

class PersonService extends LoggerDetail {
  def add() = log("添加用户")
}

object MethodInTrait {
  def main(args: Array[String]): Unit = {
    val personService = new PersonService
    personService.add()
  }
}
