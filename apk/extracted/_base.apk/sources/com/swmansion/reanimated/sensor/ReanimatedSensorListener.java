package com.swmansion.reanimated.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import com.swmansion.reanimated.nativeProxy.SensorSetter;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReanimatedSensorListener implements SensorEventListener {
    private final Display display;
    private final double interval;
    private SensorSetter setter;
    private double lastRead = System.currentTimeMillis();
    private float[] rotation = new float[9];
    private float[] orientation = new float[3];
    private float[] quaternion = new float[4];

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReanimatedSensorListener(SensorSetter sensorSetter, double d, Display display) {
        this.setter = sensorSetter;
        this.interval = d;
        this.display = display;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        double currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastRead < this.interval) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        this.lastRead = currentTimeMillis;
        int rotation = this.display.getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    i = 0;
                } else {
                    i = 270;
                }
            } else {
                i = 180;
            }
        } else {
            i = 90;
        }
        if (type != 2 && type != 4) {
            switch (type) {
                case 9:
                case 10:
                    float[] fArr = sensorEvent.values;
                    this.setter.sensorSetter(new float[]{-fArr[0], -fArr[1], -fArr[2]}, i);
                    return;
                case 11:
                    SensorManager.getQuaternionFromVector(this.quaternion, sensorEvent.values);
                    SensorManager.getRotationMatrixFromVector(this.rotation, sensorEvent.values);
                    SensorManager.getOrientation(this.rotation, this.orientation);
                    float[] fArr2 = this.quaternion;
                    float[] fArr3 = this.orientation;
                    this.setter.sensorSetter(new float[]{fArr2[1], fArr2[3], -fArr2[2], fArr2[0], -fArr3[0], -fArr3[1], fArr3[2]}, i);
                    return;
                default:
                    throw new IllegalArgumentException("[Reanimated] Unknown sensor type.");
            }
        }
        float[] fArr4 = sensorEvent.values;
        this.setter.sensorSetter(new float[]{fArr4[0], fArr4[1], fArr4[2]}, i);
    }
}
