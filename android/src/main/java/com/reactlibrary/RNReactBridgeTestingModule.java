
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNReactBridgeTestingModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactBridgeTestingModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactBridgeTesting";
  }

  @ReactMethod
  public void sumTwo( int a, int b, Callback callback) {
        // An example native method that you will expose to React
        // https://facebook.github.io/react-native/docs/native-modules-android.html#the-toast-module
        try {
            int sum = a+b;
            callback.invoke( sum);
        }catch (Exception e){
            e.printStackTrace();
            callback.invoke(e.toString());
        }
    }
}