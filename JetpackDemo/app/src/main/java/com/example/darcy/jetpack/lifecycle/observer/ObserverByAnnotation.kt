package com.example.darcy.jetpack.lifecycle.observer

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.example.darcy.jetpack.extentions.logd

/**
 * @Author cuiqianbo
 * @Date 2020-10-15-11:16
 * @Description 通过注解感知生命周期
 */
class ObserverByAnnotation : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartAction(){
        logd("注解感知onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopAction(){
        logd("注解感知onStop")
    }
}