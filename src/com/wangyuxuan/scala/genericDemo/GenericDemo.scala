package com.wangyuxuan.scala.genericDemo

/**
 * @author wangyuxuan
 * @date 2020/1/8 13:34
 * @description 泛型方法
 */
object GenericDemo {
  def getMiddle[A](arr: Array[A]) = arr(arr.length / 2)

  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 3, 4, 5)
    val arr2 = Array("a", "b", "c", "d", "e")
    // 简写方式,scala自动进行类型推断
    println(getMiddle(arr1))
    println(getMiddle(arr2))
  }
}
