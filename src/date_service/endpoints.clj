(ns date-service.endpoints
  (:use date-service.views)
  (:require clj-time.core))

(defn current-time []
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body (plain-time (clj-time.core/now))})

(defn not-found []
  {:status  404
   :headers {"Content-Type" "text/plain"}
   :body "Not found."})