import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.util.*

fun readFile(path: Path): Unit{
    val input = Files.newInputStream(path)
    try {
        var byte =input.read()
        while (byte != -1){
            println(byte)
            byte = input.read()
        }
    }
    catch (e : IOException){
        println("读取文件错误，因为：${e.message}")
    }
    finally {
        input.close()
    }
}

fun main(args: Array<String>) {
    val file1 = File("/usr/bin/ruby")
    val file2 = File("/usr/bin/ruby")
    val date = Date(20171225)
    println(file1===file2)
    println(file1==file2)
}