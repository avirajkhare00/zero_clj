(ns zero.double-trouble-test
  (:require [clojure.test :refer [deftest is testing]]
            [zero.double-trouble :refer [double-trouble]]))

(deftest a-test
  (testing "should double given positive number"
    (is (= (double-trouble 2) 4))))

(deftest b-test
  (testing "should double given negative number"
    (is (= (double-trouble -2) -4))))

(deftest c-test
  (testing "0 should give out 0"
    (is (= (double-trouble 0) 0))))
