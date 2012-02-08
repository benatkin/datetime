(ns date-service.test.endpoints
  (:use clojure.test
        ring.mock.request
        date-service.endpoints))

(deftest test-current-time
  (is (= (:status (current-time)) 200)))

(deftest test-not-found
  (is (= (:status (not-found)) 404)))