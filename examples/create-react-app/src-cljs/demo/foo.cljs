(ns demo.foo
  (:require [shadow.npm :as npm]))

(def react (npm/require "react"))

;; imagine you were using reagent, om, whatever here.

(defn demo []
  (.. react (createElement "h1" nil "Hello World")))
