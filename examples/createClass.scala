class hello(n:String,p:Int,j:Int){
var name:String=n
var age:Int=p
var rollno:Int=j


def show()={
println("Name:" + name)
println("age:" + age)
println("rollno:" + rollno)
}

}

object testentry{
def main(args: Array[String])={
var s=new hello("a",20,30)
s.show()
}}


