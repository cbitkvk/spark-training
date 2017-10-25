object myHello {

def main(args: Array[String]){
var n:String="hello"
var newobj=pollo
var newobj2=pollo
newobj.n("jack")
println("print newobj");println(newobj.nnew1)
newobj2.n("j")
println("print newobj2");println(newobj2.nnew1)
println("print newobj again");println(newobj.nnew1)
println(n)
}
}



object pollo{
var nnew1:String="hellop"
def n(n:String):Unit={
nnew1=n
println(n)
}
}

