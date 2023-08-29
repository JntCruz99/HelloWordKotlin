fun main(args: Array<String>) {
    println("Hello World!")
    printMensagem("oi")
    println(somar(1,2))

    val items = listOf("apple", "banana", "kiwifruit")
    for (i in items) {
        if (i == "apple"){
            println(i)
        }
    }

    val items2 = listOf("apple", "banana", "kiwifruit")
    for (index in items2.indices) {
        println("item at $index is ${items[index]}")
    }

    for (x in 1..5) {
        print(x)
    }

}
fun printMensagem(mensagem: String){
    println(mensagem)
}

fun somar(x:Int, y: Int): Int{
    return x+ y;
}