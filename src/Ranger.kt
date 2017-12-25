/*区间*/
fun main(args: Array<String>) {
    val ranger = 1..100
    val odd = ranger.step(2)
    for (i in odd){
        print(i)
        if(i == 99){
            break
        }
        print(",")
    }
    println()
    val backOdd = ranger.step(2).reversed()
    for (i in odd){
        print(i)
        if(i == 99){
            break
        }
        print(",")
    }
    println()
    println(10.downTo(0))
    println(100.rangeTo(110))

}