(defproject com.ninjakoala/nippy4j "1.0.1-SNAPSHOT"
  :description "Java wrapper for Nippy"
  :url "https://github.com/ninjakoala/nippy4j"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.taoensso/nippy "2.13.0"]
                 [org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[com.taoensso/faraday "1.9.0"]
                                  [midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]]}}
  :aliases {"test" ["midje"]}
  :aot [ninjakoala.nippy4j]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy" "clojars"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]])
