/*函数*/
fun suare (r : Double) : Double{
    return Math.PI*r*r
}
//可变参数修饰符vararg
fun sum(vararg x : Int) : Int{
    var total = 0
    for (i in x){
        total += i
    }
    return total
}
fun main(args: Array<String>) {
    println(suare(3.3))
    println(sum(3,4,5,12))
    val a = intArrayOf(3,4,5,12)
    //变量前的*是展开操作符
    println(sum(*a))
}