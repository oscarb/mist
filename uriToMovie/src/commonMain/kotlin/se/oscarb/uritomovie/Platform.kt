package se.oscarb.uritomovie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform