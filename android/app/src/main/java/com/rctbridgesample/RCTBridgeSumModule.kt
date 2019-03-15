//  Created by react-native-create-bridge

package com.rctbridgesample.rctbridgesum

import android.os.Build
import android.support.annotation.IntegerRes
import android.support.annotation.RequiresApi
import com.facebook.react.bridge.*
import com.facebook.react.modules.core.DeviceEventManagerModule
import java.lang.Exception
import java.util.*
import java.util.Map

class RCTBridgeSumModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    

    override fun getName(): String {
        // Tell React the name of the module
        // https://facebook.github.io/react-native/docs/native-components-android.html#1-create-the-viewmanager-subclass
        return REACT_CLASS
    }
/*
    override fun getConstants(): Map<String, Any>? {
        // Export any constants to be used in your native module
        // https://facebook.github.io/react-native/docs/native-modules-android.html#the-toast-module
        val reactConstants = Map<String, Any>()
        constants.put("EXAMPLE_CONSTANT", "example")

        return constants
    }*/

    @ReactMethod
    fun sumTwo( a : Int, b :Int, callback: Callback) {
        // An example native method that you will expose to React
        // https://facebook.github.io/react-native/docs/native-modules-android.html#the-toast-module
        try {
            val sum = a.plus(b)
            callback.invoke( sum);
        }catch (e :Exception){
            e.printStackTrace();
            callback.invoke(e.toString(),null);
        }
    }

    @ReactMethod
    fun sum(callback: Callback) {
        callback.invoke(12)
    } 

    companion object {
        val REACT_CLASS = "RCtBridgeSum"
        private var reactContext: ReactApplicationContext? = null

        private fun emitDeviceEvent(eventName: String, eventData: WritableMap?) {
            // A method for emitting from the native side to JS
            // https://facebook.github.io/react-native/docs/native-modules-android.html#sending-events-to-javascript
            reactContext?.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter::class.java)?.emit(eventName, eventData)
        }
    }
}
