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
//本地函数
fun checkNum(start: Int, end: Int): Unit {
    fun isThrees( x : Int ) = ( x % 3 == 0 )
    fun isFives( x : Int ) = ( x % 5 == 0 )
    for (num in start..end){
        if(isThrees(num)){
            println("$num 被3整除")
        }else if (isFives(num)){
            println("$num 被5整除")
        }else if (isThrees(num)&&isFives(num)){
            println("$num 既能被3整除又能被5整除")
        }else{
            println(num)
        }
    }
}
//简化
fun checkNumber(start: Int, end: Int): Unit {
    for (num in start..end){
        fun isThrees() = (num % 3 == 0)
        fun isFives() = (num % 5 == 0)
        when{
            isThrees() -> println("$num 被3整除")
            isFives() -> println("$num 被5整除")
            isThrees()&&isFives() -> println("$num 既能被3整除又能被5整除")
            else -> println(num)
        }
    }
}
//
fun main(args: Array<String>) {
    println(suare(3.3))
    println(sum(3,4,5,12))
    val a = intArrayOf(3,4,5,12)
    //变量前的*是展开操作符
    println(sum(*a))
    checkNum(3,15)
    checkNumber(3,15)
}