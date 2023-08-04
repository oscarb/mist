package se.oscarb.uritomovie

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class NetflixApi {

    val url = "https://www.netflix.com/us/title/81418617"

    private val client = HttpClient {
        expectSuccess = true
    }

    suspend fun fetchWeather(): String {
        return client.get("https://www.netflix.com/us/title/81418617").bodyAsText()
    }

    companion object {
        private const val baseUrl = "https://samples.openweathermap.org"
    }


}