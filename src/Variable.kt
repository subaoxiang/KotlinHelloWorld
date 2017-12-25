/*常量与变量*/
fun main(args: Array<String>) {
    //常量
    val π = 3.141592653
    val salary = 6500
    val sex = "男"
    println(π)
    println(salary)
    println(sex)
    var a =3
    a += 1
    println(a)
    val course = Triple(3,"学会","Kotlin")
    val cust = Pair("学费",0)
    println("${course.first}天${course.second}${course.third}")
    println("${cust.first}${cust.second}元")
    println(course)
    println(cust)
    var addr : String? = "兰州理工大学西校区"
    var honest : Boolean?
    honest = true
    if(honest != null && honest ==true){
        println("从来没说过假话")
    }else{
        println("我是个骗子")
    }
    println(12/3.0)
}