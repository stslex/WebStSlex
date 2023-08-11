package network_client

expect fun interface WrappedHttpClient {
    suspend operator fun invoke(urlString: String): ByteArray
}