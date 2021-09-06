package coffee.invoke.sshPot

import net.liftweb.json.DefaultFormats
import net.liftweb.json.Serialization.write

class RecordToJson {
  def convert(record: record): String = {
      implicit val formats = DefaultFormats

      write(record)

  }
}
