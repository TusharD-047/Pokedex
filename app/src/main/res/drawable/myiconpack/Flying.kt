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

public val MyIconPack.Flying: ImageVector
    get() {
        if (_flying != null) {
            return _flying!!
        }
        _flying = Builder(name = "Flying", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(178.712f, 477.733f)
                curveTo(253.715f, 477.733f, 317.927f, 436.048f, 344.436f, 376.956f)
                curveTo(344.76f, 376.235f, 238.007f, 404.699f, 241.411f, 394.637f)
                curveTo(242.931f, 390.144f, 308.371f, 366.238f, 356.048f, 338.354f)
                curveTo(383.451f, 322.327f, 396.07f, 288.4f, 396.07f, 288.4f)
                curveTo(396.07f, 288.4f, 349.903f, 310.815f, 326.564f, 316.501f)
                curveTo(279.532f, 327.961f, 238.131f, 326.727f, 238.131f, 325.533f)
                curveTo(238.131f, 322.951f, 306.876f, 309.889f, 402.424f, 251.664f)
                curveTo(447.367f, 224.277f, 459.574f, 177.103f, 459.574f, 177.103f)
                curveTo(459.574f, 177.103f, 410.163f, 206.535f, 380.293f, 216.252f)
                curveTo(309.457f, 239.295f, 244.815f, 246.239f, 244.815f, 243.121f)
                curveTo(244.815f, 236.445f, 301.702f, 220.802f, 362.016f, 191.577f)
                curveTo(393.376f, 176.382f, 420.535f, 156.53f, 452.008f, 134.453f)
                curveTo(503.506f, 98.332f, 511.999f, 34.0f, 511.999f, 34.0f)
                curveTo(511.999f, 34.0f, 461.207f, 66.76f, 436.42f, 77.639f)
                curveTo(334.141f, 122.531f, 243.829f, 146.079f, 178.712f, 151.177f)
                curveTo(80.416f, 158.873f, 0.0f, 227.456f, 0.0f, 316.501f)
                curveTo(0.0f, 405.547f, 80.012f, 477.733f, 178.712f, 477.733f)
                close()
            }
        }
        .build()
        return _flying!!
    }

private var _flying: ImageVector? = null
