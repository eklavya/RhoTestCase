import fs2.Task
import io.circe.generic.auto._
import io.circe.literal._
import io.circe.syntax._
import org.http4s.rho.RhoService


object TestService {

  case class Test(some: String, thing: String)

  private def getSome(param1: String): Task[List[Test]] = ???

  val api = new RhoService {

    import org.http4s.circe._
    import org.http4s.rho._
    import org.http4s.rho.swagger._


    //uncomment this to make it compile

//    "dummy" **
//      GET / "dummy" |>> {
//      Ok()
//    }


    "Get stuffs of a thing" **
      GET / "things" / pathVar[String]("thingId") / "stuffs" |>> { (thingId: String) =>
        for {
          stuffs <- getSome(thingId)
          r <- Ok(json"""{"stuffs" : ${stuffs.asJson}}""")
        } yield r
    }
  }
}
