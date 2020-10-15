package com.example.darcy.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.darcy.jetpack.lifecycle.observer.ObserverByAnnotation
import com.example.darcy.jetpack.lifecycle.observer.ObserverByInterface
import com.example.darcy.jetpack.lifecycle.observer.ObserverByLifeCycleEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerLifeCycleObservers()
    }

    private fun registerLifeCycleObservers() {
        //注册生命周期监听
        lifecycle.addObserver(ObserverByAnnotation())
        lifecycle.addObserver(ObserverByInterface())
        lifecycle.addObserver(ObserverByLifeCycleEvent())
        //NOTE 注册完了 不需要解注册吗?
    }
}
