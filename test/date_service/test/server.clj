(ns date-service.test.server
  (:use clojure.test
        ring.mock.request
        date-service.server))

(deftest test-root-route
  (is (= (:status (app (request :get "/"))) 200)))
