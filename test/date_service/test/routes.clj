(ns date-service.test.routes
  (:use clojure.test
        ring.mock.request
        date-service.routes)
  (:require [date-service.endpoints :as endpoints]))

(deftest test-root-route
  (is (= (route (request :get "/")) [endpoints/current-time])))

(deftest test-not-found
  (is (= (route (request :get "/nothing-here")) [endpoints/not-found])))