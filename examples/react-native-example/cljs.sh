#!/bin/sh

java -cp ../../shadow-cljs.jar:src-cljs clojure.main -m shadow.npm.cli $@
