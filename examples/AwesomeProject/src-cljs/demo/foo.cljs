(ns demo.foo
  (:require [goog.object :as gobj]))

(def React (js/require "react"))
(def RN (js/require "react-native"))

(def Text (-> RN .-Text))

(def style-fn (-> RN .-StyleSheet .-create))

(def style
  (-> {:test {:color "red"}}
      (clj->js)
      (style-fn)
      (gobj/get "test")))

(defn foo []
  (.. React (createElement Text #js {:style style} "Hello from CLJS!")))