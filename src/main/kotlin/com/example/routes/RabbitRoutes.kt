package com.example.routes

import com.example.data.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

//private const val BASE_URL = "http://localhost:8080"
//private const val BASE_URL = "http://10.0.2.2:8080" //Чтобы был виден в эмуляторе андроид
private const val BASE_URL = "http://192.168.0.105:8080" //Чтобы был виден в эмуляторе андроид

private val rabbits =  listOf(
    Rabbit("Carl","1111", "/rabbits/rabbit1.jpg"),
    Rabbit("Emma","2222", "/rabbits/rabbit2.jpg"),
    Rabbit("Florian","3333", "/rabbits/rabbit3.png"),
    Rabbit("Federico","4444", "/rabbits/rabbit4.png"),
    Rabbit("Gina","5555", "/rabbits/rabbit5.jpg"),
)
private var count = 0
fun Route.randomRabbit(){

    get("/randomrabbit") {

        count++
        if ( count > 4) count = 0

        call.respond(
            HttpStatusCode.OK,
            rabbits[count]
        )
    //rabbits.random()


        //call.parameters[""]
        //call.respondText("Hello World!")


            //resources("static")



    }


    get("/s3")
    {

    }


}