package io.bash_psk.empty_thumbnail

import android.graphics.Bitmap

sealed class ThumbnailState {

    data object INIT : ThumbnailState()

    data object LOADING : ThumbnailState()

    data class ERROR(val message: String = "") : ThumbnailState()

    data class SUCCESS(val bitmap: Bitmap) : ThumbnailState()
}