import java.io.File

/**
  * Created by MacUser on 26/07/17.
  */
object FileMatching {

  private def fileList = new File("/Users/MacUser/Documents/Documents/Scala Programming/").listFiles()

  def fileEnding(query : String) = {
    val fileEndingFnValue =
    fileMatching(query,)
  }

  def fileContaining(query : String) = {
    for(file <-fileList ; if file.getName.contains(query))
      yield file
  }

  def fileMatching(query : String, matcher :(String,String) => Boolean) = {
    for(file <- fileList ; if matcher(file.getName,query))
      yield file
  }


}

object testFileMatching  {
  def main(args: Array[String]): Unit = {
    println("-----File Ending Method check-----")
    FileMatching.fileEnding(".scala").toList.foreach(f => println(f.getName))
    println("-----File Containing method check-----")
    FileMatching.fileContaining("java").toList.foreach(f => println(f.getName))
  }
}
