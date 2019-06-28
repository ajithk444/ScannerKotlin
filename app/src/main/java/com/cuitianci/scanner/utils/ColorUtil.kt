package com.cuitianci.scanner.utils

import android.content.Context
import android.graphics.Bitmap
import androidx.palette.graphics.Palette
import com.cuitianci.scanner.R

/**
 * 颜色工具
 */
object ColorUtil {

    /**
     * 获取bitmap中的亮（light）活力（viBrant）色
     *
     * @param context   activity
     * @param bitmap    source bitmap
     * @param topRegion 忽略顶部部分比例。
     * @return 颜色值
     */
    fun getXXColorOfBitmap(context: Context, bitmap: Bitmap, topRegion: Float): Int {
        var color = context.getColor(R.color.colorPrimary) //默认颜色
        val p = Palette.from(bitmap)
            .setRegion(0, (bitmap.height * topRegion).toInt(), bitmap.width, bitmap.height)
            .generate()//忽略高为bitmap.getHeight * topRegion区域
        val swatch = p.lightVibrantSwatch
        if (null != swatch) {
            color = swatch.rgb
        }
        return color
    }
}
