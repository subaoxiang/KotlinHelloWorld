/*控制流*/
fun main(args: Array<String>) {
    val a = 5
    val b = 10
    println(if(a>b){a-b}else{b-a})
    for (i in 1..10){
        println("${i}重要的事说十遍")
    }
    val result = 5
    when(result){
        in 1..5 ->{
            println("1到5之间")
        }
        1,3,5 -> {
            println("1/3/5中包含")
        }
        is Int -> {
            println("值int类型")
        }
        else -> {
            println("string类型")
        }
    }
}
