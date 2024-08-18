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

public val MyIconPack.Dark: ImageVector
    get() {
        if (_dark != null) {
            return _dark!!
        }
        _dark = Builder(name = "Dark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(229.379f, 452.85f)
                curveTo(239.106f, 454.339f, 249.068f, 455.111f, 259.212f, 455.111f)
                curveTo(367.214f, 455.111f, 454.767f, 367.558f, 454.767f, 259.556f)
                curveTo(454.767f, 151.553f, 367.214f, 64.0f, 259.212f, 64.0f)
                curveTo(251.966f, 64.0f, 244.811f, 64.394f, 237.77f, 65.162f)
                curveTo(291.345f, 105.751f, 326.767f, 176.062f, 326.767f, 256.0f)
                curveTo(326.767f, 340.04f, 287.616f, 413.44f, 229.379f, 452.85f)
                close()
                moveTo(255.656f, 512.0f)
                curveTo(397.041f, 512.0f, 511.656f, 397.385f, 511.656f, 256.0f)
                curveTo(511.656f, 114.615f, 397.041f, 0.0f, 255.656f, 0.0f)
                curveTo(114.271f, 0.0f, -0.344f, 114.615f, -0.344f, 256.0f)
                curveTo(-0.344f, 397.385f, 114.271f, 512.0f, 255.656f, 512.0f)
                close()
            }
        }
        .build()
        return _dark!!
    }

private var _dark: ImageVector? = null
