(defproject date-service "0.0.1-SNAPSHOT"
  :description "A document-oriented content management system"
  :license {:name "MIT License"
            :url  "http://www.opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :main date-service.server
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring "1.0.1"]
                 [cheshire "2.2.0"]
                 [hiccup "0.3.8"]
                 [clj-time "0.3.5"]
                 [clout "1.0.1"]]
  :dev-dependencies [[codox "0.4.0"]
                     [ring-mock "0.1.1"]])