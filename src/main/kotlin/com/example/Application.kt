package com.example

import com.example.plugins.configureMonitoring
import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {

    val s3 = S3Client(
        region = "",
        bucketName = "rabbit",
        awsAccessKey = "WVPFE18CVWFMUIXHS30I",
        awsSecretKey = "gyPm81FECjcCnnvrW1NS6IJ8ck6AAky58fKuyi9r"
    )

    val list = s3.listAllKeys()//(continuationToken = "update/")
    list


    configureRouting()
    configureMonitoring()
    configureSerialization()
}


