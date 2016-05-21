(defproject com.ninjakoala/nippy4j "1.0.0-SNAPSHOT"
  :description "Java wrapper for Nippy"
  :dependencies [[com.taoensso/nippy "2.11.1"]
                 [org.clojure/clojure "1.7.0"]]
  :exclusions [org.clojure/clojure]
  :profiles {:dev {:dependencies [[com.taoensso/faraday "1.8.0"]]
                   :plugins [[lein-release "1.0.5"]]}}
  :aot [ninjakoala.nippy4j]
  :lein-release {:deploy-via :clojars
                 :clojars-url "clojars@clojars.brislabs.com:"})
