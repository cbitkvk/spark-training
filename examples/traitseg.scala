trait T1{

def add(p:Int, j:Int):Int={return p + j + 1}
//def add(p:Int, j:Int):Int
//def sub(k:Int, l:Int):Int
}

trait T2 {
def sub(k:Int, l:Int):Int
}

class T1Class extends T1 with T2{
//override def add(n:Int, o:Int):Int= {
//return n+o
//}

def sub(n:Int,o:Int):Int ={
return n-o
}

}


object n extends App{
var p=new T1Class
println(p.add(1,2))
}
