(ns rpn-kata-clojure.core-test
  (:require [clojure.test :refer :all]
            [rpn-kata-clojure.core :refer :all]))

(deftest given-digits
  (testing "given a digit should return the same digit"
    (is (= '(1) (rpn '(1))))
    )

  (testing "given three digit without operation should return the input"
    (is (= '(1 2) (rpn '(1 2))))
    )
  )

(deftest given-simple-operation
  (testing "given a sum with two digits should return the sum of digits"
    (is (= '(3) (rpn '(1 2 +))))
    )

  )
