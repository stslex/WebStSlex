package cookie

enum class CookieType(
    val parcelName: String,
    val defaultValue: String
) {
    RESULT_NUMBER(
        parcelName = "result_number",
        defaultValue = "0"
    ),
    PATH(
        parcelName = "path",
        defaultValue = "/"
    ),
    EXPIRED(
        parcelName = "expires",
        defaultValue = "19 Jan 2038 03:14:07 GMT"
    )
}