(defproject clojure.realworld/user "0.1"
  :description "user component"
  :dependencies [[clj-jwt "0.1.1"]
                 [crypto-password "0.2.0"]
                 [environ "1.1.0"]
                 [honeysql "0.9.2"]
                 [clojure.realworld/interfaces "1.0"]
                 [metosin/spec-tools "0.6.1"]
                 [org.clojure/clojure "1.10.0"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [org.xerial/sqlite-jdbc "3.7.2"]]
  :aot :all)
