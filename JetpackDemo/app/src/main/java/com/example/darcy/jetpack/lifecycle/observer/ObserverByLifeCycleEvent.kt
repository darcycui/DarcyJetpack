package com.example.darcy.jetpack.lifecycle.observer

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.example.darcy.jetpack.extentions.logw

/**
 * @Author cuiqianbo
 * @Date 2020-10-15-11:34
 * @Description 通过LifeCycle.Event感知生命周期
 */
class ObserverByLifeCycleEvent : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_START -> {
                logw("通过Event感知 onStart")
            }
            Lifecycle.Event.ON_STOP -> {
                logw("通过Event感知 onStop")
            }
        }
    }
}