(ns date-service.test.views
  (:use clojure.test
        date-service.views)
  (:require clj-time.core))

(deftest test-plain-time
  (is (re-matches #".*Current.*content.*T.*Z.*" (plain-time (clj-time.core/now)))))
