package coffee.invoke.sshPot

case class record(
    remoteIP: String,
    remotePort: Int,
    identificationString: String,
    keyExchange: String
)