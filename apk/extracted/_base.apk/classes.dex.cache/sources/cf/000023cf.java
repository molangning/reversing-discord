package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeAnimatedNodesManager implements EventDispatcherListener {
    private static final String TAG = "NativeAnimatedNodesManager";
    private final ReactApplicationContext mReactApplicationContext;
    private final SparseArray<AnimatedNode> mAnimatedNodes = new SparseArray<>();
    private final SparseArray<AnimationDriver> mActiveAnimations = new SparseArray<>();
    private final SparseArray<AnimatedNode> mUpdatedNodes = new SparseArray<>();
    private final List<EventAnimationDriver> mEventDrivers = new ArrayList();
    private int mAnimatedGraphBFSColor = 0;
    private final List<AnimatedNode> mRunUpdateNodeList = new LinkedList();
    private boolean mEventListenerInitializedForFabric = false;
    private boolean mEventListenerInitializedForNonFabric = false;
    private boolean mWarnedAboutGraphTraversal = false;

    public NativeAnimatedNodesManager(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    public void handleEvent(Event event) {
        ReactApplicationContext reactApplicationContext;
        if (this.mEventDrivers.isEmpty() || (reactApplicationContext = this.mReactApplicationContext) == null || UIManagerHelper.getUIManager(reactApplicationContext, event.getUIManagerType()) == null) {
            return;
        }
        Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec = event.getEventAnimationDriverMatchSpec();
        boolean z = false;
        for (EventAnimationDriver eventAnimationDriver : this.mEventDrivers) {
            if (eventAnimationDriverMatchSpec.match(eventAnimationDriver.mViewTag, eventAnimationDriver.mEventName)) {
                stopAnimationsForNode(eventAnimationDriver.mValueNode);
                event.dispatch(eventAnimationDriver);
                this.mRunUpdateNodeList.add(eventAnimationDriver.mValueNode);
                z = true;
            }
        }
        if (z) {
            updateNodes(this.mRunUpdateNodeList);
            this.mRunUpdateNodeList.clear();
        }
    }

    private String normalizeEventName(String str) {
        if (str.startsWith(ViewProps.f10920ON)) {
            return ViewProps.TOP + str.substring(2);
        }
        return str;
    }

    private void stopAnimationsForNode(AnimatedNode animatedNode) {
        int i = 0;
        while (i < this.mActiveAnimations.size()) {
            AnimationDriver valueAt = this.mActiveAnimations.valueAt(i);
            if (animatedNode.equals(valueAt.mAnimatedValue)) {
                if (valueAt.mEndCallback != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.mEndCallback.invoke(createMap);
                } else if (this.mReactApplicationContext != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("animationId", valueAt.mId);
                    createMap2.putBoolean("finished", false);
                    this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", createMap2);
                }
                this.mActiveAnimations.removeAt(i);
                i--;
            }
            i++;
        }
    }

    private void updateNodes(List<AnimatedNode> list) {
        String str;
        int i = this.mAnimatedGraphBFSColor + 1;
        this.mAnimatedGraphBFSColor = i;
        if (i == 0) {
            this.mAnimatedGraphBFSColor = i + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        for (AnimatedNode animatedNode : list) {
            int i3 = animatedNode.mBFSColor;
            int i4 = this.mAnimatedGraphBFSColor;
            if (i3 != i4) {
                animatedNode.mBFSColor = i4;
                i2++;
                arrayDeque.add(animatedNode);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode2 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode2.mChildren != null) {
                for (int i5 = 0; i5 < animatedNode2.mChildren.size(); i5++) {
                    AnimatedNode animatedNode3 = animatedNode2.mChildren.get(i5);
                    animatedNode3.mActiveIncomingNodes++;
                    int i6 = animatedNode3.mBFSColor;
                    int i7 = this.mAnimatedGraphBFSColor;
                    if (i6 != i7) {
                        animatedNode3.mBFSColor = i7;
                        i2++;
                        arrayDeque.add(animatedNode3);
                    }
                }
            }
        }
        int i8 = this.mAnimatedGraphBFSColor + 1;
        this.mAnimatedGraphBFSColor = i8;
        if (i8 == 0) {
            this.mAnimatedGraphBFSColor = i8 + 1;
        }
        int i9 = 0;
        for (AnimatedNode animatedNode4 : list) {
            if (animatedNode4.mActiveIncomingNodes == 0) {
                int i10 = animatedNode4.mBFSColor;
                int i11 = this.mAnimatedGraphBFSColor;
                if (i10 != i11) {
                    animatedNode4.mBFSColor = i11;
                    i9++;
                    arrayDeque.add(animatedNode4);
                }
            }
        }
        int i12 = 0;
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode5 = (AnimatedNode) arrayDeque.poll();
            try {
                animatedNode5.update();
                if (animatedNode5 instanceof PropsAnimatedNode) {
                    ((PropsAnimatedNode) animatedNode5).updateView();
                }
            } catch (JSApplicationCausedNativeException e) {
                C13677a.m1853k(TAG, "Native animation workaround, frame lost as result of race condition", e);
            }
            if (animatedNode5 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode5).onValueUpdate();
            }
            if (animatedNode5.mChildren != null) {
                for (int i13 = 0; i13 < animatedNode5.mChildren.size(); i13++) {
                    AnimatedNode animatedNode6 = animatedNode5.mChildren.get(i13);
                    int i14 = animatedNode6.mActiveIncomingNodes - 1;
                    animatedNode6.mActiveIncomingNodes = i14;
                    int i15 = animatedNode6.mBFSColor;
                    int i16 = this.mAnimatedGraphBFSColor;
                    if (i15 != i16 && i14 == 0) {
                        animatedNode6.mBFSColor = i16;
                        i9++;
                        arrayDeque.add(animatedNode6);
                    } else if (i15 == i16) {
                        i12++;
                    }
                }
            }
        }
        if (i2 != i9) {
            if (this.mWarnedAboutGraphTraversal) {
                return;
            }
            this.mWarnedAboutGraphTraversal = true;
            C13677a.m1854j(TAG, "Detected animation cycle or disconnected graph. ");
            for (AnimatedNode animatedNode7 : list) {
                C13677a.m1854j(TAG, animatedNode7.prettyPrintWithChildren());
            }
            if (i12 > 0) {
                str = "cycles (" + i12 + ")";
            } else {
                str = "disconnected regions";
            }
            IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + str + ", there are " + i2 + " but toposort visited only " + i9);
            boolean z = this.mEventListenerInitializedForFabric;
            if (z && i12 == 0) {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
                return;
            } else if (z) {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
                return;
            } else {
                throw illegalStateException;
            }
        }
        this.mWarnedAboutGraphTraversal = false;
    }

    public void addAnimatedEventToView(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode != null) {
            if (animatedNode instanceof ValueAnimatedNode) {
                ReadableArray array = readableMap.getArray("nativeEventPath");
                ArrayList arrayList = new ArrayList(array.size());
                for (int i3 = 0; i3 < array.size(); i3++) {
                    arrayList.add(array.getString(i3));
                }
                this.mEventDrivers.add(new EventAnimationDriver(normalizeEventName(str), i, arrayList, (ValueAnimatedNode) animatedNode));
                return;
            }
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i + "] connected to event handler (" + str + ") should be of type " + ValueAnimatedNode.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i2 + "] does not exist");
    }

    public void connectAnimatedNodeToView(int i, int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            if (animatedNode instanceof PropsAnimatedNode) {
                ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
                if (reactApplicationContext != null) {
                    UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactApplicationContext, i2);
                    if (uIManagerForReactTag == null) {
                        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i2));
                        return;
                    }
                    ((PropsAnimatedNode) animatedNode).connectToView(i2, uIManagerForReactTag);
                    this.mUpdatedNodes.put(i, animatedNode);
                    return;
                }
                throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i2);
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i2 + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i + "] does not exist");
    }

    public void connectAnimatedNodes(int i, int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            AnimatedNode animatedNode2 = this.mAnimatedNodes.get(i2);
            if (animatedNode2 != null) {
                animatedNode.addChild(animatedNode2);
                this.mUpdatedNodes.put(i2, animatedNode2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i2 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i + "] does not exist");
    }

    public void createAnimatedNode(int i, ReadableMap readableMap) {
        AnimatedNode trackingAnimatedNode;
        if (this.mAnimatedNodes.get(i) == null) {
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                trackingAnimatedNode = new StyleAnimatedNode(readableMap, this);
            } else if ("value".equals(string)) {
                trackingAnimatedNode = new ValueAnimatedNode(readableMap);
            } else if (ViewProps.COLOR.equals(string)) {
                trackingAnimatedNode = new ColorAnimatedNode(readableMap, this, this.mReactApplicationContext);
            } else if ("props".equals(string)) {
                trackingAnimatedNode = new PropsAnimatedNode(readableMap, this);
            } else if ("interpolation".equals(string)) {
                trackingAnimatedNode = new InterpolationAnimatedNode(readableMap);
            } else if ("addition".equals(string)) {
                trackingAnimatedNode = new AdditionAnimatedNode(readableMap, this);
            } else if ("subtraction".equals(string)) {
                trackingAnimatedNode = new SubtractionAnimatedNode(readableMap, this);
            } else if ("division".equals(string)) {
                trackingAnimatedNode = new DivisionAnimatedNode(readableMap, this);
            } else if ("multiplication".equals(string)) {
                trackingAnimatedNode = new MultiplicationAnimatedNode(readableMap, this);
            } else if ("modulus".equals(string)) {
                trackingAnimatedNode = new ModulusAnimatedNode(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                trackingAnimatedNode = new DiffClampAnimatedNode(readableMap, this);
            } else if (ViewProps.TRANSFORM.equals(string)) {
                trackingAnimatedNode = new TransformAnimatedNode(readableMap, this);
            } else if ("tracking".equals(string)) {
                trackingAnimatedNode = new TrackingAnimatedNode(readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            trackingAnimatedNode.mTag = i;
            this.mAnimatedNodes.put(i, trackingAnimatedNode);
            this.mUpdatedNodes.put(i, trackingAnimatedNode);
            return;
        }
        throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i + "] already exists");
    }

    public void disconnectAnimatedNodeFromView(int i, int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            if (animatedNode instanceof PropsAnimatedNode) {
                ((PropsAnimatedNode) animatedNode).disconnectFromView(i2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i2 + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i + "] does not exist");
    }

    public void disconnectAnimatedNodes(int i, int i2) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            AnimatedNode animatedNode2 = this.mAnimatedNodes.get(i2);
            if (animatedNode2 != null) {
                animatedNode.removeChild(animatedNode2);
                this.mUpdatedNodes.put(i2, animatedNode2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i2 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i + "] does not exist");
    }

    public void dropAnimatedNode(int i) {
        this.mAnimatedNodes.remove(i);
        this.mUpdatedNodes.remove(i);
    }

    public void extractAnimatedNodeOffset(int i) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).extractOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i + "] does not exist, or is not a 'value' node");
    }

    public void flattenAnimatedNodeOffset(int i) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).flattenOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i + "] does not exist, or is not a 'value' node");
    }

    public AnimatedNode getNodeById(int i) {
        return this.mAnimatedNodes.get(i);
    }

    public void getValue(int i, Callback callback) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            double value = ((ValueAnimatedNode) animatedNode).getValue();
            if (callback != null) {
                callback.invoke(Double.valueOf(value));
                return;
            } else if (this.mReactApplicationContext == null) {
                return;
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("tag", i);
                createMap.putDouble("value", value);
                this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", createMap);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i + "] does not exist or is not a 'value' node");
    }

    public boolean hasActiveAnimations() {
        return this.mActiveAnimations.size() > 0 || this.mUpdatedNodes.size() > 0;
    }

    public void initializeEventListenerForUIManagerType(int i) {
        if (i == 2) {
            if (this.mEventListenerInitializedForFabric) {
                return;
            }
        } else if (this.mEventListenerInitializedForNonFabric) {
            return;
        }
        UIManager uIManager = UIManagerHelper.getUIManager(this.mReactApplicationContext, i);
        if (uIManager != null) {
            ((EventDispatcher) uIManager.getEventDispatcher()).addListener(this);
            if (i == 2) {
                this.mEventListenerInitializedForFabric = true;
            } else {
                this.mEventListenerInitializedForNonFabric = true;
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(final Event event) {
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.animated.NativeAnimatedNodesManager.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeAnimatedNodesManager.this.handleEvent(event);
                }
            });
        }
    }

    public void removeAnimatedEventFromView(int i, String str, int i2) {
        String normalizeEventName = normalizeEventName(str);
        ListIterator<EventAnimationDriver> listIterator = this.mEventDrivers.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (normalizeEventName.equals(next.mEventName) && i == next.mViewTag && i2 == next.mValueNode.mTag) {
                listIterator.remove();
                return;
            }
        }
    }

    public void restoreDefaultValues(int i) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode == null) {
            return;
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + PropsAnimatedNode.class.getName());
    }

    public void runUpdates(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.mUpdatedNodes.size(); i++) {
            this.mRunUpdateNodeList.add(this.mUpdatedNodes.valueAt(i));
        }
        this.mUpdatedNodes.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.mActiveAnimations.size(); i2++) {
            AnimationDriver valueAt = this.mActiveAnimations.valueAt(i2);
            valueAt.runAnimationStep(j);
            this.mRunUpdateNodeList.add(valueAt.mAnimatedValue);
            if (valueAt.mHasFinished) {
                z = true;
            }
        }
        updateNodes(this.mRunUpdateNodeList);
        this.mRunUpdateNodeList.clear();
        if (z) {
            for (int size = this.mActiveAnimations.size() - 1; size >= 0; size--) {
                AnimationDriver valueAt2 = this.mActiveAnimations.valueAt(size);
                if (valueAt2.mHasFinished) {
                    if (valueAt2.mEndCallback != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        valueAt2.mEndCallback.invoke(createMap);
                    } else if (this.mReactApplicationContext != null) {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putInt("animationId", valueAt2.mId);
                        createMap2.putBoolean("finished", true);
                        this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", createMap2);
                    }
                    this.mActiveAnimations.removeAt(size);
                }
            }
        }
    }

    public void setAnimatedNodeOffset(int i, double d) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).mOffset = d;
            this.mUpdatedNodes.put(i, animatedNode);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i + "] does not exist, or is not a 'value' node");
    }

    public void setAnimatedNodeValue(int i, double d) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            stopAnimationsForNode(animatedNode);
            ((ValueAnimatedNode) animatedNode).mValue = d;
            this.mUpdatedNodes.put(i, animatedNode);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i + "] does not exist, or is not a 'value' node");
    }

    public void startAnimatingNode(int i, int i2, ReadableMap readableMap, Callback callback) {
        AnimationDriver decayAnimation;
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i2);
        if (animatedNode != null) {
            if (animatedNode instanceof ValueAnimatedNode) {
                AnimationDriver animationDriver = this.mActiveAnimations.get(i);
                if (animationDriver != null) {
                    animationDriver.resetConfig(readableMap);
                    return;
                }
                String string = readableMap.getString("type");
                if ("frames".equals(string)) {
                    decayAnimation = new FrameBasedAnimationDriver(readableMap);
                } else if ("spring".equals(string)) {
                    decayAnimation = new SpringAnimation(readableMap);
                } else if ("decay".equals(string)) {
                    decayAnimation = new DecayAnimation(readableMap);
                } else {
                    throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i2 + "]: " + string);
                }
                decayAnimation.mId = i;
                decayAnimation.mEndCallback = callback;
                decayAnimation.mAnimatedValue = (ValueAnimatedNode) animatedNode;
                this.mActiveAnimations.put(i, decayAnimation);
                return;
            }
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i2 + "] should be of type " + ValueAnimatedNode.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i2 + "] does not exist");
    }

    public void startListeningToAnimatedNodeValue(int i, AnimatedNodeValueListener animatedNodeValueListener) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(animatedNodeValueListener);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i + "] does not exist, or is not a 'value' node");
    }

    public void stopAnimation(int i) {
        for (int i2 = 0; i2 < this.mActiveAnimations.size(); i2++) {
            AnimationDriver valueAt = this.mActiveAnimations.valueAt(i2);
            if (valueAt.mId == i) {
                if (valueAt.mEndCallback != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.mEndCallback.invoke(createMap);
                } else if (this.mReactApplicationContext != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("animationId", valueAt.mId);
                    createMap2.putBoolean("finished", false);
                    this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", createMap2);
                }
                this.mActiveAnimations.removeAt(i2);
                return;
            }
        }
    }

    public void stopListeningToAnimatedNodeValue(int i) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i + "] does not exist, or is not a 'value' node");
    }

    public void updateAnimatedNodeConfig(int i, ReadableMap readableMap) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i);
        if (animatedNode != null) {
            if (animatedNode instanceof AnimatedNodeWithUpdateableConfig) {
                stopAnimationsForNode(animatedNode);
                ((AnimatedNodeWithUpdateableConfig) animatedNode).onUpdateConfig(readableMap);
                this.mUpdatedNodes.put(i, animatedNode);
                return;
            }
            return;
        }
        throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i + "] does not exist");
    }
}