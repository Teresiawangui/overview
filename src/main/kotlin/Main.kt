fun main() {
    data(40,2)
    word("melodymiler")
    sentence("mumina",29)
    text("anyango")
    textWord("America","UK","Cameroon")
    homeTown("Nairobi","Mombasa","Kisumu")
    contentWords("mary","olo","eele","namy")
    numbers()
}

fun data(num1:Int,num2:Int){
    println(num1+num2)
    println(num1-num2)
    println(num1*num2)
    println(num1%num2)
}
fun word(name:String){
    var a=name[1]
    var b=name[3]
    var c=name[5]
    var d =a+""+b+""+c
    println(d)
}
fun sentence(name:String,age:Int){
    var f ="Hi I am $name and I am $age old"
    println(f)
}
fun text(word:String):Int{
    return word.length
}
fun textWord(name1:String,name2:String,name3:String):Array<String>{
    var country = arrayOf(name1,name2,name3)
    return country

}
fun homeTown(nameA:String,nameB:String,nameC:String) {
    var home = arrayOf(nameA, nameB, nameC)
    println(home.get(2))
    var home2 = home.plus("Kiambu")
    println(home2.contentToString())
    println(home2.indexOf("Kiambu"))
    var sortedHome2 = home2.sortedArray()
    println(sortedHome2.contentToString())
    println("Home2".length)
    home.forEach { a ->
        println(home.contentToString())
        for (x in home){
            println(x)
    }
}
}
fun contentWords(namew:String,names:String,namer:String,namei:String){
    println(arrayOf(namew,names,namer,namei).contentToString())
}
fun numbers(){
    var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = number[2]+number[5]
    println(sum)
println( number.indexOf(158))



}







