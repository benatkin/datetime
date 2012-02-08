(ns date-service.routes
  (:use clout.core)
  (:require [date-service.endpoints :as endpoints]))

(def root-route (route-compile "/"))

(defn route [req]
  (cond
   (route-matches root-route req) [endpoints/current-time]
   :else [endpoints/not-found]))