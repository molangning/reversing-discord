package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.fabric.FabricComponents;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.StateWrapper;
import p077e5.InterfaceC6107a;
import p150i5.C7382a;
import p414x2.C13677a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class IntBufferBatchMountItem implements MountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_REMOVE_DELETE_TREE = 2048;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    public IntBufferBatchMountItem(int i, int[] iArr, Object[] objArr, int i2) {
        int i3;
        this.mSurfaceId = i;
        this.mCommitNumber = i2;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        if (iArr != null) {
            i3 = iArr.length;
        } else {
            i3 = 0;
        }
        this.mIntBufferLen = i3;
        this.mObjBufferLen = objArr != null ? objArr.length : 0;
    }

    private void beginMarkers(String str) {
        C7382a.m20813c(0L, "FabricUIManager::" + str);
        int i = this.mCommitNumber;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i);
        }
    }

    private static EventEmitterWrapper castToEventEmitter(Object obj) {
        if (obj != null) {
            return (EventEmitterWrapper) obj;
        }
        return null;
    }

    private static StateWrapper castToState(Object obj) {
        if (obj != null) {
            return (StateWrapper) obj;
        }
        return null;
    }

    private void endMarkers() {
        int i = this.mCommitNumber;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i);
        }
        C7382a.m20809g(0L);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            C13677a.m1852l(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
        } else if (surfaceManager.isStopped()) {
            C13677a.m1852l(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
        } else {
            if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                C13677a.m1861c(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.mSurfaceId));
            }
            beginMarkers("mountViews");
            int i7 = 0;
            int i8 = 0;
            while (i7 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                int i11 = i10 & (-2);
                if ((i10 & 1) != 0) {
                    int i12 = iArr[i9];
                    i9++;
                    i = i12;
                } else {
                    i = 1;
                }
                int i13 = i8;
                i7 = i9;
                for (int i14 = 0; i14 < i; i14++) {
                    if (i11 == 2) {
                        int i15 = i13 + 1;
                        String fabricComponentName = FabricComponents.getFabricComponentName((String) this.mObjBuffer[i13]);
                        int i16 = i7 + 1;
                        int i17 = this.mIntBuffer[i7];
                        Object[] objArr = this.mObjBuffer;
                        int i18 = i15 + 1;
                        Object obj = objArr[i15];
                        int i19 = i18 + 1;
                        StateWrapper castToState = castToState(objArr[i18]);
                        int i20 = i19 + 1;
                        EventEmitterWrapper castToEventEmitter = castToEventEmitter(this.mObjBuffer[i19]);
                        i5 = i16 + 1;
                        if (this.mIntBuffer[i16] == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        surfaceManager.createView(fabricComponentName, i17, obj, castToState, castToEventEmitter, z);
                        i13 = i20;
                    } else {
                        if (i11 == 4) {
                            surfaceManager.deleteView(this.mIntBuffer[i7]);
                            i7++;
                        } else {
                            if (i11 == 8) {
                                int[] iArr2 = this.mIntBuffer;
                                int i21 = i7 + 1;
                                int i22 = i21 + 1;
                                i6 = i22 + 1;
                                surfaceManager.addViewAt(iArr2[i21], iArr2[i7], iArr2[i22]);
                            } else if (i11 == 16) {
                                int[] iArr3 = this.mIntBuffer;
                                int i23 = i7 + 1;
                                int i24 = i23 + 1;
                                i6 = i24 + 1;
                                surfaceManager.removeViewAt(iArr3[i7], iArr3[i23], iArr3[i24]);
                            } else if (i11 == 2048) {
                                int[] iArr4 = this.mIntBuffer;
                                int i25 = i7 + 1;
                                int i26 = i25 + 1;
                                i6 = i26 + 1;
                                surfaceManager.removeDeleteTreeAt(iArr4[i7], iArr4[i25], iArr4[i26]);
                            } else {
                                if (i11 == 32) {
                                    i2 = i7 + 1;
                                    i3 = i13 + 1;
                                    surfaceManager.updateProps(this.mIntBuffer[i7], this.mObjBuffer[i13]);
                                } else if (i11 == 64) {
                                    i2 = i7 + 1;
                                    i3 = i13 + 1;
                                    surfaceManager.updateState(this.mIntBuffer[i7], castToState(this.mObjBuffer[i13]));
                                } else if (i11 == INSTRUCTION_UPDATE_LAYOUT) {
                                    int[] iArr5 = this.mIntBuffer;
                                    int i27 = i7 + 1;
                                    int i28 = iArr5[i7];
                                    int i29 = i27 + 1;
                                    int i30 = iArr5[i27];
                                    int i31 = i29 + 1;
                                    int i32 = iArr5[i29];
                                    int i33 = i31 + 1;
                                    int i34 = iArr5[i31];
                                    int i35 = i33 + 1;
                                    int i36 = iArr5[i33];
                                    int i37 = i35 + 1;
                                    i5 = i37 + 1;
                                    surfaceManager.updateLayout(i28, i30, i32, i34, i36, iArr5[i35], iArr5[i37]);
                                } else {
                                    if (i11 == INSTRUCTION_UPDATE_PADDING) {
                                        int[] iArr6 = this.mIntBuffer;
                                        int i38 = i7 + 1;
                                        int i39 = iArr6[i7];
                                        int i40 = i38 + 1;
                                        int i41 = iArr6[i38];
                                        int i42 = i40 + 1;
                                        int i43 = iArr6[i40];
                                        int i44 = i42 + 1;
                                        i4 = i44 + 1;
                                        surfaceManager.updatePadding(i39, i41, i43, iArr6[i42], iArr6[i44]);
                                    } else if (i11 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                        int[] iArr7 = this.mIntBuffer;
                                        int i45 = i7 + 1;
                                        int i46 = iArr7[i7];
                                        int i47 = i45 + 1;
                                        int i48 = iArr7[i45];
                                        int i49 = i47 + 1;
                                        int i50 = iArr7[i47];
                                        int i51 = i49 + 1;
                                        i4 = i51 + 1;
                                        surfaceManager.updateOverflowInset(i46, i48, i50, iArr7[i49], iArr7[i51]);
                                    } else if (i11 == INSTRUCTION_UPDATE_EVENT_EMITTER) {
                                        i2 = i7 + 1;
                                        i3 = i13 + 1;
                                        surfaceManager.updateEventEmitter(this.mIntBuffer[i7], castToEventEmitter(this.mObjBuffer[i13]));
                                    } else {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i11 + " at index: " + i7);
                                    }
                                    i7 = i4;
                                }
                                i7 = i2;
                                i13 = i3;
                            }
                            i7 = i6;
                        }
                    }
                    i7 = i5;
                }
                i8 = i13;
            }
            endMarkers();
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public boolean shouldSchedule() {
        return this.mIntBufferLen != 0;
    }

    public String toString() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.mSurfaceId)));
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                int i10 = i9 & (-2);
                if ((i9 & 1) != 0) {
                    i = iArr[i8];
                    i8++;
                } else {
                    i = 1;
                }
                i6 = i8;
                for (int i11 = 0; i11 < i; i11++) {
                    if (i10 == 2) {
                        int i12 = i6 + 1;
                        i5 = i12 + 1;
                        sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", Integer.valueOf(this.mIntBuffer[i6]), Integer.valueOf(this.mIntBuffer[i12]), FabricComponents.getFabricComponentName((String) this.mObjBuffer[i7])));
                        i7 = i7 + 1 + 3;
                    } else {
                        if (i10 == 4) {
                            i2 = i6 + 1;
                            sb2.append(String.format("DELETE [%d]\n", Integer.valueOf(this.mIntBuffer[i6])));
                        } else if (i10 == 8) {
                            int i13 = i6 + 1;
                            int i14 = i13 + 1;
                            i5 = i14 + 1;
                            sb2.append(String.format("INSERT [%d]->[%d] @%d\n", Integer.valueOf(this.mIntBuffer[i6]), Integer.valueOf(this.mIntBuffer[i13]), Integer.valueOf(this.mIntBuffer[i14])));
                        } else if (i10 == 16) {
                            int i15 = i6 + 1;
                            int i16 = i15 + 1;
                            i5 = i16 + 1;
                            sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", Integer.valueOf(this.mIntBuffer[i6]), Integer.valueOf(this.mIntBuffer[i15]), Integer.valueOf(this.mIntBuffer[i16])));
                        } else if (i10 == 2048) {
                            int i17 = i6 + 1;
                            int i18 = i17 + 1;
                            i5 = i18 + 1;
                            sb2.append(String.format("REMOVE+DELETE TREE [%d]->[%d] @%d\n", Integer.valueOf(this.mIntBuffer[i6]), Integer.valueOf(this.mIntBuffer[i17]), Integer.valueOf(this.mIntBuffer[i18])));
                        } else {
                            if (i10 == 32) {
                                i4 = i7 + 1;
                                Object obj = this.mObjBuffer[i7];
                                i2 = i6 + 1;
                                sb2.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i6]), "<hidden>"));
                            } else if (i10 == 64) {
                                i4 = i7 + 1;
                                castToState(this.mObjBuffer[i7]);
                                i2 = i6 + 1;
                                sb2.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i6]), "<hidden>"));
                            } else {
                                if (i10 == INSTRUCTION_UPDATE_LAYOUT) {
                                    int[] iArr2 = this.mIntBuffer;
                                    int i19 = i6 + 1;
                                    int i20 = iArr2[i6];
                                    int i21 = i19 + 1;
                                    int i22 = i21 + 1;
                                    int i23 = i22 + 1;
                                    int i24 = i23 + 1;
                                    int i25 = i24 + 1;
                                    i3 = i25 + 1;
                                    sb2.append(String.format("UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d\n", Integer.valueOf(iArr2[i19]), Integer.valueOf(i20), Integer.valueOf(this.mIntBuffer[i21]), Integer.valueOf(this.mIntBuffer[i22]), Integer.valueOf(this.mIntBuffer[i23]), Integer.valueOf(this.mIntBuffer[i24]), Integer.valueOf(this.mIntBuffer[i25])));
                                } else if (i10 == INSTRUCTION_UPDATE_PADDING) {
                                    int i26 = i6 + 1;
                                    int i27 = i26 + 1;
                                    int i28 = i27 + 1;
                                    int i29 = i28 + 1;
                                    i3 = i29 + 1;
                                    sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Integer.valueOf(this.mIntBuffer[i6]), Integer.valueOf(this.mIntBuffer[i26]), Integer.valueOf(this.mIntBuffer[i27]), Integer.valueOf(this.mIntBuffer[i28]), Integer.valueOf(this.mIntBuffer[i29])));
                                } else if (i10 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                    int i30 = i6 + 1;
                                    int i31 = i30 + 1;
                                    int i32 = i31 + 1;
                                    int i33 = i32 + 1;
                                    i3 = i33 + 1;
                                    sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Integer.valueOf(this.mIntBuffer[i6]), Integer.valueOf(this.mIntBuffer[i30]), Integer.valueOf(this.mIntBuffer[i31]), Integer.valueOf(this.mIntBuffer[i32]), Integer.valueOf(this.mIntBuffer[i33])));
                                } else if (i10 == INSTRUCTION_UPDATE_EVENT_EMITTER) {
                                    i7++;
                                    i2 = i6 + 1;
                                    sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.mIntBuffer[i6])));
                                } else {
                                    C13677a.m1854j(TAG, "String so far: " + sb2.toString());
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i10 + " at index: " + i6);
                                }
                                i6 = i3;
                            }
                            i7 = i4;
                        }
                        i6 = i2;
                    }
                    i6 = i5;
                }
            }
            return sb2.toString();
        } catch (Exception e) {
            C13677a.m1853k(TAG, "Caught exception trying to print", e);
            StringBuilder sb3 = new StringBuilder();
            for (int i34 = 0; i34 < this.mIntBufferLen; i34++) {
                sb3.append(this.mIntBuffer[i34]);
                sb3.append(", ");
            }
            C13677a.m1854j(TAG, sb3.toString());
            for (int i35 = 0; i35 < this.mObjBufferLen; i35++) {
                String str2 = TAG;
                Object obj2 = this.mObjBuffer[i35];
                if (obj2 != null) {
                    str = obj2.toString();
                } else {
                    str = "null";
                }
                C13677a.m1854j(str2, str);
            }
            return "";
        }
    }
}
