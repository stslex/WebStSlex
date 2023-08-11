package network_client

import androidx.compose.ui.graphics.toComposeImageBitmap
import io.ktor.client.*
import io.ktor.client.engine.js.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import org.jetbrains.skia.Image

object NetworkClient {

    private val ktorClient = HttpClient(JsClient())

    private val wrappedHttpClient = WrappedHttpClient { urlString ->
        ktorClient.get(urlString).readBytes()
    }

    suspend fun getBitmap(url: String) = Image
        .makeFromEncoded(wrappedHttpClient(url))
        .toComposeImageBitmap()
}
