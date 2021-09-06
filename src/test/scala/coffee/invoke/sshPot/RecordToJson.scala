package coffee.invoke.sshPot


class TestRecordToJson extends UnitSpec {

    val testRecord = record("0.0.0.0", 22, "fake", "fake")

    "RecordToJson" should "return valid json" in {
        val sut = new RecordToJson


        assert(sut.convert(testRecord) ===
            """{"remoteIP":"0.0.0.0","remotePort":22,"identificationString":"fake","keyExchange":"fake"}""")

    }

}
