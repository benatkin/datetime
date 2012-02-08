(ns date-service.util
  (:use [clojure.string :only (upper-case)]))

(defn read-positive-number [string]
  (if (re-matches #"\d+" string) (read-string string)))

(defn env [kw]
  (System/getenv (clojure.string/replace (upper-case (name kw)) \- \_)))