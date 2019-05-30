(defproject clojure.realworld/development "1.0"
  :description "The main development environment"
  :profiles {:dev {:plugins      [[lein-ring "0.12.5"]]
                   :dependencies [[ring/ring-mock "0.4.0"]]
                   :test-paths   ["test"]}}
  :dependencies [[clj-jwt "0.1.1"]
                 [clj-time "0.14.2"]
                 [com.taoensso/timbre "4.10.0"]
                 [compojure "1.6.0"]
                 [crypto-password "0.2.0"]
                 [environ "1.1.0"]
                 [honeysql "0.9.2"]
                 [metosin/spec-tools "0.6.1"]
                 [org.clojure/clojure "1.10.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [org.clojure/test.check "0.9.0"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [ring-logger-timbre "0.7.6"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [ring/ring-json "0.5.0-beta1"]
                 [slugger "1.0.1"]]
  :ring {:init    clojure.realworld.rest-api.api/init
         :destroy clojure.realworld.rest-api.api/destroy
         :handler clojure.realworld.rest-api.api/app
         :port    6003})
