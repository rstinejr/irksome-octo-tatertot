(ns optimal-stops.penalty-test
  (:require [clojure.test          :refer :all]
            [optimal-stops.penalty :as penalty]))

(def some-stops [0 130 270 450])

(deftest simple-same-point-tests
  (testing "same point"
    (loop [i 0]
      (when (< i (count some-stops))
        (is (= 40000 (penalty/cost i i some-stops)))
        (recur (inc i))))))

(deftest diff-point-tests
  (testing "different points"
    (is (= (* 70 70)   (penalty/cost 0 1 some-stops)))
    (is (= (* 70 70)   (penalty/cost 0 2 some-stops)))
    (is (= (* 60 60) (penalty/cost 1 2 some-stops)))
    (is (= (* 250 250) (penalty/cost 0 3 some-stops)))))
   
