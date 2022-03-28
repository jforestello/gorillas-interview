package org.jforestello.gorillas_interview

import com.expediagroup.graphql.server.operations.Mutation
import com.expediagroup.graphql.server.operations.Query
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@Component
class MyAwesomeQuery : Query {
	fun myAwesomeQuery(): Widget { return Widget(1, "") }
}

@Component
class MyAwesomeMutation : Mutation {
	fun myAwesomeMutation(widget: Widget): Widget { return Widget(1, "") }
}

data class Widget(val id: Int, val value: String)

@SpringBootApplication
class Application

fun main(args: Array<String>) {

	runApplication<Application>(*args)
}
