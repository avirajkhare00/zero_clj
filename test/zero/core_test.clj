(ns zero.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [zero.core :refer [-main]]))

(deftest a-test
  (testing "Print Hello World!"
    (is (= (-main) "Hello World!"))))
