package com.example.darcy.jetpack.lifecycle.observer

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.darcy.jetpack.extentions.logi

/**
 * @Author cuiqianbo
 * @Date 2020-10-15-11:23
 * @Description 自定义接口感知生命周期
 */
class ObserverByInterface : DefaultLifecycleObserver {

    //重写onStart回调方法
    override fun onStart(owner: LifecycleOwner) {
        logi("自定义接口感知 onStart")
    }

    //重写onStop回调方法
    override fun onStop(owner: LifecycleOwner) {
        logi("自定义接口感知 onStop")
    }

}