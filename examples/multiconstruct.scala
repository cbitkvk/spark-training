class acct(name:String, actid:Int, bal:Int){

def this(n:String,a:Int)={
this(n,a,0)
}

def show()={
println(name)
println(actid)
println(bal)
}

}

object pk{
def main(args: Array[String])={
var n=new acct("hello",123,12)
n.show()

var p=new acct("hello",123)
p.show()
}
}
