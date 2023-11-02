package com.swmansion.reanimated.sensor;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);
    
    private final int type;

    ReanimatedSensorType(int i) {
        this.type = i;
    }

    public static ReanimatedSensorType getInstanceById(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return ROTATION_VECTOR;
                        }
                        throw new IllegalArgumentException("[Reanimated] Unknown sensor type.");
                    }
                    return MAGNETIC_FIELD;
                }
                return GRAVITY;
            }
            return GYROSCOPE;
        }
        return ACCELEROMETER;
    }

    public int getType() {
        return this.type;
    }
}