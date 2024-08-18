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

public val MyIconPack.Rock: ImageVector
    get() {
        if (_rock != null) {
            return _rock!!
        }
        _rock = Builder(name = "Rock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(395.138f, 244.757f)
                curveTo(395.109f, 244.717f, 395.097f, 244.667f, 395.105f, 244.618f)
                lineTo(427.769f, 54.152f)
                curveTo(427.784f, 54.064f, 427.861f, 54.0f, 427.949f, 54.0f)
                horizontalLineTo(438.287f)
                curveTo(438.367f, 54.0f, 438.437f, 54.052f, 438.461f, 54.128f)
                lineTo(512.051f, 287.131f)
                curveTo(512.074f, 287.203f, 512.049f, 287.283f, 511.989f, 287.33f)
                lineTo(457.73f, 329.693f)
                curveTo(457.649f, 329.756f, 457.532f, 329.74f, 457.471f, 329.657f)
                lineTo(395.138f, 244.757f)
                close()
                moveTo(-1.0f, 371.022f)
                curveTo(-1.0f, 371.101f, -0.949f, 371.171f, -0.874f, 371.196f)
                lineTo(110.975f, 407.767f)
                curveTo(111.029f, 407.785f, 111.089f, 407.776f, 111.136f, 407.744f)
                lineTo(361.145f, 235.144f)
                curveTo(361.187f, 235.115f, 361.215f, 235.07f, 361.222f, 235.02f)
                lineTo(388.032f, 55.128f)
                curveTo(388.049f, 55.018f, 387.963f, 54.919f, 387.852f, 54.919f)
                horizontalLineTo(166.406f)
                curveTo(166.351f, 54.919f, 166.3f, 54.943f, 166.265f, 54.985f)
                lineTo(-0.958f, 256.714f)
                curveTo(-0.985f, 256.747f, -1.0f, 256.788f, -1.0f, 256.831f)
                verticalLineTo(371.022f)
                close()
                moveTo(157.583f, 417.085f)
                lineTo(279.776f, 457.112f)
                curveTo(279.831f, 457.13f, 279.892f, 457.121f, 279.939f, 457.087f)
                lineTo(425.418f, 352.734f)
                curveTo(425.499f, 352.677f, 425.519f, 352.566f, 425.464f, 352.484f)
                lineTo(370.928f, 271.329f)
                curveTo(370.871f, 271.244f, 370.757f, 271.222f, 370.673f, 271.28f)
                lineTo(157.583f, 417.085f)
                close()
            }
        }
        .build()
        return _rock!!
    }

private var _rock: ImageVector? = null
