package cookie

import kotlinx.browser.document

object CookieController {

    private const val DEFAULT_PATH_PROPERTY = "path=/"
    private const val DEFAULT_INTEGER = 0
    private const val DEFAULT_STRING = ""

    fun getCookie(
        type: CookieType
    ): String? = document
        .cookie
        .split("; ${type.parcelName}=")
        .lastOrNull()

    fun <Type> setCookie(
        type: CookieType,
        value: Type
    ) {
        document.cookie = CookieType.entries
            .associate { rowType ->
                if (rowType == type) {
                    type.parcelName to value.toString()
                } else {
                    rowType.parcelName to (getCookie(type) ?: rowType.defaultValue)
                }
            }
            .map {
                "${type.parcelName}=${value.toString()}"
            }
            .joinToString(";")
    }

    fun getString(
        type: CookieType,
        defaultValue: String = DEFAULT_STRING
    ) = getCookie(type) ?: defaultValue

    fun getInt(
        type: CookieType,
        defaultValue: Int = DEFAULT_INTEGER
    ) = getCookie(type)?.toIntOrNull() ?: defaultValue
}