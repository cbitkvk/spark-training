import scala.io._
import java.io.{File,FileInputStream,FileOutputStream}
val p=Source.fromFile("/tmp/passwd","utf-8").getLines.toStream
val src = new File("/etc/passwd")
val dest = new File("/tmp/passwd")
new FileOutputStream(dest) getChannel() transferFrom(
    new FileInputStream(src) getChannel, 0, Long.MaxValue )
p.foreach{println(_)}
