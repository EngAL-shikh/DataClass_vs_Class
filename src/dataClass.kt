fun main() {
    val s=Students("omar",20)

    println(s)
    println(s.equals(s))



    val u=User("omar",20)

    println(u)
    println(u.equals(u))



    println(u.copy())

    println(u.let { it->it.name="ali" })


}


class Students(name:String,age:Int){

}
data class User(var name:String,var age:Int)