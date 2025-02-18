package exception

class AuditoriaException: Exception {
    constructor(): this("Seràs auditat/da! Prepara't!!!") { }
    constructor(missatge: String): super(missatge) { }
}
