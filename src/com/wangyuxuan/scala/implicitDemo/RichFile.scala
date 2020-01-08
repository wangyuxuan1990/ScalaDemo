package com.wangyuxuan.scala.implicitDemo

import java.io.File

import scala.io.Source

/**
 * @author wangyuxuan
 * @date 2020/1/8 15:07
 * @description 隐式转换案例一:让File类具备RichFile类中的read方法
 */
object MyPredef {
  // 定义一个隐式转换的方法，实现把File转换成RichFile
  implicit def file2RichFile(file: File) = new RichFile(file)
}

class RichFile(file: File) {
  // 读取数据文件的方法
  def read(): String = {
    Source.fromFile(file).mkString
  }
}

object RichFile {
  def main(args: Array[String]): Unit = {
    // 1、构建一个File对象
    val file = new File("D:\\hello.txt")
    // 2、手动导入隐式转换
    import MyPredef.file2RichFile

    val data: String = file.read()

    println(data)
  }
}
