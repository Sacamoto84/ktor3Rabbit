package com.example

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory {
    fun init() {
        Database.connect("jdbc:odbc:sss", driver = "sun.jdbc.odbc.JdbcOdbcDriver")
        println("111")
    }
}

fun <T> dbQuery(block: () -> T): T {
    return transaction { block() }
}