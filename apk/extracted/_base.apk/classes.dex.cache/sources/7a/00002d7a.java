package com.horcrux.svg;

import android.view.View;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.span.utilities.spannable.BulletSpan;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGCircleManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGDefsManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGGroupManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;
import com.facebook.react.viewmanagers.RNSVGImageManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLineManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLineManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPatternManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPatternManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGUseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGUseManagerInterface;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class CircleViewManager extends RenderableViewManager<C5205b> implements RNSVGCircleManagerInterface<C5205b> {
        public static final String REACT_CLASS = "RNSVGCircle";

        public CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new RNSVGCircleManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5205b c5205b, String str) {
            super.setClipPath((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5205b c5205b, int i) {
            super.setClipRule((CircleViewManager) c5205b, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5205b c5205b, String str) {
            super.setDisplay((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5205b c5205b, ReadableMap readableMap) {
            super.setFill((CircleViewManager) c5205b, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5205b c5205b, float f) {
            super.setFillOpacity((CircleViewManager) c5205b, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5205b c5205b, int i) {
            super.setFillRule((CircleViewManager) c5205b, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5205b c5205b, String str) {
            super.setMarkerEnd((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5205b c5205b, String str) {
            super.setMarkerMid((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5205b c5205b, String str) {
            super.setMarkerStart((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5205b c5205b, String str) {
            super.setMask((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5205b c5205b, ReadableArray readableArray) {
            super.setMatrix((CircleViewManager) c5205b, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5205b c5205b, String str) {
            super.setName((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((CircleViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5205b c5205b, String str) {
            super.setPointerEvents((CircleViewManager) c5205b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5205b c5205b, ReadableArray readableArray) {
            super.setPropList((CircleViewManager) c5205b, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5205b c5205b, boolean z) {
            super.setResponsible((CircleViewManager) c5205b, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5205b c5205b, ReadableMap readableMap) {
            super.setStroke((CircleViewManager) c5205b, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5205b c5205b, ReadableArray readableArray) {
            super.setStrokeDasharray((CircleViewManager) c5205b, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5205b c5205b, float f) {
            super.setStrokeDashoffset((CircleViewManager) c5205b, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5205b c5205b, int i) {
            super.setStrokeLinecap((CircleViewManager) c5205b, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5205b c5205b, int i) {
            super.setStrokeLinejoin((CircleViewManager) c5205b, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5205b c5205b, float f) {
            super.setStrokeMiterlimit((CircleViewManager) c5205b, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5205b c5205b, float f) {
            super.setStrokeOpacity((CircleViewManager) c5205b, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5205b c5205b, Double d) {
            super.setStrokeWidth((CircleViewManager) c5205b, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5205b c5205b, int i) {
            super.setVectorEffect((CircleViewManager) c5205b, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5205b c5205b, String str) {
            super.setStrokeWidth((CircleViewManager) c5205b, str);
        }

        @ReactProp(name = "cx")
        public void setCx(C5205b c5205b, Dynamic dynamic) {
            c5205b.m25941b(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(C5205b c5205b, Dynamic dynamic) {
            c5205b.m25938e(dynamic);
        }

        @ReactProp(name = "r")
        public void setR(C5205b c5205b, Dynamic dynamic) {
            c5205b.m25935h(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public void setCx(C5205b c5205b, String str) {
            c5205b.m25939d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public void setCy(C5205b c5205b, String str) {
            c5205b.m25936g(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public void setR(C5205b c5205b, String str) {
            c5205b.m25933j(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public void setCx(C5205b c5205b, Double d) {
            c5205b.m25940c(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public void setCy(C5205b c5205b, Double d) {
            c5205b.m25937f(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public void setR(C5205b c5205b, Double d) {
            c5205b.m25934i(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class ClipPathViewManager extends GroupViewManagerAbstract<C5207c> implements RNSVGClipPathManagerInterface<C5207c> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        public ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new RNSVGClipPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5207c c5207c, String str) {
            super.setClipPath((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5207c c5207c, int i) {
            super.setClipRule((ClipPathViewManager) c5207c, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5207c c5207c, String str) {
            super.setDisplay((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5207c c5207c, ReadableMap readableMap) {
            super.setFill((ClipPathViewManager) c5207c, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5207c c5207c, float f) {
            super.setFillOpacity((ClipPathViewManager) c5207c, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5207c c5207c, int i) {
            super.setFillRule((ClipPathViewManager) c5207c, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5207c c5207c, ReadableMap readableMap) {
            super.setFont((ClipPathViewManager) c5207c, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5207c c5207c, Double d) {
            super.setFontSize((ClipPathViewManager) c5207c, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5207c c5207c, Double d) {
            super.setFontWeight((ClipPathViewManager) c5207c, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5207c c5207c, String str) {
            super.setMarkerEnd((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5207c c5207c, String str) {
            super.setMarkerMid((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5207c c5207c, String str) {
            super.setMarkerStart((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5207c c5207c, String str) {
            super.setMask((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5207c c5207c, ReadableArray readableArray) {
            super.setMatrix((ClipPathViewManager) c5207c, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5207c c5207c, String str) {
            super.setName((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ClipPathViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5207c c5207c, String str) {
            super.setPointerEvents((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5207c c5207c, ReadableArray readableArray) {
            super.setPropList((ClipPathViewManager) c5207c, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5207c c5207c, boolean z) {
            super.setResponsible((ClipPathViewManager) c5207c, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5207c c5207c, ReadableMap readableMap) {
            super.setStroke((ClipPathViewManager) c5207c, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5207c c5207c, ReadableArray readableArray) {
            super.setStrokeDasharray((ClipPathViewManager) c5207c, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5207c c5207c, float f) {
            super.setStrokeDashoffset((ClipPathViewManager) c5207c, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5207c c5207c, int i) {
            super.setStrokeLinecap((ClipPathViewManager) c5207c, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5207c c5207c, int i) {
            super.setStrokeLinejoin((ClipPathViewManager) c5207c, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5207c c5207c, float f) {
            super.setStrokeMiterlimit((ClipPathViewManager) c5207c, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5207c c5207c, float f) {
            super.setStrokeOpacity((ClipPathViewManager) c5207c, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5207c c5207c, Double d) {
            super.setStrokeWidth((ClipPathViewManager) c5207c, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5207c c5207c, int i) {
            super.setVectorEffect((ClipPathViewManager) c5207c, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5207c c5207c, String str) {
            super.setFontSize((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5207c c5207c, String str) {
            super.setFontWeight((ClipPathViewManager) c5207c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5207c c5207c, String str) {
            super.setStrokeWidth((ClipPathViewManager) c5207c, str);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class DefsViewManager extends VirtualViewManager<C5211e> implements RNSVGDefsManagerInterface<C5211e> {
        public static final String REACT_CLASS = "RNSVGDefs";

        public DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new RNSVGDefsManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5211e c5211e, String str) {
            super.setClipPath((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5211e c5211e, int i) {
            super.setClipRule((DefsViewManager) c5211e, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5211e c5211e, String str) {
            super.setDisplay((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5211e c5211e, String str) {
            super.setMarkerEnd((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5211e c5211e, String str) {
            super.setMarkerMid((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5211e c5211e, String str) {
            super.setMarkerStart((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5211e c5211e, String str) {
            super.setMask((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5211e c5211e, ReadableArray readableArray) {
            super.setMatrix((DefsViewManager) c5211e, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5211e c5211e, String str) {
            super.setName((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((DefsViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5211e c5211e, String str) {
            super.setPointerEvents((DefsViewManager) c5211e, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5211e c5211e, boolean z) {
            super.setResponsible((DefsViewManager) c5211e, z);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class EllipseViewManager extends RenderableViewManager<C5215g> implements RNSVGEllipseManagerInterface<C5215g> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        public EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new RNSVGEllipseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5215g c5215g, String str) {
            super.setClipPath((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5215g c5215g, int i) {
            super.setClipRule((EllipseViewManager) c5215g, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5215g c5215g, String str) {
            super.setDisplay((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5215g c5215g, ReadableMap readableMap) {
            super.setFill((EllipseViewManager) c5215g, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5215g c5215g, float f) {
            super.setFillOpacity((EllipseViewManager) c5215g, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5215g c5215g, int i) {
            super.setFillRule((EllipseViewManager) c5215g, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5215g c5215g, String str) {
            super.setMarkerEnd((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5215g c5215g, String str) {
            super.setMarkerMid((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5215g c5215g, String str) {
            super.setMarkerStart((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5215g c5215g, String str) {
            super.setMask((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5215g c5215g, ReadableArray readableArray) {
            super.setMatrix((EllipseViewManager) c5215g, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5215g c5215g, String str) {
            super.setName((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((EllipseViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5215g c5215g, String str) {
            super.setPointerEvents((EllipseViewManager) c5215g, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5215g c5215g, ReadableArray readableArray) {
            super.setPropList((EllipseViewManager) c5215g, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5215g c5215g, boolean z) {
            super.setResponsible((EllipseViewManager) c5215g, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5215g c5215g, ReadableMap readableMap) {
            super.setStroke((EllipseViewManager) c5215g, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5215g c5215g, ReadableArray readableArray) {
            super.setStrokeDasharray((EllipseViewManager) c5215g, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5215g c5215g, float f) {
            super.setStrokeDashoffset((EllipseViewManager) c5215g, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5215g c5215g, int i) {
            super.setStrokeLinecap((EllipseViewManager) c5215g, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5215g c5215g, int i) {
            super.setStrokeLinejoin((EllipseViewManager) c5215g, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5215g c5215g, float f) {
            super.setStrokeMiterlimit((EllipseViewManager) c5215g, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5215g c5215g, float f) {
            super.setStrokeOpacity((EllipseViewManager) c5215g, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5215g c5215g, Double d) {
            super.setStrokeWidth((EllipseViewManager) c5215g, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5215g c5215g, int i) {
            super.setVectorEffect((EllipseViewManager) c5215g, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5215g c5215g, String str) {
            super.setStrokeWidth((EllipseViewManager) c5215g, str);
        }

        @ReactProp(name = "cx")
        public void setCx(C5215g c5215g, Dynamic dynamic) {
            c5215g.m25911b(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(C5215g c5215g, Dynamic dynamic) {
            c5215g.m25908e(dynamic);
        }

        @ReactProp(name = "rx")
        public void setRx(C5215g c5215g, Dynamic dynamic) {
            c5215g.m25905h(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(C5215g c5215g, Dynamic dynamic) {
            c5215g.m25902k(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setCx(C5215g c5215g, String str) {
            c5215g.m25909d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setCy(C5215g c5215g, String str) {
            c5215g.m25906g(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setRx(C5215g c5215g, String str) {
            c5215g.m25903j(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setRy(C5215g c5215g, String str) {
            c5215g.m25900m(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setCx(C5215g c5215g, Double d) {
            c5215g.m25910c(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setCy(C5215g c5215g, Double d) {
            c5215g.m25907f(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setRx(C5215g c5215g, Double d) {
            c5215g.m25904i(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public void setRy(C5215g c5215g, Double d) {
            c5215g.m25901l(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class ForeignObjectManager extends GroupViewManagerAbstract<C5221i> implements RNSVGForeignObjectManagerInterface<C5221i> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        public ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new RNSVGForeignObjectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5221i c5221i, String str) {
            super.setClipPath((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5221i c5221i, int i) {
            super.setClipRule((ForeignObjectManager) c5221i, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5221i c5221i, String str) {
            super.setDisplay((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5221i c5221i, ReadableMap readableMap) {
            super.setFill((ForeignObjectManager) c5221i, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5221i c5221i, float f) {
            super.setFillOpacity((ForeignObjectManager) c5221i, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5221i c5221i, int i) {
            super.setFillRule((ForeignObjectManager) c5221i, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5221i c5221i, ReadableMap readableMap) {
            super.setFont((ForeignObjectManager) c5221i, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5221i c5221i, Double d) {
            super.setFontSize((ForeignObjectManager) c5221i, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5221i c5221i, Double d) {
            super.setFontWeight((ForeignObjectManager) c5221i, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5221i c5221i, String str) {
            super.setMarkerEnd((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5221i c5221i, String str) {
            super.setMarkerMid((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5221i c5221i, String str) {
            super.setMarkerStart((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5221i c5221i, String str) {
            super.setMask((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5221i c5221i, ReadableArray readableArray) {
            super.setMatrix((ForeignObjectManager) c5221i, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5221i c5221i, String str) {
            super.setName((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ForeignObjectManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5221i c5221i, String str) {
            super.setPointerEvents((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5221i c5221i, ReadableArray readableArray) {
            super.setPropList((ForeignObjectManager) c5221i, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5221i c5221i, boolean z) {
            super.setResponsible((ForeignObjectManager) c5221i, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5221i c5221i, ReadableMap readableMap) {
            super.setStroke((ForeignObjectManager) c5221i, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5221i c5221i, ReadableArray readableArray) {
            super.setStrokeDasharray((ForeignObjectManager) c5221i, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5221i c5221i, float f) {
            super.setStrokeDashoffset((ForeignObjectManager) c5221i, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5221i c5221i, int i) {
            super.setStrokeLinecap((ForeignObjectManager) c5221i, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5221i c5221i, int i) {
            super.setStrokeLinejoin((ForeignObjectManager) c5221i, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5221i c5221i, float f) {
            super.setStrokeMiterlimit((ForeignObjectManager) c5221i, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5221i c5221i, float f) {
            super.setStrokeOpacity((ForeignObjectManager) c5221i, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5221i c5221i, Double d) {
            super.setStrokeWidth((ForeignObjectManager) c5221i, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5221i c5221i, int i) {
            super.setVectorEffect((ForeignObjectManager) c5221i, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5221i c5221i, String str) {
            super.setFontSize((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5221i c5221i, String str) {
            super.setFontWeight((ForeignObjectManager) c5221i, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5221i c5221i, String str) {
            super.setStrokeWidth((ForeignObjectManager) c5221i, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5221i c5221i, Dynamic dynamic) {
            c5221i.m25871l(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5221i c5221i, Dynamic dynamic) {
            c5221i.m25868o(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5221i c5221i, Dynamic dynamic) {
            c5221i.m25865r(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5221i c5221i, Dynamic dynamic) {
            c5221i.m25862u(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setHeight(C5221i c5221i, String str) {
            c5221i.m25869n(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setWidth(C5221i c5221i, String str) {
            c5221i.m25866q(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setX(C5221i c5221i, String str) {
            c5221i.m25863t(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setY(C5221i c5221i, String str) {
            c5221i.m25860w(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setHeight(C5221i c5221i, Double d) {
            c5221i.m25870m(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setWidth(C5221i c5221i, Double d) {
            c5221i.m25867p(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setX(C5221i c5221i, Double d) {
            c5221i.m25864s(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public void setY(C5221i c5221i, Double d) {
            c5221i.m25861v(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class GroupViewManager extends GroupViewManagerAbstract<C5227l> implements RNSVGGroupManagerInterface<C5227l> {
        public static final String REACT_CLASS = "RNSVGGroup";

        public GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new RNSVGGroupManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5227l c5227l, String str) {
            super.setClipPath((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5227l c5227l, int i) {
            super.setClipRule((GroupViewManager) c5227l, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5227l c5227l, String str) {
            super.setDisplay((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5227l c5227l, ReadableMap readableMap) {
            super.setFill((GroupViewManager) c5227l, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5227l c5227l, float f) {
            super.setFillOpacity((GroupViewManager) c5227l, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5227l c5227l, int i) {
            super.setFillRule((GroupViewManager) c5227l, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5227l c5227l, ReadableMap readableMap) {
            super.setFont((GroupViewManager) c5227l, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5227l c5227l, Double d) {
            super.setFontSize((GroupViewManager) c5227l, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5227l c5227l, Double d) {
            super.setFontWeight((GroupViewManager) c5227l, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5227l c5227l, String str) {
            super.setMarkerEnd((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5227l c5227l, String str) {
            super.setMarkerMid((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5227l c5227l, String str) {
            super.setMarkerStart((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5227l c5227l, String str) {
            super.setMask((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5227l c5227l, ReadableArray readableArray) {
            super.setMatrix((GroupViewManager) c5227l, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5227l c5227l, String str) {
            super.setName((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((GroupViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5227l c5227l, String str) {
            super.setPointerEvents((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5227l c5227l, ReadableArray readableArray) {
            super.setPropList((GroupViewManager) c5227l, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5227l c5227l, boolean z) {
            super.setResponsible((GroupViewManager) c5227l, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5227l c5227l, ReadableMap readableMap) {
            super.setStroke((GroupViewManager) c5227l, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5227l c5227l, ReadableArray readableArray) {
            super.setStrokeDasharray((GroupViewManager) c5227l, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5227l c5227l, float f) {
            super.setStrokeDashoffset((GroupViewManager) c5227l, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5227l c5227l, int i) {
            super.setStrokeLinecap((GroupViewManager) c5227l, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5227l c5227l, int i) {
            super.setStrokeLinejoin((GroupViewManager) c5227l, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5227l c5227l, float f) {
            super.setStrokeMiterlimit((GroupViewManager) c5227l, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5227l c5227l, float f) {
            super.setStrokeOpacity((GroupViewManager) c5227l, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5227l c5227l, Double d) {
            super.setStrokeWidth((GroupViewManager) c5227l, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5227l c5227l, int i) {
            super.setVectorEffect((GroupViewManager) c5227l, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5227l c5227l, String str) {
            super.setFontSize((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5227l c5227l, String str) {
            super.setFontWeight((GroupViewManager) c5227l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5227l c5227l, String str) {
            super.setStrokeWidth((GroupViewManager) c5227l, str);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class ImageViewManager extends RenderableViewManager<C5229m> implements RNSVGImageManagerInterface<C5229m> {
        public static final String REACT_CLASS = "RNSVGImage";

        public ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new RNSVGImageManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5229m c5229m, String str) {
            super.setClipPath((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5229m c5229m, int i) {
            super.setClipRule((ImageViewManager) c5229m, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5229m c5229m, String str) {
            super.setDisplay((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5229m c5229m, ReadableMap readableMap) {
            super.setFill((ImageViewManager) c5229m, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5229m c5229m, float f) {
            super.setFillOpacity((ImageViewManager) c5229m, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5229m c5229m, int i) {
            super.setFillRule((ImageViewManager) c5229m, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5229m c5229m, String str) {
            super.setMarkerEnd((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5229m c5229m, String str) {
            super.setMarkerMid((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5229m c5229m, String str) {
            super.setMarkerStart((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5229m c5229m, String str) {
            super.setMask((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5229m c5229m, ReadableArray readableArray) {
            super.setMatrix((ImageViewManager) c5229m, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5229m c5229m, String str) {
            super.setName((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((ImageViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5229m c5229m, String str) {
            super.setPointerEvents((ImageViewManager) c5229m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5229m c5229m, ReadableArray readableArray) {
            super.setPropList((ImageViewManager) c5229m, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5229m c5229m, boolean z) {
            super.setResponsible((ImageViewManager) c5229m, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5229m c5229m, ReadableMap readableMap) {
            super.setStroke((ImageViewManager) c5229m, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5229m c5229m, ReadableArray readableArray) {
            super.setStrokeDasharray((ImageViewManager) c5229m, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5229m c5229m, float f) {
            super.setStrokeDashoffset((ImageViewManager) c5229m, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5229m c5229m, int i) {
            super.setStrokeLinecap((ImageViewManager) c5229m, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5229m c5229m, int i) {
            super.setStrokeLinejoin((ImageViewManager) c5229m, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5229m c5229m, float f) {
            super.setStrokeMiterlimit((ImageViewManager) c5229m, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5229m c5229m, float f) {
            super.setStrokeOpacity((ImageViewManager) c5229m, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5229m c5229m, Double d) {
            super.setStrokeWidth((ImageViewManager) c5229m, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5229m c5229m, int i) {
            super.setVectorEffect((ImageViewManager) c5229m, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "align")
        public void setAlign(C5229m c5229m, String str) {
            c5229m.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5229m c5229m, int i) {
            c5229m.setMeetOrSlice(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(customType = "ImageSource", name = "src")
        public void setSrc(C5229m c5229m, ReadableMap readableMap) {
            c5229m.m25820i(readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5229m c5229m, String str) {
            super.setStrokeWidth((ImageViewManager) c5229m, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5229m c5229m, Dynamic dynamic) {
            c5229m.m25823f(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5229m c5229m, Dynamic dynamic) {
            c5229m.m25819j(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5229m c5229m, Dynamic dynamic) {
            c5229m.m25816m(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5229m c5229m, Dynamic dynamic) {
            c5229m.m25813p(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setHeight(C5229m c5229m, String str) {
            c5229m.m25821h(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setWidth(C5229m c5229m, String str) {
            c5229m.m25817l(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setX(C5229m c5229m, String str) {
            c5229m.m25814o(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setY(C5229m c5229m, String str) {
            c5229m.m25811r(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setHeight(C5229m c5229m, Double d) {
            c5229m.m25822g(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setWidth(C5229m c5229m, Double d) {
            c5229m.m25818k(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setX(C5229m c5229m, Double d) {
            c5229m.m25815n(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public void setY(C5229m c5229m, Double d) {
            c5229m.m25812q(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class LineViewManager extends RenderableViewManager<C5232n> implements RNSVGLineManagerInterface<C5232n> {
        public static final String REACT_CLASS = "RNSVGLine";

        public LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new RNSVGLineManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5232n c5232n, String str) {
            super.setClipPath((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5232n c5232n, int i) {
            super.setClipRule((LineViewManager) c5232n, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5232n c5232n, String str) {
            super.setDisplay((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5232n c5232n, ReadableMap readableMap) {
            super.setFill((LineViewManager) c5232n, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5232n c5232n, float f) {
            super.setFillOpacity((LineViewManager) c5232n, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5232n c5232n, int i) {
            super.setFillRule((LineViewManager) c5232n, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5232n c5232n, String str) {
            super.setMarkerEnd((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5232n c5232n, String str) {
            super.setMarkerMid((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5232n c5232n, String str) {
            super.setMarkerStart((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5232n c5232n, String str) {
            super.setMask((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5232n c5232n, ReadableArray readableArray) {
            super.setMatrix((LineViewManager) c5232n, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5232n c5232n, String str) {
            super.setName((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((LineViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5232n c5232n, String str) {
            super.setPointerEvents((LineViewManager) c5232n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5232n c5232n, ReadableArray readableArray) {
            super.setPropList((LineViewManager) c5232n, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5232n c5232n, boolean z) {
            super.setResponsible((LineViewManager) c5232n, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5232n c5232n, ReadableMap readableMap) {
            super.setStroke((LineViewManager) c5232n, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5232n c5232n, ReadableArray readableArray) {
            super.setStrokeDasharray((LineViewManager) c5232n, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5232n c5232n, float f) {
            super.setStrokeDashoffset((LineViewManager) c5232n, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5232n c5232n, int i) {
            super.setStrokeLinecap((LineViewManager) c5232n, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5232n c5232n, int i) {
            super.setStrokeLinejoin((LineViewManager) c5232n, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5232n c5232n, float f) {
            super.setStrokeMiterlimit((LineViewManager) c5232n, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5232n c5232n, float f) {
            super.setStrokeOpacity((LineViewManager) c5232n, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5232n c5232n, Double d) {
            super.setStrokeWidth((LineViewManager) c5232n, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5232n c5232n, int i) {
            super.setVectorEffect((LineViewManager) c5232n, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5232n c5232n, String str) {
            super.setStrokeWidth((LineViewManager) c5232n, str);
        }

        @ReactProp(name = "x1")
        public void setX1(C5232n c5232n, Dynamic dynamic) {
            c5232n.m25809b(dynamic);
        }

        @ReactProp(name = "x2")
        public void setX2(C5232n c5232n, Dynamic dynamic) {
            c5232n.m25806e(dynamic);
        }

        @ReactProp(name = "y1")
        public void setY1(C5232n c5232n, Dynamic dynamic) {
            c5232n.m25803h(dynamic);
        }

        @ReactProp(name = "y2")
        public void setY2(C5232n c5232n, Dynamic dynamic) {
            c5232n.m25800k(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setX1(C5232n c5232n, String str) {
            c5232n.m25807d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setX2(C5232n c5232n, String str) {
            c5232n.m25804g(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setY1(C5232n c5232n, String str) {
            c5232n.m25801j(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setY2(C5232n c5232n, String str) {
            c5232n.m25798m(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setX1(C5232n c5232n, Double d) {
            c5232n.m25808c(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setX2(C5232n c5232n, Double d) {
            c5232n.m25805f(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setY1(C5232n c5232n, Double d) {
            c5232n.m25802i(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public void setY2(C5232n c5232n, Double d) {
            c5232n.m25799l(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class LinearGradientManager extends VirtualViewManager<C5234o> implements RNSVGLinearGradientManagerInterface<C5234o> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        public LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new RNSVGLinearGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5234o c5234o, String str) {
            super.setClipPath((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5234o c5234o, int i) {
            super.setClipRule((LinearGradientManager) c5234o, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5234o c5234o, String str) {
            super.setDisplay((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5234o c5234o, String str) {
            super.setMarkerEnd((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5234o c5234o, String str) {
            super.setMarkerMid((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5234o c5234o, String str) {
            super.setMarkerStart((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5234o c5234o, String str) {
            super.setMask((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5234o c5234o, ReadableArray readableArray) {
            super.setMatrix((LinearGradientManager) c5234o, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5234o c5234o, String str) {
            super.setName((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((LinearGradientManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5234o c5234o, String str) {
            super.setPointerEvents((LinearGradientManager) c5234o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5234o c5234o, boolean z) {
            super.setResponsible((LinearGradientManager) c5234o, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradient")
        public void setGradient(C5234o c5234o, ReadableArray readableArray) {
            c5234o.m25796b(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(C5234o c5234o, ReadableArray readableArray) {
            c5234o.m25795c(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(C5234o c5234o, int i) {
            c5234o.m25794d(i);
        }

        @ReactProp(name = "x1")
        public void setX1(C5234o c5234o, Dynamic dynamic) {
            c5234o.m25793e(dynamic);
        }

        @ReactProp(name = "x2")
        public void setX2(C5234o c5234o, Dynamic dynamic) {
            c5234o.m25790h(dynamic);
        }

        @ReactProp(name = "y1")
        public void setY1(C5234o c5234o, Dynamic dynamic) {
            c5234o.m25787k(dynamic);
        }

        @ReactProp(name = "y2")
        public void setY2(C5234o c5234o, Dynamic dynamic) {
            c5234o.m25784n(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setX1(C5234o c5234o, String str) {
            c5234o.m25791g(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setX2(C5234o c5234o, String str) {
            c5234o.m25788j(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setY1(C5234o c5234o, String str) {
            c5234o.m25785m(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setY2(C5234o c5234o, String str) {
            c5234o.m25782p(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setX1(C5234o c5234o, Double d) {
            c5234o.m25792f(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setX2(C5234o c5234o, Double d) {
            c5234o.m25789i(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setY1(C5234o c5234o, Double d) {
            c5234o.m25786l(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public void setY2(C5234o c5234o, Double d) {
            c5234o.m25783o(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class MarkerManager extends GroupViewManagerAbstract<C5236p> implements RNSVGMarkerManagerInterface<C5236p> {
        public static final String REACT_CLASS = "RNSVGMarker";

        public MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new RNSVGMarkerManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5236p c5236p, String str) {
            super.setClipPath((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5236p c5236p, int i) {
            super.setClipRule((MarkerManager) c5236p, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5236p c5236p, String str) {
            super.setDisplay((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5236p c5236p, ReadableMap readableMap) {
            super.setFill((MarkerManager) c5236p, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5236p c5236p, float f) {
            super.setFillOpacity((MarkerManager) c5236p, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5236p c5236p, int i) {
            super.setFillRule((MarkerManager) c5236p, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5236p c5236p, ReadableMap readableMap) {
            super.setFont((MarkerManager) c5236p, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5236p c5236p, Double d) {
            super.setFontSize((MarkerManager) c5236p, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5236p c5236p, Double d) {
            super.setFontWeight((MarkerManager) c5236p, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5236p c5236p, String str) {
            super.setMarkerEnd((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5236p c5236p, String str) {
            super.setMarkerMid((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5236p c5236p, String str) {
            super.setMarkerStart((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5236p c5236p, String str) {
            super.setMask((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5236p c5236p, ReadableArray readableArray) {
            super.setMatrix((MarkerManager) c5236p, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5236p c5236p, String str) {
            super.setName((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((MarkerManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5236p c5236p, String str) {
            super.setPointerEvents((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5236p c5236p, ReadableArray readableArray) {
            super.setPropList((MarkerManager) c5236p, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5236p c5236p, boolean z) {
            super.setResponsible((MarkerManager) c5236p, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5236p c5236p, ReadableMap readableMap) {
            super.setStroke((MarkerManager) c5236p, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5236p c5236p, ReadableArray readableArray) {
            super.setStrokeDasharray((MarkerManager) c5236p, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5236p c5236p, float f) {
            super.setStrokeDashoffset((MarkerManager) c5236p, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5236p c5236p, int i) {
            super.setStrokeLinecap((MarkerManager) c5236p, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5236p c5236p, int i) {
            super.setStrokeLinejoin((MarkerManager) c5236p, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5236p c5236p, float f) {
            super.setStrokeMiterlimit((MarkerManager) c5236p, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5236p c5236p, float f) {
            super.setStrokeOpacity((MarkerManager) c5236p, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5236p c5236p, Double d) {
            super.setStrokeWidth((MarkerManager) c5236p, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5236p c5236p, int i) {
            super.setVectorEffect((MarkerManager) c5236p, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "align")
        public void setAlign(C5236p c5236p, String str) {
            c5236p.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5236p c5236p, String str) {
            super.setFontSize((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5236p c5236p, String str) {
            super.setFontWeight((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerUnits")
        public void setMarkerUnits(C5236p c5236p, String str) {
            c5236p.m25777p(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5236p c5236p, int i) {
            c5236p.setMeetOrSlice(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(C5236p c5236p, float f) {
            c5236p.setMinX(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(C5236p c5236p, float f) {
            c5236p.setMinY(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "orient")
        public void setOrient(C5236p c5236p, String str) {
            c5236p.m25773t(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5236p c5236p, String str) {
            super.setStrokeWidth((MarkerManager) c5236p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(C5236p c5236p, float f) {
            c5236p.setVbHeight(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(C5236p c5236p, float f) {
            c5236p.setVbWidth(f);
        }

        @ReactProp(name = "markerHeight")
        public void setMarkerHeight(C5236p c5236p, Dynamic dynamic) {
            c5236p.m25780m(dynamic);
        }

        @ReactProp(name = "markerWidth")
        public void setMarkerWidth(C5236p c5236p, Dynamic dynamic) {
            c5236p.m25776q(dynamic);
        }

        @ReactProp(name = "refX")
        public void setRefX(C5236p c5236p, Dynamic dynamic) {
            c5236p.m25772u(dynamic);
        }

        @ReactProp(name = "refY")
        public void setRefY(C5236p c5236p, Dynamic dynamic) {
            c5236p.m25769x(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setMarkerHeight(C5236p c5236p, String str) {
            c5236p.m25778o(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setMarkerWidth(C5236p c5236p, String str) {
            c5236p.m25774s(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setRefX(C5236p c5236p, String str) {
            c5236p.m25770w(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setRefY(C5236p c5236p, String str) {
            c5236p.m25767z(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setMarkerHeight(C5236p c5236p, Double d) {
            c5236p.m25779n(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setMarkerWidth(C5236p c5236p, Double d) {
            c5236p.m25775r(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setRefX(C5236p c5236p, Double d) {
            c5236p.m25771v(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public void setRefY(C5236p c5236p, Double d) {
            c5236p.m25768y(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class MaskManager extends GroupViewManagerAbstract<C5238q> implements RNSVGMaskManagerInterface<C5238q> {
        public static final String REACT_CLASS = "RNSVGMask";

        public MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new RNSVGMaskManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5238q c5238q, String str) {
            super.setClipPath((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5238q c5238q, int i) {
            super.setClipRule((MaskManager) c5238q, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5238q c5238q, String str) {
            super.setDisplay((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5238q c5238q, ReadableMap readableMap) {
            super.setFill((MaskManager) c5238q, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5238q c5238q, float f) {
            super.setFillOpacity((MaskManager) c5238q, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5238q c5238q, int i) {
            super.setFillRule((MaskManager) c5238q, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5238q c5238q, ReadableMap readableMap) {
            super.setFont((MaskManager) c5238q, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5238q c5238q, Double d) {
            super.setFontSize((MaskManager) c5238q, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5238q c5238q, Double d) {
            super.setFontWeight((MaskManager) c5238q, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5238q c5238q, String str) {
            super.setMarkerEnd((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5238q c5238q, String str) {
            super.setMarkerMid((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5238q c5238q, String str) {
            super.setMarkerStart((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5238q c5238q, String str) {
            super.setMask((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5238q c5238q, ReadableArray readableArray) {
            super.setMatrix((MaskManager) c5238q, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5238q c5238q, String str) {
            super.setName((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((MaskManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5238q c5238q, String str) {
            super.setPointerEvents((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5238q c5238q, ReadableArray readableArray) {
            super.setPropList((MaskManager) c5238q, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5238q c5238q, boolean z) {
            super.setResponsible((MaskManager) c5238q, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5238q c5238q, ReadableMap readableMap) {
            super.setStroke((MaskManager) c5238q, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5238q c5238q, ReadableArray readableArray) {
            super.setStrokeDasharray((MaskManager) c5238q, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5238q c5238q, float f) {
            super.setStrokeDashoffset((MaskManager) c5238q, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5238q c5238q, int i) {
            super.setStrokeLinecap((MaskManager) c5238q, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5238q c5238q, int i) {
            super.setStrokeLinejoin((MaskManager) c5238q, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5238q c5238q, float f) {
            super.setStrokeMiterlimit((MaskManager) c5238q, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5238q c5238q, float f) {
            super.setStrokeOpacity((MaskManager) c5238q, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5238q c5238q, Double d) {
            super.setStrokeWidth((MaskManager) c5238q, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5238q c5238q, int i) {
            super.setVectorEffect((MaskManager) c5238q, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5238q c5238q, String str) {
            super.setFontSize((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5238q c5238q, String str) {
            super.setFontWeight((MaskManager) c5238q, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskContentUnits")
        public void setMaskContentUnits(C5238q c5238q, int i) {
            c5238q.m25763o(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskUnits")
        public void setMaskUnits(C5238q c5238q, int i) {
            c5238q.m25762p(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5238q c5238q, String str) {
            super.setStrokeWidth((MaskManager) c5238q, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5238q c5238q, Dynamic dynamic) {
            c5238q.m25766l(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5238q c5238q, Dynamic dynamic) {
            c5238q.m25761q(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5238q c5238q, Dynamic dynamic) {
            c5238q.m25758t(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5238q c5238q, Dynamic dynamic) {
            c5238q.m25755w(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setHeight(C5238q c5238q, String str) {
            c5238q.m25764n(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setWidth(C5238q c5238q, String str) {
            c5238q.m25759s(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setX(C5238q c5238q, String str) {
            c5238q.m25756v(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setY(C5238q c5238q, String str) {
            c5238q.m25753y(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setHeight(C5238q c5238q, Double d) {
            c5238q.m25765m(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setWidth(C5238q c5238q, Double d) {
            c5238q.m25760r(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setX(C5238q c5238q, Double d) {
            c5238q.m25757u(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public void setY(C5238q c5238q, Double d) {
            c5238q.m25754x(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class PathViewManager extends RenderableViewManager<C5245u> implements RNSVGPathManagerInterface<C5245u> {
        public static final String REACT_CLASS = "RNSVGPath";

        public PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new RNSVGPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5245u c5245u, String str) {
            super.setClipPath((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5245u c5245u, int i) {
            super.setClipRule((PathViewManager) c5245u, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5245u c5245u, String str) {
            super.setDisplay((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5245u c5245u, ReadableMap readableMap) {
            super.setFill((PathViewManager) c5245u, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5245u c5245u, float f) {
            super.setFillOpacity((PathViewManager) c5245u, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5245u c5245u, int i) {
            super.setFillRule((PathViewManager) c5245u, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5245u c5245u, String str) {
            super.setMarkerEnd((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5245u c5245u, String str) {
            super.setMarkerMid((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5245u c5245u, String str) {
            super.setMarkerStart((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5245u c5245u, String str) {
            super.setMask((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5245u c5245u, ReadableArray readableArray) {
            super.setMatrix((PathViewManager) c5245u, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5245u c5245u, String str) {
            super.setName((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((PathViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5245u c5245u, String str) {
            super.setPointerEvents((PathViewManager) c5245u, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5245u c5245u, ReadableArray readableArray) {
            super.setPropList((PathViewManager) c5245u, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5245u c5245u, boolean z) {
            super.setResponsible((PathViewManager) c5245u, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5245u c5245u, ReadableMap readableMap) {
            super.setStroke((PathViewManager) c5245u, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5245u c5245u, ReadableArray readableArray) {
            super.setStrokeDasharray((PathViewManager) c5245u, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5245u c5245u, float f) {
            super.setStrokeDashoffset((PathViewManager) c5245u, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5245u c5245u, int i) {
            super.setStrokeLinecap((PathViewManager) c5245u, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5245u c5245u, int i) {
            super.setStrokeLinejoin((PathViewManager) c5245u, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5245u c5245u, float f) {
            super.setStrokeMiterlimit((PathViewManager) c5245u, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5245u c5245u, float f) {
            super.setStrokeOpacity((PathViewManager) c5245u, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5245u c5245u, Double d) {
            super.setStrokeWidth((PathViewManager) c5245u, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5245u c5245u, int i) {
            super.setVectorEffect((PathViewManager) c5245u, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "d")
        public void setD(C5245u c5245u, String str) {
            c5245u.m25693b(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5245u c5245u, String str) {
            super.setStrokeWidth((PathViewManager) c5245u, str);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class PatternManager extends GroupViewManagerAbstract<C5247v> implements RNSVGPatternManagerInterface<C5247v> {
        public static final String REACT_CLASS = "RNSVGPattern";

        public PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new RNSVGPatternManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5247v c5247v, String str) {
            super.setClipPath((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5247v c5247v, int i) {
            super.setClipRule((PatternManager) c5247v, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5247v c5247v, String str) {
            super.setDisplay((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5247v c5247v, ReadableMap readableMap) {
            super.setFill((PatternManager) c5247v, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5247v c5247v, float f) {
            super.setFillOpacity((PatternManager) c5247v, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5247v c5247v, int i) {
            super.setFillRule((PatternManager) c5247v, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5247v c5247v, ReadableMap readableMap) {
            super.setFont((PatternManager) c5247v, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5247v c5247v, Double d) {
            super.setFontSize((PatternManager) c5247v, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5247v c5247v, Double d) {
            super.setFontWeight((PatternManager) c5247v, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5247v c5247v, String str) {
            super.setMarkerEnd((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5247v c5247v, String str) {
            super.setMarkerMid((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5247v c5247v, String str) {
            super.setMarkerStart((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5247v c5247v, String str) {
            super.setMask((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5247v c5247v, ReadableArray readableArray) {
            super.setMatrix((PatternManager) c5247v, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5247v c5247v, String str) {
            super.setName((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((PatternManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5247v c5247v, String str) {
            super.setPointerEvents((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5247v c5247v, ReadableArray readableArray) {
            super.setPropList((PatternManager) c5247v, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5247v c5247v, boolean z) {
            super.setResponsible((PatternManager) c5247v, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5247v c5247v, ReadableMap readableMap) {
            super.setStroke((PatternManager) c5247v, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5247v c5247v, ReadableArray readableArray) {
            super.setStrokeDasharray((PatternManager) c5247v, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5247v c5247v, float f) {
            super.setStrokeDashoffset((PatternManager) c5247v, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5247v c5247v, int i) {
            super.setStrokeLinecap((PatternManager) c5247v, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5247v c5247v, int i) {
            super.setStrokeLinejoin((PatternManager) c5247v, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5247v c5247v, float f) {
            super.setStrokeMiterlimit((PatternManager) c5247v, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5247v c5247v, float f) {
            super.setStrokeOpacity((PatternManager) c5247v, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5247v c5247v, Double d) {
            super.setStrokeWidth((PatternManager) c5247v, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5247v c5247v, int i) {
            super.setVectorEffect((PatternManager) c5247v, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "align")
        public void setAlign(C5247v c5247v, String str) {
            c5247v.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5247v c5247v, String str) {
            super.setFontSize((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5247v c5247v, String str) {
            super.setFontWeight((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5247v c5247v, int i) {
            c5247v.setMeetOrSlice(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(C5247v c5247v, float f) {
            c5247v.setMinX(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(C5247v c5247v, float f) {
            c5247v.setMinY(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternContentUnits")
        public void setPatternContentUnits(C5247v c5247v, int i) {
            c5247v.m25676o(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternTransform")
        public void setPatternTransform(C5247v c5247v, ReadableArray readableArray) {
            c5247v.m25675p(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternUnits")
        public void setPatternUnits(C5247v c5247v, int i) {
            c5247v.m25674q(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5247v c5247v, String str) {
            super.setStrokeWidth((PatternManager) c5247v, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(C5247v c5247v, float f) {
            c5247v.setVbHeight(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(C5247v c5247v, float f) {
            c5247v.setVbWidth(f);
        }

        @ReactProp(name = "height")
        public void setHeight(C5247v c5247v, Dynamic dynamic) {
            c5247v.m25679l(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5247v c5247v, Dynamic dynamic) {
            c5247v.m25673r(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5247v c5247v, Dynamic dynamic) {
            c5247v.m25670u(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5247v c5247v, Dynamic dynamic) {
            c5247v.m25667x(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setHeight(C5247v c5247v, String str) {
            c5247v.m25677n(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setWidth(C5247v c5247v, String str) {
            c5247v.m25671t(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setX(C5247v c5247v, String str) {
            c5247v.m25668w(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setY(C5247v c5247v, String str) {
            c5247v.m25665z(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setHeight(C5247v c5247v, Double d) {
            c5247v.m25678m(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setWidth(C5247v c5247v, Double d) {
            c5247v.m25672s(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setX(C5247v c5247v, Double d) {
            c5247v.m25669v(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public void setY(C5247v c5247v, Double d) {
            c5247v.m25666y(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class RadialGradientManager extends VirtualViewManager<C5204a0> implements RNSVGRadialGradientManagerInterface<C5204a0> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        public RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new RNSVGRadialGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5204a0 c5204a0, String str) {
            super.setClipPath((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5204a0 c5204a0, int i) {
            super.setClipRule((RadialGradientManager) c5204a0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5204a0 c5204a0, String str) {
            super.setDisplay((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5204a0 c5204a0, String str) {
            super.setMarkerEnd((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5204a0 c5204a0, String str) {
            super.setMarkerMid((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5204a0 c5204a0, String str) {
            super.setMarkerStart((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5204a0 c5204a0, String str) {
            super.setMask((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5204a0 c5204a0, ReadableArray readableArray) {
            super.setMatrix((RadialGradientManager) c5204a0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5204a0 c5204a0, String str) {
            super.setName((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((RadialGradientManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5204a0 c5204a0, String str) {
            super.setPointerEvents((RadialGradientManager) c5204a0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5204a0 c5204a0, boolean z) {
            super.setResponsible((RadialGradientManager) c5204a0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradient")
        public void setGradient(C5204a0 c5204a0, ReadableArray readableArray) {
            c5204a0.m25950n(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(C5204a0 c5204a0, ReadableArray readableArray) {
            c5204a0.m25949o(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(C5204a0 c5204a0, int i) {
            c5204a0.m25948p(i);
        }

        @ReactProp(name = "cx")
        public void setCx(C5204a0 c5204a0, Dynamic dynamic) {
            c5204a0.m25962b(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(C5204a0 c5204a0, Dynamic dynamic) {
            c5204a0.m25959e(dynamic);
        }

        @ReactProp(name = "fx")
        public void setFx(C5204a0 c5204a0, Dynamic dynamic) {
            c5204a0.m25956h(dynamic);
        }

        @ReactProp(name = "fy")
        public void setFy(C5204a0 c5204a0, Dynamic dynamic) {
            c5204a0.m25953k(dynamic);
        }

        @ReactProp(name = "rx")
        public void setRx(C5204a0 c5204a0, Dynamic dynamic) {
            c5204a0.m25947q(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(C5204a0 c5204a0, Dynamic dynamic) {
            c5204a0.m25944t(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setCx(C5204a0 c5204a0, String str) {
            c5204a0.m25960d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setCy(C5204a0 c5204a0, String str) {
            c5204a0.m25957g(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setFx(C5204a0 c5204a0, String str) {
            c5204a0.m25954j(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setFy(C5204a0 c5204a0, String str) {
            c5204a0.m25951m(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setRx(C5204a0 c5204a0, String str) {
            c5204a0.m25945s(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setRy(C5204a0 c5204a0, String str) {
            c5204a0.m25942v(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setCx(C5204a0 c5204a0, Double d) {
            c5204a0.m25961c(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setCy(C5204a0 c5204a0, Double d) {
            c5204a0.m25958f(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setFx(C5204a0 c5204a0, Double d) {
            c5204a0.m25955i(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setFy(C5204a0 c5204a0, Double d) {
            c5204a0.m25952l(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setRx(C5204a0 c5204a0, Double d) {
            c5204a0.m25946r(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public void setRy(C5204a0 c5204a0, Double d) {
            c5204a0.m25943u(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class RectViewManager extends RenderableViewManager<C5206b0> implements RNSVGRectManagerInterface<C5206b0> {
        public static final String REACT_CLASS = "RNSVGRect";

        public RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new RNSVGRectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5206b0 c5206b0, String str) {
            super.setClipPath((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5206b0 c5206b0, int i) {
            super.setClipRule((RectViewManager) c5206b0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5206b0 c5206b0, String str) {
            super.setDisplay((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5206b0 c5206b0, ReadableMap readableMap) {
            super.setFill((RectViewManager) c5206b0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5206b0 c5206b0, float f) {
            super.setFillOpacity((RectViewManager) c5206b0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5206b0 c5206b0, int i) {
            super.setFillRule((RectViewManager) c5206b0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5206b0 c5206b0, String str) {
            super.setMarkerEnd((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5206b0 c5206b0, String str) {
            super.setMarkerMid((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5206b0 c5206b0, String str) {
            super.setMarkerStart((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5206b0 c5206b0, String str) {
            super.setMask((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5206b0 c5206b0, ReadableArray readableArray) {
            super.setMatrix((RectViewManager) c5206b0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5206b0 c5206b0, String str) {
            super.setName((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((RectViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5206b0 c5206b0, String str) {
            super.setPointerEvents((RectViewManager) c5206b0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5206b0 c5206b0, ReadableArray readableArray) {
            super.setPropList((RectViewManager) c5206b0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5206b0 c5206b0, boolean z) {
            super.setResponsible((RectViewManager) c5206b0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5206b0 c5206b0, ReadableMap readableMap) {
            super.setStroke((RectViewManager) c5206b0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5206b0 c5206b0, ReadableArray readableArray) {
            super.setStrokeDasharray((RectViewManager) c5206b0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5206b0 c5206b0, float f) {
            super.setStrokeDashoffset((RectViewManager) c5206b0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5206b0 c5206b0, int i) {
            super.setStrokeLinecap((RectViewManager) c5206b0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5206b0 c5206b0, int i) {
            super.setStrokeLinejoin((RectViewManager) c5206b0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5206b0 c5206b0, float f) {
            super.setStrokeMiterlimit((RectViewManager) c5206b0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5206b0 c5206b0, float f) {
            super.setStrokeOpacity((RectViewManager) c5206b0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5206b0 c5206b0, Double d) {
            super.setStrokeWidth((RectViewManager) c5206b0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5206b0 c5206b0, int i) {
            super.setVectorEffect((RectViewManager) c5206b0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5206b0 c5206b0, String str) {
            super.setStrokeWidth((RectViewManager) c5206b0, str);
        }

        @ReactProp(name = "height")
        public void setHeight(C5206b0 c5206b0, Dynamic dynamic) {
            c5206b0.m25932b(dynamic);
        }

        @ReactProp(name = "rx")
        public void setRx(C5206b0 c5206b0, Dynamic dynamic) {
            c5206b0.m25929e(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(C5206b0 c5206b0, Dynamic dynamic) {
            c5206b0.m25926h(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5206b0 c5206b0, Dynamic dynamic) {
            c5206b0.m25923k(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5206b0 c5206b0, Dynamic dynamic) {
            c5206b0.m25920n(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5206b0 c5206b0, Dynamic dynamic) {
            c5206b0.m25917q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setHeight(C5206b0 c5206b0, String str) {
            c5206b0.m25930d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setRx(C5206b0 c5206b0, String str) {
            c5206b0.m25927g(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setRy(C5206b0 c5206b0, String str) {
            c5206b0.m25924j(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setWidth(C5206b0 c5206b0, String str) {
            c5206b0.m25921m(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setX(C5206b0 c5206b0, String str) {
            c5206b0.m25918p(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setY(C5206b0 c5206b0, String str) {
            c5206b0.m25915s(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setHeight(C5206b0 c5206b0, Double d) {
            c5206b0.m25931c(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setRx(C5206b0 c5206b0, Double d) {
            c5206b0.m25928f(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setRy(C5206b0 c5206b0, Double d) {
            c5206b0.m25925i(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setWidth(C5206b0 c5206b0, Double d) {
            c5206b0.m25922l(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setX(C5206b0 c5206b0, Double d) {
            c5206b0.m25919o(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public void setY(C5206b0 c5206b0, Double d) {
            c5206b0.m25916r(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class SymbolManager extends GroupViewManagerAbstract<C5210d0> implements RNSVGSymbolManagerInterface<C5210d0> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        public SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new RNSVGSymbolManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5210d0 c5210d0, String str) {
            super.setClipPath((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5210d0 c5210d0, int i) {
            super.setClipRule((SymbolManager) c5210d0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5210d0 c5210d0, String str) {
            super.setDisplay((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5210d0 c5210d0, ReadableMap readableMap) {
            super.setFill((SymbolManager) c5210d0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5210d0 c5210d0, float f) {
            super.setFillOpacity((SymbolManager) c5210d0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5210d0 c5210d0, int i) {
            super.setFillRule((SymbolManager) c5210d0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5210d0 c5210d0, ReadableMap readableMap) {
            super.setFont((SymbolManager) c5210d0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5210d0 c5210d0, Double d) {
            super.setFontSize((SymbolManager) c5210d0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5210d0 c5210d0, Double d) {
            super.setFontWeight((SymbolManager) c5210d0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5210d0 c5210d0, String str) {
            super.setMarkerEnd((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5210d0 c5210d0, String str) {
            super.setMarkerMid((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5210d0 c5210d0, String str) {
            super.setMarkerStart((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5210d0 c5210d0, String str) {
            super.setMask((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5210d0 c5210d0, ReadableArray readableArray) {
            super.setMatrix((SymbolManager) c5210d0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5210d0 c5210d0, String str) {
            super.setName((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((SymbolManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5210d0 c5210d0, String str) {
            super.setPointerEvents((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5210d0 c5210d0, ReadableArray readableArray) {
            super.setPropList((SymbolManager) c5210d0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5210d0 c5210d0, boolean z) {
            super.setResponsible((SymbolManager) c5210d0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5210d0 c5210d0, ReadableMap readableMap) {
            super.setStroke((SymbolManager) c5210d0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5210d0 c5210d0, ReadableArray readableArray) {
            super.setStrokeDasharray((SymbolManager) c5210d0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5210d0 c5210d0, float f) {
            super.setStrokeDashoffset((SymbolManager) c5210d0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5210d0 c5210d0, int i) {
            super.setStrokeLinecap((SymbolManager) c5210d0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5210d0 c5210d0, int i) {
            super.setStrokeLinejoin((SymbolManager) c5210d0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5210d0 c5210d0, float f) {
            super.setStrokeMiterlimit((SymbolManager) c5210d0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5210d0 c5210d0, float f) {
            super.setStrokeOpacity((SymbolManager) c5210d0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5210d0 c5210d0, Double d) {
            super.setStrokeWidth((SymbolManager) c5210d0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5210d0 c5210d0, int i) {
            super.setVectorEffect((SymbolManager) c5210d0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "align")
        public void setAlign(C5210d0 c5210d0, String str) {
            c5210d0.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5210d0 c5210d0, String str) {
            super.setFontSize((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5210d0 c5210d0, String str) {
            super.setFontWeight((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C5210d0 c5210d0, int i) {
            c5210d0.setMeetOrSlice(i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(C5210d0 c5210d0, float f) {
            c5210d0.setMinX(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(C5210d0 c5210d0, float f) {
            c5210d0.setMinY(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5210d0 c5210d0, String str) {
            super.setStrokeWidth((SymbolManager) c5210d0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(C5210d0 c5210d0, float f) {
            c5210d0.setVbHeight(f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(C5210d0 c5210d0, float f) {
            c5210d0.setVbWidth(f);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class TSpanViewManager extends TextViewManagerAbstract<C5216g0> implements RNSVGTSpanManagerInterface<C5216g0> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        public TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new RNSVGTSpanManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(C5216g0 c5216g0, String str) {
            super.setAlignmentBaseline((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5216g0 c5216g0, Double d) {
            super.setBaselineShift((TSpanViewManager) c5216g0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5216g0 c5216g0, String str) {
            super.setClipPath((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5216g0 c5216g0, int i) {
            super.setClipRule((TSpanViewManager) c5216g0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5216g0 c5216g0, String str) {
            super.setDisplay((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setDx(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setDx((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setDy(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setDy((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5216g0 c5216g0, ReadableMap readableMap) {
            super.setFill((TSpanViewManager) c5216g0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5216g0 c5216g0, float f) {
            super.setFillOpacity((TSpanViewManager) c5216g0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5216g0 c5216g0, int i) {
            super.setFillRule((TSpanViewManager) c5216g0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5216g0 c5216g0, ReadableMap readableMap) {
            super.setFont((TSpanViewManager) c5216g0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5216g0 c5216g0, Double d) {
            super.setFontSize((TSpanViewManager) c5216g0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5216g0 c5216g0, Double d) {
            super.setFontWeight((TSpanViewManager) c5216g0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5216g0 c5216g0, Double d) {
            super.setInlineSize((TSpanViewManager) c5216g0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(C5216g0 c5216g0, String str) {
            super.setLengthAdjust((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5216g0 c5216g0, String str) {
            super.setMarkerEnd((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5216g0 c5216g0, String str) {
            super.setMarkerMid((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5216g0 c5216g0, String str) {
            super.setMarkerStart((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5216g0 c5216g0, String str) {
            super.setMask((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setMatrix((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5216g0 c5216g0, String str) {
            super.setName((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TSpanViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5216g0 c5216g0, String str) {
            super.setPointerEvents((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setPropList((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5216g0 c5216g0, boolean z) {
            super.setResponsible((TSpanViewManager) c5216g0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setRotate(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setRotate((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5216g0 c5216g0, ReadableMap readableMap) {
            super.setStroke((TSpanViewManager) c5216g0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setStrokeDasharray((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5216g0 c5216g0, float f) {
            super.setStrokeDashoffset((TSpanViewManager) c5216g0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5216g0 c5216g0, int i) {
            super.setStrokeLinecap((TSpanViewManager) c5216g0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5216g0 c5216g0, int i) {
            super.setStrokeLinejoin((TSpanViewManager) c5216g0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5216g0 c5216g0, float f) {
            super.setStrokeMiterlimit((TSpanViewManager) c5216g0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5216g0 c5216g0, float f) {
            super.setStrokeOpacity((TSpanViewManager) c5216g0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5216g0 c5216g0, Double d) {
            super.setStrokeWidth((TSpanViewManager) c5216g0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5216g0 c5216g0, Double d) {
            super.setTextLength((TSpanViewManager) c5216g0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5216g0 c5216g0, int i) {
            super.setVectorEffect((TSpanViewManager) c5216g0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(C5216g0 c5216g0, String str) {
            super.setVerticalAlign((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setX(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setX((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setY(C5216g0 c5216g0, ReadableArray readableArray) {
            super.setY((TSpanViewManager) c5216g0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5216g0 c5216g0, String str) {
            super.setBaselineShift((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "content")
        public void setContent(C5216g0 c5216g0, String str) {
            c5216g0.m25892U(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5216g0 c5216g0, String str) {
            super.setFontSize((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5216g0 c5216g0, String str) {
            super.setFontWeight((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5216g0 c5216g0, String str) {
            super.setInlineSize((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5216g0 c5216g0, String str) {
            super.setStrokeWidth((TSpanViewManager) c5216g0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5216g0 c5216g0, String str) {
            super.setTextLength((TSpanViewManager) c5216g0, str);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTSpanManagerDelegate(this);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class TextPathViewManager extends TextViewManagerAbstract<C5220h0> implements RNSVGTextPathManagerInterface<C5220h0> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        public TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(C5220h0 c5220h0, String str) {
            super.setAlignmentBaseline((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5220h0 c5220h0, Double d) {
            super.setBaselineShift((TextPathViewManager) c5220h0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5220h0 c5220h0, String str) {
            super.setClipPath((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5220h0 c5220h0, int i) {
            super.setClipRule((TextPathViewManager) c5220h0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5220h0 c5220h0, String str) {
            super.setDisplay((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setDx(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setDx((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setDy(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setDy((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5220h0 c5220h0, ReadableMap readableMap) {
            super.setFill((TextPathViewManager) c5220h0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5220h0 c5220h0, float f) {
            super.setFillOpacity((TextPathViewManager) c5220h0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5220h0 c5220h0, int i) {
            super.setFillRule((TextPathViewManager) c5220h0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5220h0 c5220h0, ReadableMap readableMap) {
            super.setFont((TextPathViewManager) c5220h0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5220h0 c5220h0, Double d) {
            super.setFontSize((TextPathViewManager) c5220h0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5220h0 c5220h0, Double d) {
            super.setFontWeight((TextPathViewManager) c5220h0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5220h0 c5220h0, Double d) {
            super.setInlineSize((TextPathViewManager) c5220h0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(C5220h0 c5220h0, String str) {
            super.setLengthAdjust((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5220h0 c5220h0, String str) {
            super.setMarkerEnd((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5220h0 c5220h0, String str) {
            super.setMarkerMid((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5220h0 c5220h0, String str) {
            super.setMarkerStart((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5220h0 c5220h0, String str) {
            super.setMask((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setMatrix((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5220h0 c5220h0, String str) {
            super.setName((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TextPathViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5220h0 c5220h0, String str) {
            super.setPointerEvents((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setPropList((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5220h0 c5220h0, boolean z) {
            super.setResponsible((TextPathViewManager) c5220h0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setRotate(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setRotate((TextPathViewManager) c5220h0, readableArray);
        }

        @ReactProp(name = "midLine")
        public void setSharp(C5220h0 c5220h0, String str) {
            c5220h0.m25877S(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5220h0 c5220h0, ReadableMap readableMap) {
            super.setStroke((TextPathViewManager) c5220h0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setStrokeDasharray((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5220h0 c5220h0, float f) {
            super.setStrokeDashoffset((TextPathViewManager) c5220h0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5220h0 c5220h0, int i) {
            super.setStrokeLinecap((TextPathViewManager) c5220h0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5220h0 c5220h0, int i) {
            super.setStrokeLinejoin((TextPathViewManager) c5220h0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5220h0 c5220h0, float f) {
            super.setStrokeMiterlimit((TextPathViewManager) c5220h0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5220h0 c5220h0, float f) {
            super.setStrokeOpacity((TextPathViewManager) c5220h0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5220h0 c5220h0, Double d) {
            super.setStrokeWidth((TextPathViewManager) c5220h0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5220h0 c5220h0, Double d) {
            super.setTextLength((TextPathViewManager) c5220h0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5220h0 c5220h0, int i) {
            super.setVectorEffect((TextPathViewManager) c5220h0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(C5220h0 c5220h0, String str) {
            super.setVerticalAlign((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setX(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setX((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setY(C5220h0 c5220h0, ReadableArray readableArray) {
            super.setY((TextPathViewManager) c5220h0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5220h0 c5220h0, String str) {
            super.setBaselineShift((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5220h0 c5220h0, String str) {
            super.setFontSize((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5220h0 c5220h0, String str) {
            super.setFontWeight((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "href")
        public void setHref(C5220h0 c5220h0, String str) {
            c5220h0.m25878R(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5220h0 c5220h0, String str) {
            super.setInlineSize((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public void setMidLine(C5220h0 c5220h0, String str) {
            c5220h0.m25877S(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "side")
        public void setSide(C5220h0 c5220h0, String str) {
            c5220h0.m25876T(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "spacing")
        public void setSpacing(C5220h0 c5220h0, String str) {
            c5220h0.m25875U(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5220h0 c5220h0, String str) {
            super.setStrokeWidth((TextPathViewManager) c5220h0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5220h0 c5220h0, String str) {
            super.setTextLength((TextPathViewManager) c5220h0, str);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @ReactProp(name = "method")
        public void setMethod(C5220h0 c5220h0, String str) {
            c5220h0.mo25721C(str);
        }

        @ReactProp(name = "startOffset")
        public void setStartOffset(C5220h0 c5220h0, Dynamic dynamic) {
            c5220h0.m25874V(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public void setStartOffset(C5220h0 c5220h0, String str) {
            c5220h0.m25872X(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public void setStartOffset(C5220h0 c5220h0, Double d) {
            c5220h0.m25873W(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class TextViewManager extends TextViewManagerAbstract<C5244t0> implements RNSVGTextManagerInterface<C5244t0> {
        public static final String REACT_CLASS = "RNSVGText";

        public TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new RNSVGTextManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(C5244t0 c5244t0, String str) {
            super.setAlignmentBaseline((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5244t0 c5244t0, Double d) {
            super.setBaselineShift((TextViewManager) c5244t0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5244t0 c5244t0, String str) {
            super.setClipPath((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5244t0 c5244t0, int i) {
            super.setClipRule((TextViewManager) c5244t0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5244t0 c5244t0, String str) {
            super.setDisplay((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setDx(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setDx((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setDy(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setDy((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5244t0 c5244t0, ReadableMap readableMap) {
            super.setFill((TextViewManager) c5244t0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5244t0 c5244t0, float f) {
            super.setFillOpacity((TextViewManager) c5244t0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5244t0 c5244t0, int i) {
            super.setFillRule((TextViewManager) c5244t0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5244t0 c5244t0, ReadableMap readableMap) {
            super.setFont((TextViewManager) c5244t0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5244t0 c5244t0, Double d) {
            super.setFontSize((TextViewManager) c5244t0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5244t0 c5244t0, Double d) {
            super.setFontWeight((TextViewManager) c5244t0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5244t0 c5244t0, Double d) {
            super.setInlineSize((TextViewManager) c5244t0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(C5244t0 c5244t0, String str) {
            super.setLengthAdjust((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5244t0 c5244t0, String str) {
            super.setMarkerEnd((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5244t0 c5244t0, String str) {
            super.setMarkerMid((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5244t0 c5244t0, String str) {
            super.setMarkerStart((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5244t0 c5244t0, String str) {
            super.setMask((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setMatrix((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5244t0 c5244t0, String str) {
            super.setName((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((TextViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5244t0 c5244t0, String str) {
            super.setPointerEvents((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setPropList((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5244t0 c5244t0, boolean z) {
            super.setResponsible((TextViewManager) c5244t0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setRotate(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setRotate((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5244t0 c5244t0, ReadableMap readableMap) {
            super.setStroke((TextViewManager) c5244t0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setStrokeDasharray((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5244t0 c5244t0, float f) {
            super.setStrokeDashoffset((TextViewManager) c5244t0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5244t0 c5244t0, int i) {
            super.setStrokeLinecap((TextViewManager) c5244t0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5244t0 c5244t0, int i) {
            super.setStrokeLinejoin((TextViewManager) c5244t0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5244t0 c5244t0, float f) {
            super.setStrokeMiterlimit((TextViewManager) c5244t0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5244t0 c5244t0, float f) {
            super.setStrokeOpacity((TextViewManager) c5244t0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5244t0 c5244t0, Double d) {
            super.setStrokeWidth((TextViewManager) c5244t0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5244t0 c5244t0, Double d) {
            super.setTextLength((TextViewManager) c5244t0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5244t0 c5244t0, int i) {
            super.setVectorEffect((TextViewManager) c5244t0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(C5244t0 c5244t0, String str) {
            super.setVerticalAlign((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setX(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setX((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setY(C5244t0 c5244t0, ReadableArray readableArray) {
            super.setY((TextViewManager) c5244t0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setBaselineShift(C5244t0 c5244t0, String str) {
            super.setBaselineShift((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontSize(C5244t0 c5244t0, String str) {
            super.setFontSize((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setFontWeight(C5244t0 c5244t0, String str) {
            super.setFontWeight((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setInlineSize(C5244t0 c5244t0, String str) {
            super.setInlineSize((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5244t0 c5244t0, String str) {
            super.setStrokeWidth((TextViewManager) c5244t0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setTextLength(C5244t0 c5244t0, String str) {
            super.setTextLength((TextViewManager) c5244t0, str);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTextManagerDelegate(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class TextViewManagerAbstract<K extends C5244t0> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public void setAlignmentBaseline(K k, String str) {
            k.mo25721C(str);
        }

        @ReactProp(name = "baselineShift")
        public void setBaselineShift(K k, Dynamic dynamic) {
            k.m25702r(dynamic);
        }

        @ReactProp(name = "dx")
        public void setDeltaX(K k, Dynamic dynamic) {
            k.m25699u(dynamic);
        }

        @ReactProp(name = "dy")
        public void setDeltaY(K k, Dynamic dynamic) {
            k.m25697w(dynamic);
        }

        public void setDx(K k, ReadableArray readableArray) {
            k.m25698v(readableArray);
        }

        public void setDy(K k, ReadableArray readableArray) {
            k.m25696x(readableArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C5227l c5227l, ReadableMap readableMap) {
            setFont((TextViewManagerAbstract<K>) ((C5244t0) c5227l), readableMap);
        }

        @ReactProp(name = "inlineSize")
        public void setInlineSize(K k, Dynamic dynamic) {
            k.m25695y(dynamic);
        }

        @ReactProp(name = "lengthAdjust")
        public void setLengthAdjust(K k, String str) {
            k.m25722B(str);
        }

        @ReactProp(name = "alignmentBaseline")
        public void setMethod(K k, String str) {
            k.mo25721C(str);
        }

        @ReactProp(name = "rotate")
        public void setRotate(K k, Dynamic dynamic) {
            k.m25716H(dynamic);
        }

        @ReactProp(name = "textLength")
        public void setTextLength(K k, Dynamic dynamic) {
            k.m25714J(dynamic);
        }

        @ReactProp(name = "verticalAlign")
        public void setVerticalAlign(K k, String str) {
            k.m25711M(str);
        }

        @ReactProp(name = "x")
        public void setX(K k, Dynamic dynamic) {
            k.m25720D(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(K k, Dynamic dynamic) {
            k.m25718F(dynamic);
        }

        public void setBaselineShift(K k, String str) {
            k.m25700t(str);
        }

        @ReactProp(name = "font")
        public void setFont(K k, ReadableMap readableMap) {
            k.m25831j(readableMap);
        }

        public void setInlineSize(K k, String str) {
            k.m25723A(str);
        }

        public void setRotate(K k, ReadableArray readableArray) {
            k.m25715I(readableArray);
        }

        public void setTextLength(K k, String str) {
            k.m25712L(str);
        }

        public void setX(K k, ReadableArray readableArray) {
            k.m25719E(readableArray);
        }

        public void setY(K k, ReadableArray readableArray) {
            k.m25717G(readableArray);
        }

        public void setBaselineShift(K k, Double d) {
            k.m25701s(d);
        }

        public void setInlineSize(K k, Double d) {
            k.m25694z(d);
        }

        public void setTextLength(K k, Double d) {
            k.m25713K(d);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class UseViewManager extends RenderableViewManager<C5246u0> implements RNSVGUseManagerInterface<C5246u0> {
        public static final String REACT_CLASS = "RNSVGUse";

        public UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new RNSVGUseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C5246u0 c5246u0, String str) {
            super.setClipPath((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C5246u0 c5246u0, int i) {
            super.setClipRule((UseViewManager) c5246u0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C5246u0 c5246u0, String str) {
            super.setDisplay((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setFill(C5246u0 c5246u0, ReadableMap readableMap) {
            super.setFill((UseViewManager) c5246u0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C5246u0 c5246u0, float f) {
            super.setFillOpacity((UseViewManager) c5246u0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C5246u0 c5246u0, int i) {
            super.setFillRule((UseViewManager) c5246u0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C5246u0 c5246u0, String str) {
            super.setMarkerEnd((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C5246u0 c5246u0, String str) {
            super.setMarkerMid((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C5246u0 c5246u0, String str) {
            super.setMarkerStart((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C5246u0 c5246u0, String str) {
            super.setMask((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C5246u0 c5246u0, ReadableArray readableArray) {
            super.setMatrix((UseViewManager) c5246u0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ZeroconfModule.KEY_SERVICE_NAME)
        public /* bridge */ /* synthetic */ void setName(C5246u0 c5246u0, String str) {
            super.setName((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((UseViewManager) ((VirtualView) view), f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C5246u0 c5246u0, String str) {
            super.setPointerEvents((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C5246u0 c5246u0, ReadableArray readableArray) {
            super.setPropList((UseViewManager) c5246u0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C5246u0 c5246u0, boolean z) {
            super.setResponsible((UseViewManager) c5246u0, z);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setStroke(C5246u0 c5246u0, ReadableMap readableMap) {
            super.setStroke((UseViewManager) c5246u0, readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C5246u0 c5246u0, ReadableArray readableArray) {
            super.setStrokeDasharray((UseViewManager) c5246u0, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C5246u0 c5246u0, float f) {
            super.setStrokeDashoffset((UseViewManager) c5246u0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C5246u0 c5246u0, int i) {
            super.setStrokeLinecap((UseViewManager) c5246u0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C5246u0 c5246u0, int i) {
            super.setStrokeLinejoin((UseViewManager) c5246u0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C5246u0 c5246u0, float f) {
            super.setStrokeMiterlimit((UseViewManager) c5246u0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C5246u0 c5246u0, float f) {
            super.setStrokeOpacity((UseViewManager) c5246u0, f);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5246u0 c5246u0, Double d) {
            super.setStrokeWidth((UseViewManager) c5246u0, d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C5246u0 c5246u0, int i) {
            super.setVectorEffect((UseViewManager) c5246u0, i);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "href")
        public void setHref(C5246u0 c5246u0, String str) {
            c5246u0.m25689e(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setStrokeWidth(C5246u0 c5246u0, String str) {
            super.setStrokeWidth((UseViewManager) c5246u0, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setHeight(C5246u0 c5246u0, String str) {
            c5246u0.m25690d(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setWidth(C5246u0 c5246u0, Double d) {
            c5246u0.m25687g(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setX(C5246u0 c5246u0, String str) {
            c5246u0.m25683k(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setY(C5246u0 c5246u0, String str) {
            c5246u0.m25680n(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setHeight(C5246u0 c5246u0, Double d) {
            c5246u0.m25691c(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setWidth(C5246u0 c5246u0, String str) {
            c5246u0.m25686h(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setX(C5246u0 c5246u0, Double d) {
            c5246u0.m25684j(d);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public void setY(C5246u0 c5246u0, Double d) {
            c5246u0.m25681m(d);
        }

        @ReactProp(name = "height")
        public void setHeight(C5246u0 c5246u0, Dynamic dynamic) {
            c5246u0.m25692b(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(C5246u0 c5246u0, Dynamic dynamic) {
            c5246u0.m25688f(dynamic);
        }

        @ReactProp(name = "x")
        public void setX(C5246u0 c5246u0, Dynamic dynamic) {
            c5246u0.m25685i(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(C5246u0 c5246u0, Dynamic dynamic) {
            c5246u0.m25682l(dynamic);
        }
    }

    /* renamed from: com.horcrux.svg.RenderableViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C5168a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14533a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f14533a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14533a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @ReactProp(name = "fill")
    public void setFill(T t, Dynamic dynamic) {
        t.setFill(dynamic);
    }

    @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t, float f) {
        t.setFillOpacity(f);
    }

    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t, int i) {
        t.setFillRule(i);
    }

    @ReactProp(name = "propList")
    public void setPropList(T t, ReadableArray readableArray) {
        t.setPropList(readableArray);
    }

    @ReactProp(name = "stroke")
    public void setStroke(T t, Dynamic dynamic) {
        t.setStroke(dynamic);
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(T t, ReadableArray readableArray) {
        t.setStrokeDasharray(readableArray);
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t, float f) {
        t.setStrokeDashoffset(f);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t, int i) {
        t.setStrokeLinecap(i);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t, int i) {
        t.setStrokeLinejoin(i);
    }

    @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t, float f) {
        t.setStrokeMiterlimit(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t, float f) {
        t.setStrokeOpacity(f);
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(T t, Dynamic dynamic) {
        t.setStrokeWidth(dynamic);
    }

    @ReactProp(name = "vectorEffect")
    public void setVectorEffect(T t, int i) {
        t.setVectorEffect(i);
    }

    public void setFill(T t, ReadableMap readableMap) {
        t.setFill(readableMap);
    }

    public void setStroke(T t, ReadableMap readableMap) {
        t.setStroke(readableMap);
    }

    public void setStrokeWidth(T t, String str) {
        t.setStrokeWidth(str);
    }

    public void setStrokeWidth(T t, Double d) {
        t.setStrokeWidth(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class GroupViewManagerAbstract<U extends C5227l> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "font")
        public void setFont(U u, ReadableMap readableMap) {
            u.m25831j(readableMap);
        }

        @ReactProp(name = ViewProps.FONT_SIZE)
        public void setFontSize(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = C5168a.f14533a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_SIZE, dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_SIZE, dynamic.asString());
            }
            u.m25831j(javaOnlyMap);
        }

        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public void setFontWeight(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = C5168a.f14533a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_WEIGHT, dynamic.asString());
            }
            u.m25831j(javaOnlyMap);
        }

        public void setFontSize(U u, String str) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString(ViewProps.FONT_SIZE, str);
            u.m25831j(javaOnlyMap);
        }

        public void setFontWeight(U u, String str) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString(ViewProps.FONT_WEIGHT, str);
            u.m25831j(javaOnlyMap);
        }

        public void setFontSize(U u, Double d) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble(ViewProps.FONT_SIZE, d.doubleValue());
            u.m25831j(javaOnlyMap);
        }

        public void setFontWeight(U u, Double d) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, d.doubleValue());
            u.m25831j(javaOnlyMap);
        }
    }
}