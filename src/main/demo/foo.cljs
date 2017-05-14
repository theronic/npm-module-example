(ns demo.foo
  (:require [shadow.npm :as npm]))

(def x (npm/require-file "lib/bar"))

(def react (npm/require "react"))

(defn hello [who]
  (js/console.log "hello from CLJS!" x (.. react (createElement "h1" nil "hello world")))
  (str "Hello, " who "!"))