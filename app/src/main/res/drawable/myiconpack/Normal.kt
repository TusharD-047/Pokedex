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

public val MyIconPack.Normal: ImageVector
    get() {
        if (_normal != null) {
            return _normal!!
        }
        _normal = Builder(name = "Normal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(481.0f, 256.0f)
                curveTo(481.0f, 380.264f, 380.264f, 481.0f, 256.0f, 481.0f)
                curveTo(131.736f, 481.0f, 31.0f, 380.264f, 31.0f, 256.0f)
                curveTo(31.0f, 131.736f, 131.736f, 31.0f, 256.0f, 31.0f)
                curveTo(380.264f, 31.0f, 481.0f, 131.736f, 481.0f, 256.0f)
                close()
                moveTo(384.571f, 256.0f)
                curveTo(384.571f, 327.008f, 327.008f, 384.571f, 256.0f, 384.571f)
                curveTo(184.992f, 384.571f, 127.429f, 327.008f, 127.429f, 256.0f)
                curveTo(127.429f, 184.992f, 184.992f, 127.429f, 256.0f, 127.429f)
                curveTo(327.008f, 127.429f, 384.571f, 184.992f, 384.571f, 256.0f)
                close()
            }
        }
        .build()
        return _normal!!
    }

private var _normal: ImageVector? = null
