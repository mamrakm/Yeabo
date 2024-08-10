package cz.ememsoft.yeabo

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
    fromApplication<YeaboApplication>().with(TestcontainersConfiguration::class).run(*args)
}
