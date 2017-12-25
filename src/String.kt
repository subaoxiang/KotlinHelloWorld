/*字符串*/
fun main(args: Array<String>) {
    var status = "我饿了，很饿"
    println(status.length)
    println(status.isEmpty())
    println(status.count())
    println(status.get(1))
    println(status[1])
    println(status.elementAt(1))
    println(status.first())
    println(status.last())
    println(status.substring(3))
    println(status.substring(4,6))
    println(status.indexOf("了"))
    println(status.drop(4))
    println(status.contains("，"))
}