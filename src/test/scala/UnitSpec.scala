
import org.scalatest._
import org.scalatest.concurrent.{Eventually, IntegrationPatience, ScalaFutures}

trait UnitSpec

    extends FreeSpecLike
     with Matchers
    with TryValues
    with EitherValues
    with OptionValues
    with AppendedClues
    with ScalaFutures
    with StreamlinedXml
    with Inside
    with Eventually
    with IntegrationPatience {

}
