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

public val MyIconPack.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(name = "Water", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(422.172f, 346.515f)
                curveTo(422.172f, 437.897f, 347.813f, 511.977f, 256.086f, 511.977f)
                curveTo(164.359f, 511.977f, 90.0f, 437.897f, 90.0f, 346.515f)
                curveTo(90.0f, 257.639f, 247.102f, 13.548f, 255.718f, 0.228f)
                curveTo(255.915f, -0.076f, 256.258f, -0.076f, 256.454f, 0.228f)
                curveTo(265.07f, 13.548f, 422.172f, 257.639f, 422.172f, 346.515f)
                close()
                moveTo(228.4f, 458.931f)
                curveTo(144.12f, 440.49f, 158.542f, 347.13f, 158.542f, 347.13f)
                curveTo(158.542f, 347.13f, 181.556f, 403.488f, 237.405f, 421.744f)
                curveTo(293.253f, 439.999f, 360.745f, 413.225f, 360.745f, 413.225f)
                curveTo(360.745f, 413.225f, 312.68f, 477.371f, 228.4f, 458.931f)
                close()
            }
        }
        .build()
        return _water!!
    }

private var _water: ImageVector? = null
