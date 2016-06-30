import com.twitter.scalding._

class WordCountScalding(args: Args) extends Job(args) {
  TypedPipe.from(TextLine(args("input")))
    .flatMap { line => line.split( """\s+""") }
    .groupBy { word => word }
    .size
    .toTypedPipe
    .write(TypedTsv(args("output")))
}