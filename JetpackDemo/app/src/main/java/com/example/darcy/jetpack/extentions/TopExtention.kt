package com.example.darcy.jetpack.extentions

import android.util.Log

/**
 * @Author cuiqianbo
 * @Date 2020-10-15-11:18
 * @Description 顶层拓展函数
 */
fun Any.logd(msg: String?) {
    Log.d("TAG-d", msg ?: "--")
}

fun Any.logi(msg: String?) {
    Log.i("TAG-i", msg ?: "--")
}

fun Any.logw(msg: String?) {
    Log.w("TAG-w", msg ?: "--")
}

fun Any.loge(msg: String?) {
    Log.e("TAG-e", msg ?: "--")
}