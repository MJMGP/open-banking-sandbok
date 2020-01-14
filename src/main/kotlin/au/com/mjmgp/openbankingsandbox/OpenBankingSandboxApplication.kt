package au.com.mjmgp.openbankingsandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenBankingSandboxApplication

fun main(args: Array<String>) {
	runApplication<OpenBankingSandboxApplication>(*args)
}
