(ns date-service.test.util
  (:use clojure.test
        date-service.util))

(deftest test-read-positive-number
  (is (= (read-positive-number "8080")) 8080)
  (is (= (read-positive-number " 9 ")) nil))