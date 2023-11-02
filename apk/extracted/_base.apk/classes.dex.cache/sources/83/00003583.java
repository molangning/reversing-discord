package p132h8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import p230m8.C10358c;

/* renamed from: h8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C7027a implements SensorEventListener {

    /* renamed from: j */
    private final float[] f19222j = new float[16];

    /* renamed from: k */
    private final float[] f19223k = new float[16];

    /* renamed from: l */
    private final float[] f19224l = new float[16];

    /* renamed from: m */
    private final float[] f19225m = new float[3];

    /* renamed from: n */
    private final Display f19226n;

    /* renamed from: o */
    private final InterfaceC7028a[] f19227o;

    /* renamed from: p */
    private boolean f19228p;

    /* renamed from: h8.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7028a {
        /* renamed from: a */
        void mo21491a(float[] fArr, float f);
    }

    public C7027a(Display display, InterfaceC7028a... interfaceC7028aArr) {
        this.f19226n = display;
        this.f19227o = interfaceC7028aArr;
    }

    /* renamed from: a */
    private float m21520a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f19223k);
        SensorManager.getOrientation(this.f19223k, this.f19225m);
        return this.f19225m[2];
    }

    /* renamed from: b */
    private void m21519b(float[] fArr, float f) {
        for (InterfaceC7028a interfaceC7028a : this.f19227o) {
            interfaceC7028a.mo21491a(fArr, f);
        }
    }

    /* renamed from: c */
    private void m21518c(float[] fArr) {
        if (!this.f19228p) {
            C10358c.m11674a(this.f19224l, fArr);
            this.f19228p = true;
        }
        float[] fArr2 = this.f19223k;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f19223k, 0, this.f19224l, 0);
    }

    /* renamed from: d */
    private void m21517d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = 130;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i3 = 130;
                }
            } else {
                i3 = 129;
                i2 = 2;
            }
            float[] fArr2 = this.f19223k;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f19223k, i2, i3, fArr);
        }
    }

    /* renamed from: e */
    private static void m21516e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f19222j, sensorEvent.values);
        m21517d(this.f19222j, this.f19226n.getRotation());
        float m21520a = m21520a(this.f19222j);
        m21516e(this.f19222j);
        m21518c(this.f19222j);
        m21519b(this.f19222j, m21520a);
    }
}