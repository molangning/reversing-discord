package com.facebook.react.modules.vibration;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeVibrationSpec.NAME)
@SuppressLint({"MissingPermission"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class VibrationModule extends NativeVibrationSpec {
    public VibrationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double d) {
        VibrationEffect createOneShot;
        int i = (int) d;
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            createOneShot = VibrationEffect.createOneShot(i, -1);
            vibrator.vibrate(createOneShot);
            return;
        }
        vibrator.vibrate(i);
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray readableArray, double d) {
        VibrationEffect createWaveform;
        int i = (int) d;
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        long[] jArr = new long[readableArray.size()];
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            jArr[i2] = readableArray.getInt(i2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            createWaveform = VibrationEffect.createWaveform(jArr, i);
            vibrator.vibrate(createWaveform);
            return;
        }
        vibrator.vibrate(jArr, i);
    }
}
