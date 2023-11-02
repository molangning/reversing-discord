package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i) {
        double d = this.targetFramerateFps;
        if (d == 0.0d) {
            return;
        }
        int i2 = this.targetBitrateBps;
        double d2 = this.deviationBytes + (i - ((i2 / BITS_PER_BYTE) / d));
        this.deviationBytes = d2;
        this.timeSinceLastAdjustmentMs += 1000.0d / d;
        double d3 = i2 / BITS_PER_BYTE;
        double d4 = BITRATE_ADJUSTMENT_SEC * d3;
        double min = Math.min(d2, d4);
        this.deviationBytes = min;
        double max = Math.max(min, -d4);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d3) {
            int i3 = this.bitrateAdjustmentScaleExp - ((int) ((max / d3) + 0.5d));
            this.bitrateAdjustmentScaleExp = i3;
            this.bitrateAdjustmentScaleExp = Math.max(i3, -20);
            this.deviationBytes = d3;
        } else {
            double d5 = -d3;
            if (max < d5) {
                int i4 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d3) + 0.5d));
                this.bitrateAdjustmentScaleExp = i4;
                this.bitrateAdjustmentScaleExp = Math.min(i4, 20);
                this.deviationBytes = d5;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i, double d) {
        int i2 = this.targetBitrateBps;
        if (i2 > 0 && i < i2) {
            this.deviationBytes = (this.deviationBytes * i) / i2;
        }
        super.setTargets(i, d);
    }
}