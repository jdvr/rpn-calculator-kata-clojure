(ns rpn-kata-clojure.core-test
  (:require [clojure.test :refer :all]
            [rpn-kata-clojure.core :refer :all]))

(deftest a-test
  (testing "given a digit should return the same digit"
    (is (= '(1) (rpn '(1))))
    )
  )
