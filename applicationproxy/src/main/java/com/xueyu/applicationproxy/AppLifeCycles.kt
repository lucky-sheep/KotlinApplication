package com.hunliji.integration_mw


import android.app.Application

/**
 * AppLifeCycles
 *
 * @author wm
 * @date 19-8-19
 */
interface AppLifeCycles {

    fun onCreate(application: Application)

    fun onTerminate(application: Application)
}