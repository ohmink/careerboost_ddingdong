package com.example.calculator;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class TestModule extends ReactContextBaseJavaModule {
    public TestModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "NativeMenu";
    }

    @ReactMethod
    public void openMenu() {
        Toast.makeText(getReactApplicationContext(), "call native from ReactNative", Toast.LENGTH_SHORT).show();;
    }
}