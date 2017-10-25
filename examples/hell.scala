object hell {
def main(args:Array[String]){
main(Array(args(0).toInt,args(1)))
}

def main(args:Array[Any]){
for (i<- 1 to args(0).toString.toInt) {
print(i, args(1).toString)}
}
}

