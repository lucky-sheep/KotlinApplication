package com.hunliji.integration_mw

import android.app.Application

/**
 * ConfigModule
 *
 * @author wm
 * @date 19-8-14
 */
interface ConfigModule{
    fun injectApp(application: Application)

    fun terminateApp(application: Application)
}