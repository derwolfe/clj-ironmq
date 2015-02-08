(defproject clj-ironmq "0.1.1-SNAPSHOT"
  :description "A Clojure library for intercommunication with IronMQ v3 API."
  :url "https://github.com/efficiosro/clj-ironmq"
  :scm {:name "git", :url "https://github.com/efficiosro/clj-ironmq"}
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :min-lein-version "2.0.0"
  :dependencies [[cheshire "5.4.0"]
                 [clj-http "1.0.1"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha5"]]}}
  :aliases {"all" ["with-profile" "dev,1.5:dev:dev,1.7"]}
  :signing {:gpg-key "Yury Yantsevich (Efficio s.r.o.) <yury@efficio.cz>"})
