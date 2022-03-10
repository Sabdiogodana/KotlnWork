fun main(){
    school()
    var rem =modulus(75,8)
    println(rem)
    identity("Sabdio",21)
    city("Nairobi")

}
fun school(){
    var name = "codiHive"
    var x =name[4].toString()+name[5]+name[6]+name[7]
    println(x)
}
fun modulus(num1:Int,num2:Int):Int{
    var nums= num1%num2
    return nums

}
fun identity(name:String,age:Int){
    println("Hi, my name is $name and I am $age years old")

}
fun city(name:String){
    println(name.length)
}
