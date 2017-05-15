(defproject npm-module-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license
  {:name "Eclipse Public License"
   :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  [[org.clojure/clojure "1.9.0-alpha16"]
   [thheller/shadow-devtools "1.0.20170515"]]

  :source-paths
  ["src-cljs"]

  :aliases
  {"cljs-watch"
   ["run" "-m" "shadow.npm.cli" "--watch"]
   "cljs"
   ["run" "-m" "shadow.npm.cli"]})

