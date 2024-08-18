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

public val MyIconPack.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(368.952f, 510.227f)
                curveTo(322.769f, 512.591f, 269.896f, 512.591f, 251.928f, 510.227f)
                curveTo(111.77f, 491.788f, 0.0f, 389.313f, 0.0f, 250.8f)
                curveTo(0.0f, 112.287f, 114.615f, 0.0f, 256.0f, 0.0f)
                curveTo(397.385f, 0.0f, 512.0f, 112.287f, 512.0f, 250.8f)
                curveTo(512.0f, 315.221f, 487.207f, 373.969f, 446.46f, 418.387f)
                curveTo(435.395f, 430.448f, 450.577f, 438.908f, 466.002f, 447.504f)
                curveTo(481.13f, 455.935f, 496.492f, 464.496f, 487.564f, 476.712f)
                curveTo(477.726f, 490.173f, 424.392f, 507.389f, 368.952f, 510.227f)
                close()
                moveTo(220.0f, 219.45f)
                curveTo(220.0f, 241.092f, 202.091f, 258.637f, 180.0f, 258.637f)
                curveTo(157.909f, 258.637f, 140.0f, 241.092f, 140.0f, 219.45f)
                curveTo(140.0f, 204.935f, 148.055f, 192.264f, 160.024f, 185.491f)
                curveTo(160.713f, 204.362f, 176.229f, 219.449f, 195.269f, 219.449f)
                horizontalLineTo(220.0f)
                curveTo(220.0f, 219.449f, 220.0f, 219.45f, 220.0f, 219.45f)
                close()
                moveTo(343.976f, 185.491f)
                curveTo(343.287f, 204.362f, 327.771f, 219.449f, 308.731f, 219.449f)
                horizontalLineTo(284.0f)
                curveTo(284.0f, 219.449f, 284.0f, 219.45f, 284.0f, 219.45f)
                curveTo(284.0f, 241.092f, 301.909f, 258.637f, 324.0f, 258.637f)
                curveTo(346.091f, 258.637f, 364.0f, 241.092f, 364.0f, 219.45f)
                curveTo(364.0f, 204.935f, 355.945f, 192.264f, 343.976f, 185.491f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
