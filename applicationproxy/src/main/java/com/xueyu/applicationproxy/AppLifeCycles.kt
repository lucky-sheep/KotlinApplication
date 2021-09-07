package com.xueyu.applicationproxy


import android.app.Application

interface AppLifeCycles {

    fun onCreate(application: Application)

    fun onTerminate(application: Application)
}
