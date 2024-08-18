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

public val MyIconPack.Poison: ImageVector
    get() {
        if (_poison != null) {
            return _poison!!
        }
        _poison = Builder(name = "Poison", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(427.821f, 393.449f)
                curveTo(479.524f, 352.108f, 512.0f, 292.376f, 512.0f, 225.95f)
                curveTo(512.0f, 101.161f, 397.385f, 0.0f, 256.0f, 0.0f)
                curveTo(114.615f, 0.0f, 0.0f, 101.161f, 0.0f, 225.95f)
                curveTo(0.0f, 289.978f, 30.174f, 347.786f, 78.655f, 388.901f)
                curveTo(75.717f, 399.046f, 74.105f, 410.081f, 74.105f, 421.62f)
                curveTo(74.105f, 471.535f, 104.267f, 512.0f, 141.474f, 512.0f)
                curveTo(165.65f, 512.0f, 186.852f, 494.915f, 198.737f, 469.254f)
                curveTo(210.622f, 494.915f, 231.824f, 512.0f, 256.0f, 512.0f)
                curveTo(278.038f, 512.0f, 297.604f, 497.804f, 309.895f, 475.857f)
                curveTo(322.186f, 497.804f, 341.752f, 512.0f, 363.789f, 512.0f)
                curveTo(400.996f, 512.0f, 431.158f, 471.535f, 431.158f, 421.62f)
                curveTo(431.158f, 411.784f, 429.986f, 402.314f, 427.821f, 393.449f)
                close()
                moveTo(404.211f, 230.431f)
                curveTo(404.211f, 293.785f, 336.346f, 345.144f, 252.632f, 345.144f)
                curveTo(168.917f, 345.144f, 101.053f, 293.785f, 101.053f, 230.431f)
                curveTo(101.053f, 167.077f, 168.917f, 115.718f, 252.632f, 115.718f)
                curveTo(336.346f, 115.718f, 404.211f, 167.077f, 404.211f, 230.431f)
                close()
            }
        }
        .build()
        return _poison!!
    }

private var _poison: ImageVector? = null
