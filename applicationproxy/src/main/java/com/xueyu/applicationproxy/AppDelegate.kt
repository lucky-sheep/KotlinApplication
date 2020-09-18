package com.xueyu.applicationproxy

import android.app.Application
import android.content.Context

/**
 * AppDelegate
 *
 * @author wm
 * @date 19-8-19
 */
class AppDelegate(context: Context) : AppLifeCycles {
    private var mModules: List<ConfigModule>? = null

    init {
        mModules = ManifestParser(context).parse()
    }

    override fun onCreate(application: Application) {
        mModules?.forEach {
            it.injectApp(application)
        }
    }

    override fun onTerminate(application: Application) {
        mModules?.forEach {
            it.terminateApp(application)
        }
    }
}
