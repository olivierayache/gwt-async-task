/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ayache.gwt.async.task.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Ayache
 * @param <T>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Reflect<T> {

    static class Helper {

        @JsProperty(namespace = JsPackage.GLOBAL, name = "Reflect")
        static native <T> Reflect<T> getReflect();
    }

    T construct(Object cls, Object[] args);

    <O> O get(T object, String key);

    boolean set(T object, String key, Object value);
}
