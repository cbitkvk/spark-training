object cur {
def add(a:Int):(String=>Int) = {(b:String) => 1}

def main(args:Array[String])
{
var p=add(10)("hello")
println(p)
}
}
