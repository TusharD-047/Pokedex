package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(352.258f, 395.394f)
                curveTo(358.584f, 372.263f, 346.305f, 324.71f, 346.305f, 324.71f)
                curveTo(346.305f, 324.71f, 337.399f, 363.449f, 323.483f, 377.767f)
                curveTo(311.611f, 389.98f, 297.066f, 398.451f, 276.206f, 400.677f)
                curveTo(293.261f, 392.393f, 304.99f, 375.12f, 304.99f, 355.155f)
                curveTo(304.99f, 327.129f, 281.878f, 304.409f, 253.368f, 304.409f)
                curveTo(224.858f, 304.409f, 201.745f, 327.129f, 201.745f, 355.155f)
                curveTo(201.745f, 362.809f, 203.47f, 370.068f, 206.557f, 376.576f)
                curveTo(188.725f, 362.37f, 185.921f, 339.594f, 185.921f, 339.594f)
                curveTo(185.921f, 339.594f, 166.009f, 422.264f, 220.875f, 461.152f)
                curveTo(275.74f, 500.04f, 383.219f, 466.614f, 383.219f, 466.614f)
                curveTo(383.219f, 466.614f, 229.41f, 574.837f, 115.436f, 457.05f)
                curveTo(17.257f, 355.584f, 89.811f, 222.003f, 89.811f, 222.003f)
                curveTo(89.811f, 222.003f, 86.678f, 234.395f, 86.678f, 248.78f)
                curveTo(86.678f, 263.165f, 94.477f, 274.11f, 94.477f, 274.11f)
                curveTo(94.477f, 274.11f, 117.742f, 225.071f, 135.848f, 205.128f)
                curveTo(152.984f, 186.254f, 174.465f, 170.946f, 193.019f, 157.724f)
                curveTo(207.301f, 147.546f, 219.849f, 138.604f, 227.343f, 130.223f)
                curveTo(268.62f, 84.069f, 243.311f, 0.0f, 243.311f, 0.0f)
                curveTo(243.311f, 0.0f, 289.841f, 41.02f, 302.831f, 93.998f)
                curveTo(307.783f, 114.192f, 304.597f, 137.169f, 301.749f, 157.716f)
                curveTo(297.125f, 191.072f, 293.388f, 218.025f, 326.793f, 216.276f)
                curveTo(380.775f, 213.449f, 333.866f, 130.223f, 333.866f, 130.223f)
                curveTo(333.866f, 130.223f, 456.318f, 194.583f, 447.17f, 307.145f)
                curveTo(438.021f, 419.707f, 313.324f, 445.297f, 313.324f, 445.297f)
                curveTo(313.324f, 445.297f, 345.931f, 418.525f, 352.258f, 395.394f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
