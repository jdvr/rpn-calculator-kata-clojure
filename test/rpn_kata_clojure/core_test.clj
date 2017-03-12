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
  (testing "given an operation with two digits should return the result of the operation with digits"
    (is (= '(3) (rpn '(1 2 +))))
    (is (= '(3) (rpn '(5 2 -))))
    (is (= '(6) (rpn '(3 2 *))))
    (is (= '(6) (rpn '(12 2 /)))))
  )

(deftest given-combined-operators
  (testing "given a cobined operators should apply each operation with his operands and return the result"
    (is (= '(9) (rpn '(1 2 + 3 *))))
    )
  )

(deftest suggested-test-cases
  (testing "check the given scenarios"
    (is (= '(4) (rpn '(20 5 /))))
    (is (= '(3) (rpn '(4 2 + 3 -))))
    (is (= '(141) (rpn '(3 5 8 * 7 + *))))
    (is (= '(5 3 4) (rpn '(7 2 - 3 4))))
    )
  )
