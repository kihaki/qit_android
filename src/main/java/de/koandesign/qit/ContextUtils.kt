package de.koandesign.qit

import android.content.Context
import androidx.annotation.RawRes

fun Context.readRawGLSLShader(@RawRes file: Int): String {
    val builder = StringBuilder()
    resources.openRawResource(file).bufferedReader().use { reader ->
        while (true) {
            val line = reader.readLine() ?: break
            builder.append(line)
            builder.append(System.getProperty("line.separator"))
        }
    }
    return builder.toString()
}
