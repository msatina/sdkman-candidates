package steps

import scalaj.http._

trait Env {
  val host = "http://localhost:9000"

  var response: HttpResponse[String] = null
}
