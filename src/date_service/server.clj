(ns date-service.server
  (:use ring.adapter.jetty)
  (:use [date-service.routes :only (route)])
  (:use [date-service.util :only (env read-positive-number)]))

(defn app [req]
  (let [[endpoint args] (route req)]
    (apply endpoint args)))

(defn -main []
  (run-jetty app {:port (read-positive-number (env :port))}))