package com.example.plugins

import com.example.DatabaseFactory
import com.example.routes.randomRabbit
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {


    routing {
        randomRabbit()


        get("/") {
            call.respondText("Hello World!")


        }

        // Static plugin. Try to access `/static/index.html`
        //static("/static") {
        //    resources("static")
        //}
         //Усли убрать скобки то /static в пути не нужен
        static {
            resources("static")
        }



    }
}
