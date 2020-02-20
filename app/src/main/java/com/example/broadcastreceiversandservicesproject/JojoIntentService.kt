package com.example.broadcastreceiversandservicesproject

import android.app.IntentService
import android.content.Intent
import android.content.Context

// TODO: Rename actions, choose action names that describe tasks that this
const val ACTION_PICK_RANDOM = "com.example.broadcastreceiversandservicesproject.action.FOO"
private const val ACTION_BAZ = "com.example.broadcastreceiversandservicesproject.action.BAZ"

// TODO: Rename parameters
private const val RANDOM_LIST = "com.example.broadcastreceiversandservicesproject.extra.PARAM1"
private const val EXTRA_PARAM2 = "com.example.broadcastreceiversandservicesproject.extra.PARAM2"

/**
 * An [IntentService] subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
class JojoIntentService : IntentService("JojoIntentService") {

    override fun onHandleIntent(intent: Intent?) {
        when (intent?.action) {
            ACTION_PICK_RANDOM -> {
                val param1 = intent.getStringExtra(RANDOM_LIST)
                val param2 = intent.getStringExtra(EXTRA_PARAM2)
                handleActionFoo(param1, param2)
            }
            ACTION_BAZ -> {
                val param1 = intent.getStringExtra(RANDOM_LIST)
                val param2 = intent.getStringExtra(EXTRA_PARAM2)
                handleActionBaz(param1, param2)
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private fun handleActionFoo(param1: String, param2: String) {
        TODO("Handle action Foo")
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private fun handleActionBaz(param1: String, param2: String) {
        TODO("Handle action Baz")
    }

    companion object {
        /**
         * Starts this service to perform action Foo with the given parameters. If
         * the service is already performing a task this action will be queued.
         *
         * @see IntentService
         */
        // TODO: Customize helper method
        @JvmStatic
        fun startActionFoo(context: Context, param1: String, param2: String) {
            val intent = Intent(context, JojoIntentService::class.java).apply {
                action = ACTION_PICK_RANDOM
                putExtra(RANDOM_LIST, param1)
                putExtra(EXTRA_PARAM2, param2)
            }
            context.startService(intent)
        }

        /**
         * Starts this service to perform action Baz with the given parameters. If
         * the service is already performing a task this action will be queued.
         *
         * @see IntentService
         */
        // TODO: Customize helper method
        @JvmStatic
        fun startActionBaz(context: Context, param1: String, param2: String) {
            val intent = Intent(context, JojoIntentService::class.java).apply {
                action = ACTION_BAZ
                putExtra(RANDOM_LIST, param1)
                putExtra(EXTRA_PARAM2, param2)
            }
            context.startService(intent)
        }
    }
}
