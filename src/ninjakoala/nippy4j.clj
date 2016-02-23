(ns ninjakoala.nippy4j
  (:require [taoensso.nippy :as nippy]
            [taoensso.nippy.tools :as nippy-tools])
  (:import [java.nio ByteBuffer]))

(gen-class
 :name com.ninjakoala.nippy4j.Nippy4J
 :methods [^{:static true} [freeze [String] java.nio.ByteBuffer]
           ^{:static true} [thaw [java.nio.ByteBuffer] String]])

(def ^:private freeze*
  (comp #(ByteBuffer/wrap %) nippy-tools/freeze))

(defn -freeze
  ^ByteBuffer [^String x]
  (freeze* x))

(defn -thaw
  ^String [^ByteBuffer bytes]
  (nippy/thaw (.array bytes)))
