package com.xueyu.applicationproxy

import android.app.Application


interface ConfigModule{
    fun injectApp(application: Application)

    fun terminateApp(application: Application)

    fun getPriority(): Int
}
