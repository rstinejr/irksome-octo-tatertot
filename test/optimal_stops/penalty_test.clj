(ns optimal-stops.penalty-test
  (:require [clojure.test          :refer :all]
            [optimal-stops.penalty :as penalty]))

(def some-stops [0 130 270 450])

(deftest simple-tests
  (testing "same point"
    (loop [i 0]
      (when (< i (count some-stops))
        (is (= 0 (penalty/cost i i some-stops)))
        (recur (inc i))))))
