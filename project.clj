(defproject helda-owgame "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [clj-http "2.3.0"]
    [cheshire "5.5.0"]
    [http-kit "2.1.19"]
    [com.stuartsierra/component "0.3.1"]
    [reloaded.repl "0.2.2"]
    [metosin/palikka "0.5.1"]
    [metosin/kekkonen "0.3.2"]
    [environ "1.0.0"]
    [org.clojure/tools.trace "0.7.9"]
    ]
  :main ^:skip-aot helda-owgame.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
