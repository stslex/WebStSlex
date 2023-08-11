package network_client

actual fun interface WrappedHttpClient {
    actual suspend operator fun invoke(urlString: String): ByteArray
}